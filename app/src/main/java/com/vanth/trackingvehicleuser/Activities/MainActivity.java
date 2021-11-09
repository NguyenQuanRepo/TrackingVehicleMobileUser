package com.vanth.trackingvehicleuser.Activities;


import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.navigation.NavigationView;
import com.vanth.trackingvehicleuser.R;

public class MainActivity extends AppCompatActivity {

    NavigationView navigationView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

        mapInstance();
    }

    void mapInstance()
    {
        navigationView = findViewById(R.id.navigationView);
    }
}
