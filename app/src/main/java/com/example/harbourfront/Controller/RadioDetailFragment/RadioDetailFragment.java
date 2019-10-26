package com.example.harbourfront.Controller.RadioDetailFragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.harbourfront.Controller.Helper.Helper;
import com.example.harbourfront.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class RadioDetailFragment extends Fragment {

    //Constans
    public static final String RADIO_DETAIL_FRAGMENT_TAG = "radioDetailFragment";

    //Variables
    private String name,desc,imageUrl;
    private View view;
    private TextView txtName, txtDesc;
    private ImageView imageView;


    public RadioDetailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_radio_detail, container, false);
        getBundlesData();
        defineComponents();
        setData();
        return view;
    }

    //Get values from bundle which coming from previous fragment
    private void getBundlesData() {
    name = getArguments().getString("name","");
    desc = getArguments().getString("desc","");
    imageUrl = getArguments().getString("imgUrl","");
    }

    //Define components by id
    private void defineComponents() {
        txtName = view.findViewById(R.id.textViewName);
        txtDesc = view.findViewById(R.id.textViewDesc);
        imageView = view.findViewById(R.id.imageViewDetail);
    }

    //Set data to all views if there is
    private void setData() {
        txtName.setText(name);
        txtDesc.setText(desc);
        if (!imageUrl.isEmpty()) {
            Helper.imageLoad(imageView,imageUrl,getActivity());
        }
    }
}
