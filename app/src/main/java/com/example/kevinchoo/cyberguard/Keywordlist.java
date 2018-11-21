package com.example.kevinchoo.cyberguard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Keywordlist extends AppCompatActivity {
    ListView simpleList;
    String keyList[] = {"Ellie, Die", "Ellie, Fat"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keywordlist);
        simpleList = findViewById(R.id.lv_keyword);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_listview, R.id.textView, keyList);
        simpleList.setAdapter(arrayAdapter);
        simpleList.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View  view, int position, long id)
            {
                Intent intent = new Intent (Keywordlist.this, Details.class);
                startActivity(intent);
            }
        });
    }


}
