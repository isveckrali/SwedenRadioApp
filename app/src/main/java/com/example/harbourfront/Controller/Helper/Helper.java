package com.example.harbourfront.Controller.Helper;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Helper {

    //Load image to view from Server by Url
    public static void imageLoad(ImageView imageView, String url, Context context) {
        Glide
                .with(context)
                .load(url)
                .centerCrop()
                .into(imageView);

    }
}
