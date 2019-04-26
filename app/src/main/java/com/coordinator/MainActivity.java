package com.coordinator;

import android.content.Intent;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private Button buttonOpenSnack;
private CoordinatorLayout coordinatorLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*initialize the id*/
        inItId();
         buttonOpenSnack.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Snackbar.make(coordinatorLayout,"this is Snack",Snackbar.LENGTH_LONG)
                         .setAction("CLOSE", new View.OnClickListener() {
                             @Override
                             public void onClick(View v) {
                                 Intent intent = new Intent(MainActivity.this, CollapseToolbarActivity.class);
                                 startActivity(intent);
                                 // custom text
                             }
                         }).show();
             }
         });

    }

    private void inItId() {
        buttonOpenSnack = findViewById(R.id.btn_open_snack);
        coordinatorLayout = findViewById(R.id.coordinatorLayout);
    }
}
