package com.example.prasathth.hello;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by prasathth on 8/2/17.
 */

public class priorityActivity extends Activity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView textview = new TextView(this);
        textview.setText("This is Apple tab");
        setContentView(textview);
    }

}
