//
// DO NOT EDIT THIS FILE, IT HAS BEEN GENERATED USING AndroidAnnotations 3.0.1.
//


package com.tiger.quicknews.adapter;

import android.content.Context;

public final class WeatherAdapter_
    extends WeatherAdapter
{

    private Context context_;

    private WeatherAdapter_(Context context) {
        context_ = context;
        init_();
    }

    public static WeatherAdapter_ getInstance_(Context context) {
        return new WeatherAdapter_(context);
    }

    private void init_() {
        context = context_;
    }

    public void rebind(Context context) {
        context_ = context;
        init_();
    }

}
