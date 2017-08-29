package com.example.smiling.exercisesforchildren;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        LinearLayout colors = (LinearLayout) findViewById(R.id.colors);
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainScreenToMenu = new Intent(MenuActivity.this, ColorsActivity.class);
                startActivity(mainScreenToMenu);
            }
        });
    }
}
