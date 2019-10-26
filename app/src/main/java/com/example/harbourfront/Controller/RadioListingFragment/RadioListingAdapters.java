package com.example.harbourfront.Controller.RadioListingFragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.harbourfront.Controller.Helper.Helper;
import com.example.harbourfront.Controller.Launch.MainActivity;
import com.example.harbourfront.Controller.RadioDetailFragment.RadioDetailFragment;
import com.example.harbourfront.Models.RadioListingModel;
import com.example.harbourfront.R;
import com.example.harbourfront.ViewModel.RadioListingViewModel;

public class RadioListingAdapters extends RecyclerView.Adapter<RadioListingAdapters.ListingViewHolder> {

    private Context context;
    private RadioListingModel radioListingModel;

    public RadioListingAdapters(Context context, RadioListingModel radioListingModel) {
        this.context = context;
        this.radioListingModel = radioListingModel;
    }

    @NonNull
    @Override
    public ListingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view  = LayoutInflater.from(context).inflate(R.layout.fragment_listing_item,parent,false);
        return new ListingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListingViewHolder holder, int position) {
        RadioListingViewModel radioListingViewModel = new RadioListingViewModel(radioListingModel.getPrograms().get(position));
        holder.txtViewTop.setText(radioListingViewModel.getName());
        holder.txtViewDown.setText(radioListingViewModel.getDesc());
        Helper.imageLoad(holder.imageView,radioListingViewModel.getImgUrl(),context);
    }

    @Override
    public int getItemCount() {
        return radioListingModel.getPrograms().size();
    }

    class ListingViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

            TextView txtViewTop, txtViewDown;
            ImageView imageView;

        public ListingViewHolder(@NonNull View itemView) {
            super(itemView);

            txtViewTop = itemView.findViewById(R.id.textViewTop);
            txtViewDown = itemView.findViewById(R.id.textViewDown);
            imageView = itemView.findViewById(R.id.imageView);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            RadioListingViewModel radioListingViewModel = new RadioListingViewModel(radioListingModel.getPrograms().get(getLayoutPosition()));
            Bundle bundle=new Bundle();
            bundle.putString("name", radioListingViewModel.getName());
            bundle.putString("desc",radioListingViewModel.getDesc());
            bundle.putString("imgUrl",radioListingViewModel.getImgUrl());
            RadioDetailFragment radioDetailFragment = new RadioDetailFragment();
            radioDetailFragment.setArguments(bundle);
            ((MainActivity)context).getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.fragment_listing_container,radioDetailFragment,RadioDetailFragment.RADIO_DETAIL_FRAGMENT_TAG)
                    .addToBackStack(null)
                    .commit();
        }
    }
}
