package com.example.smiling.exercisesforchildren;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);

        LinearLayout mainScreen = (LinearLayout) findViewById(R.id.main_screen_click);
        mainScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainScreenToMenu = new Intent(MainScreenActivity.this, MenuActivity.class);
                startActivity(mainScreenToMenu);
            }
        });
    }

}
