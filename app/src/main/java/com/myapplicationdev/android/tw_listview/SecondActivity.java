package com.myapplicationdev.android.tw_listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    ListView lv;
    TextView tvYear;
    ArrayList<module> years;
    ArrayAdapter aa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        lv = (ListView) this.findViewById(R.id.lvModules);
        tvYear = (TextView) findViewById(R.id.tvYear);

        Intent i = getIntent();
        String year = i.getStringExtra("year");
        tvYear.setText(year);

        // Create a few moduke objects in given years array
        years = new ArrayList<module>();

        // Link this Activity object, the row.xml layout for
        //  each row and the year String array together

        if (year == "year 1") {
            years.add(new module("G101", false));
            years.add(new module("A113", false));
            years.add(new module("C105", true));
            aa = new ModuleAdapter(this, R.layout.row, years);
            lv.setAdapter(aa);
        }
        else if (year == "year 2") {
            years.add(new module("C208", true));
            years.add(new module("C200", false));
            years.add(new module("C346", true));
            aa = new ModuleAdapter(this, R.layout.row, years);
            lv.setAdapter(aa);
        }
        else {
            years.add(new module("C347", true));
            years.add(new module("C349", true));
            years.add(new module("C300", false));
            aa = new ModuleAdapter(this, R.layout.row, years);
            lv.setAdapter(aa);
        }
    }

}
