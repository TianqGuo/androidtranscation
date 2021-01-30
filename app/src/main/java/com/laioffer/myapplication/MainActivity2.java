package com.laioffer.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {
    private final static String TAG = "lifecycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.d(TAG, "We are at onCreate()2");
        findViewById(R.id.container1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getSupportFragmentManager().beginTransaction().replace(R.id.container1, new BlankFragment1()).commit();
                //add the transcation to backstack
                //getSupportFragmentManager().beginTransaction().addToBackStack(null).replace(R.id.container1, new BlankFragment1()).commit();
            }
        });

        findViewById(R.id.container2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container2, new BlankFragment2()).commit();
            }
        });
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "We are at onStart()2");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "We are at onResume()2");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "We are at onPause()2");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "We are at onStop()2");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "We are at onDestroy()2");
    }
}