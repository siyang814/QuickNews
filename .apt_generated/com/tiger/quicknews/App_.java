//
// DO NOT EDIT THIS FILE, IT HAS BEEN GENERATED USING AndroidAnnotations 3.0.1.
//


package com.tiger.quicknews;


public final class App_
    extends App
{

    private static App INSTANCE_;

    public static App getInstance() {
        return INSTANCE_;
    }

    /**
     * Visible for testing purposes
     * 
     */
    public static void setForTesting(App application) {
        INSTANCE_ = application;
    }

    @Override
    public void onCreate() {
        INSTANCE_ = this;
        init_();
        super.onCreate();
    }

    private void init_() {
    }

}
