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
    ArrayList<module> year1, year2, year3;
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
        year1 = new ArrayList<module>();
        year1.add(new module("G101", false));
        year1.add(new module("A113", false));
        year1.add(new module("C105", true));

        year2 = new ArrayList<module>();
        year2.add(new module("C208", true));
        year2.add(new module("C200", false));
        year2.add(new module("C346", true));

        year3 = new ArrayList<module>();
        year3.add(new module("C347", true));
        year3.add(new module("C349", true));
        year3.add(new module("C300", false));

        // Link this Activity object, the row.xml layout for
        //  each row and the year String array together

        /*
        if (year == "year 1") {
            aa = new ModuleAdapter(this, R.layout.row, year1);
            lv.setAdapter(aa);
        }
        else if (year == "year 2") {
            aa = new ModuleAdapter(this, R.layout.row, year2);
            lv.setAdapter(aa);
        }
        else {
            aa = new ModuleAdapter(this, R.layout.row, year3);
            lv.setAdapter(aa);
        }
         */

        aa = new ModuleAdapter(this, R.layout.row, year2);
        lv.setAdapter(aa);
    }

}
