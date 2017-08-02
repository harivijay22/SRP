package com.example.prasathth.hello;

import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TabHost;

/**
 * Created by prasathth on 8/2/17.
 */

public class MainActivity extends TabActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Resources ressources = getResources();
        TabHost tabHost = getTabHost();
        //hello david

        // Android tab
        Intent intentAndroid = new Intent().setClass(this, timeActivity.class);
        TabHost.TabSpec tabSpecAndroid = tabHost
                .newTabSpec("Android")
                .setIndicator("", ressources.getDrawable(R.drawable.timeicon))
                .setContent(intentAndroid);

        // Apple tab
        Intent intentApple = new Intent().setClass(this, priorityActivity.class);
        TabHost.TabSpec tabSpecApple = tabHost
                .newTabSpec("Apple")
                .setIndicator("", ressources.getDrawable(R.drawable.priorityicon))
                .setContent(intentApple);


        // add all tabs
        tabHost.addTab(tabSpecAndroid);
        tabHost.addTab(tabSpecApple);

        //set Windows tab as default (zero based)
        tabHost.setCurrentTab(2);


    }
}
