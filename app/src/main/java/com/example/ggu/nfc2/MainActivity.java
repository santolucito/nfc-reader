package com.example.ggu.nfc2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        setupNavButton(R.id.go_to_take_attendance, R.layout.tag_viewer);

        setupNavButton(R.id.go_to_add_user, R.layout.add_user);


    }

    private void setupNavButton(int buttonID, final int targetLocID) {
        final Button button = (Button) findViewById(buttonID);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                setContentView(targetLocID);
            }
        });
    }
}
