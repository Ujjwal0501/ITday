package com.adid.fproj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    AppCompatButton aSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        aSwitch = (AppCompatButton) findViewById(R.id.switch1);
        aSwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.getContext().startActivity(new Intent(v.getContext(), UnityPlayerActivity.class));
            }
        });


    }

    // update content of main page
    private static void upadteContent() {
        //TODO

    }

    // get balance; manual update only; auto-update on create
    private static void getBalance() {
        // TODO
    }

    // get location update; returns coordinates
    private static void getLoc() {
        // TODO
    }

    // check current spot and spots in DB
    // takes return value of getLoc, returns TRUE/FALSE
    private static boolean checkSpot() {
        // TODO
    }

    // explored spots; only called when return of checkSpot is true
    private static void expStat() {
        // TODO
    }


}
