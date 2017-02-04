package com.example.student.db020401;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String data[] = {"AAAA", "BBB", "CCCCC", "DD", "EEEEEE"};
        ListView lv = (ListView) findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter(
                MainActivity.this,
                android.R.layout.simple_list_item_1,
                data
        );
        lv.setAdapter(adapter);
    }
}
