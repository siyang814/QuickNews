
package com.tiger.quicknews.view;

import android.content.Context;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.tiger.quicknews.R;
import com.tiger.quicknews.bean.WeatherModle;
import com.tiger.quicknews.initview.SlidingMenuView;

import org.androidannotations.annotations.EViewGroup;
import org.androidannotations.annotations.ViewById;

@EViewGroup(R.layout.item_weather)
public class WeatherItemView extends LinearLayout {

    @ViewById(R.id.week)
    protected TextView mWeek;
    @ViewById(R.id.weahter_image)
    protected ImageView mWeatherImage;
    @ViewById(R.id.temperature)
    protected TextView mTemperature;
    @ViewById(R.id.weather)
    protected TextView mWeather;
    @ViewById(R.id.wind)
    protected TextView mWind;

    public WeatherItemView(Context context) {
        super(context);
    }

    public void setData(WeatherModle weatherModle) {
        mWeek.setText(weatherModle.getWeek());
        mTemperature.setText(weatherModle.getTemperature());
        mWeather.setText(weatherModle.getWeather());
        mWind.setText(weatherModle.getWind());
        SlidingMenuView.instance().setWeatherImage(mWeatherImage, weatherModle.getWeather());
    }

}
