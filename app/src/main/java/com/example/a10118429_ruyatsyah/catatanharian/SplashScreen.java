//Tanggal pengerjaan : 6 April 2021
//NIM                : 10118429
//Nama               : Ruyatsyah

package com.example.a10118429_ruyatsyah.catatanharian;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.example.a10118429_ruyatsyah.R;
import com.example.a10118429_ruyatsyah.dashboard.DashboardActivity;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);


        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), DashboardActivity.class));
                finish();
            }
        }, 2500L); //3000 L = 2.5 detik
    }
}