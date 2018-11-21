package com.example.kevinchoo.cyberguard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Details extends AppCompatActivity {
    Button btncontext;
    Button btnadvice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        btncontext = findViewById(R.id.btn_context);
        btnadvice = findViewById(R.id.btn_advice);
        btncontext.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Details.this, Context.class);
                startActivity(intent);
            }
        });

        btnadvice.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Details.this, Advice.class);
                startActivity(intent);
            }


        });
    }
}
