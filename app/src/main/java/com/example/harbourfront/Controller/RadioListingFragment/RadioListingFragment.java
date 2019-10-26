package com.example.harbourfront.Controller.RadioListingFragment;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.harbourfront.Controller.InternetController.InternetController;
import com.example.harbourfront.Controller.RestApi.ManagerAll;
import com.example.harbourfront.Models.RadioListingModel;
import com.example.harbourfront.R;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * A simple {@link Fragment} subclass.
 */
public class RadioListingFragment extends Fragment {

    //Constants
    public static final String RADIO_LISTING_FRAGMENT_TAG = "RadioListingFragment";

    //Variables
    private RadioListingModel radioListingModel;
    private RecyclerView recyclerView;
    private View view;
    private LinearLayoutManager layoutManager;
    private RadioListingAdapters radioListingAdapters;
    private ProgressBar progressBar;

    private int page_mumber = 1;
    private int item_count = 40;

    //Variables for pagination

    private boolean isLoading = true;
    private int pastVisibleItems, visibleItemCounts, totallItemCount, previous_total = 0,view_threashold = 40;

    public RadioListingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_listing, container, false);
        defineComponents();
        activateScroll();
        checkInternetConnectionAndGetData();
        return view;
    }

    //Define this page's components by id
    private void defineComponents() {
     recyclerView = view.findViewById(R.id.recylerView);
     progressBar = view.findViewById(R.id.progressBar);
    }

    //Activate recycler view scrolling handler
    private void activateScroll() {
        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {

            @Override
            public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);

                visibleItemCounts = layoutManager.getChildCount();
                totallItemCount = layoutManager.getItemCount();
                pastVisibleItems = layoutManager.findFirstVisibleItemPosition();

                if (dy>0) {
                    if (isLoading) {
                        if (totallItemCount>previous_total) {
                            isLoading = false;
                            previous_total = totallItemCount;
                        }
                    }

                    if (!isLoading&&(totallItemCount-visibleItemCounts)<=(pastVisibleItems+view_threashold)) {
                        if (InternetController.isNetworkConnected(getContext())) {
                            page_mumber++;
                            item_count = item_count + view_threashold;
                            isLoading = true;
                            getData(String.valueOf(item_count),String.valueOf(page_mumber));
                        }
                    }
                }
            }
        });
    }

    //Check internet connection and get
    private void checkInternetConnectionAndGetData() {
        if (InternetController.isNetworkConnected(getContext())) {
            getData(String.valueOf(item_count),String.valueOf(page_mumber));
        } else {
            Toast.makeText(getActivity(), "Please check your internet connection", Toast.LENGTH_SHORT).show();
            progressBar.setVisibility(View.GONE);
        }
    }

    //Get data from server
    private void getData(String size, String page) {
        progressBar.setVisibility(View.VISIBLE);
        Call<RadioListingModel> radioListingModelCall = ManagerAll.getInstance().getRadioListingData(size,page);
        radioListingModelCall.enqueue(new Callback<RadioListingModel>() {
            @Override
            public void onResponse(Call<RadioListingModel> call, Response<RadioListingModel> response) {
                if (response.isSuccessful()) {
                    if (response.body() != null) {
                        //Data were got
                        if (radioListingModel == null) {
                            radioListingModel = response.body();
                            setData();
                        } else {
                                radioListingModel.getPrograms().addAll(response.body().getPrograms());
                                radioListingAdapters.notifyDataSetChanged();
                        }

                    } else {
                        Toast.makeText(getActivity(), "Data weren't got", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(getContext(), "Request isn't successful", Toast.LENGTH_SHORT).show();
                }
                progressBar.setVisibility(View.GONE);
            }

            @Override
            public void onFailure(Call<RadioListingModel> call, Throwable t) {
                Toast.makeText(getContext(), t.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                progressBar.setVisibility(View.GONE);
            }
        });
    }

    //Set data to Recyler view
    private void setData() {
        recyclerView.setHasFixedSize(true);

        // use a linear layout manager
        layoutManager = new LinearLayoutManager(getActivity());
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);

        // specify an adapter
        radioListingAdapters = new RadioListingAdapters(getActivity(),radioListingModel);
        recyclerView.setAdapter(radioListingAdapters);
        radioListingAdapters.notifyDataSetChanged();

        progressBar.setVisibility(View.GONE);

    }
}
