package com.example.kevinchoo.cyberguard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Register extends AppCompatActivity {
    Button btnregister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        btnregister = findViewById(R.id.btn_register);

        btnregister.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Register.this, MainActivity.class);
                Toast.makeText(Register.this,"User has been registered",Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }


        });
    }

}
