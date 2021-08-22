package com.example.additionallabsheet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;
import android.widget.QuickContactBadge;

public class MainActivity extends AppCompatActivity {
    private Button button_play;
    private Button button_stop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button_play = (Button)findViewById(R.id.button_play);
        button_play.setOnClickListener(new View.OnClickListener() {



            @Override
                   public void onClick(View view) {

                        startService(new Intent(MainActivity.this,MyServices.class));

            }

        });

                    button_stop =(Button)findViewById(R.id.button_stop);
                    button_stop.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            stopService(new Intent(MainActivity.this, MyServices.class));

                        }
                    });


    }
}

