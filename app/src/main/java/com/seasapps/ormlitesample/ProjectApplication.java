package com.seasapps.ormlitesample;

import android.app.Application;

import com.seasapps.ormlitesample.database.DatabaseManager;


public class ProjectApplication extends Application {

    // this is project application class
    @Override
    public void onCreate() {
        super.onCreate();

        DatabaseManager.init(this);
    }
}
