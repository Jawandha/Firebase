package com.example.firebase;

import androidx.appcompat.app.AppCompatActivity;

import android.drm.DrmStore;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

import static com.example.firebase.R.id.myview;
import static com.example.firebase.R.id.text;

public class MainActivity extends AppCompatActivity {
 Button btn_call;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_call = findViewById(R.id.button);
        btn_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             /*   Snackbar snb = Snackbar.make(findViewById(R.id.myview),"Done!", Snackbar.LENGTH_LONG);
                snb.show();*/

                Snackbar snb = Snackbar.make(findViewById(R.id.myview), "Action Snackbar!", Snackbar.LENGTH_INDEFINITE).setAction("Retry!", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Toast.makeText(MainActivity.this, "Snackbar toast", Toast.LENGTH_SHORT).show();
                    }
                });
                snb.show();
            }
        });
    }}

