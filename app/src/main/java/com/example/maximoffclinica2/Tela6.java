package com.example.maximoffclinica2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela6);
        Button btnlgn2 = findViewById(R.id.btnlgn2);

        btnlgn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent tl7 = new Intent(getApplicationContext(),Tela7.class);

                startActivity(tl7);
            }
        });
    }
}



