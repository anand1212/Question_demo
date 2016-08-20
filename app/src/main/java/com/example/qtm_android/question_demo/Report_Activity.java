package com.example.qtm_android.question_demo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class Report_Activity extends Activity{

    TextView final_marks, final_foks;
    int total;

    RelativeLayout rel_1,rel_2,rel_3;
    int new1total;
    int new2total;
    int new3total;
    int new4total;
    int new1total1,new1total2,new1total3,new1total4;
    int new1total11,new1total12,new1total13,new1total14;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.report_card);
        final_marks = (TextView) findViewById(R.id.marksfinal);
        final_foks = (TextView) findViewById(R.id.folks);

        total= getIntent().getExtras().getInt("marks");
        final_marks.setText("final Score is :"+total);

        rel_1 = (RelativeLayout) findViewById(R.id.rel1);
        rel_2 = (RelativeLayout) findViewById(R.id.rel2);
        rel_3 = (RelativeLayout) findViewById(R.id.rel3);

        new1total= getIntent().getExtras().getInt("indi1");
        new2total= getIntent().getExtras().getInt("indi2");
        new3total= getIntent().getExtras().getInt("indi3");
        new4total= getIntent().getExtras().getInt("indi4");
        new1total1= getIntent().getExtras().getInt("indi11");
        new1total2= getIntent().getExtras().getInt("indi12");
        new1total3= getIntent().getExtras().getInt("indi13");
        new1total4= getIntent().getExtras().getInt("indi14");
        new1total11= getIntent().getExtras().getInt("indi21");
        new1total12= getIntent().getExtras().getInt("indi22");
        new1total13= getIntent().getExtras().getInt("indi23");
        new1total14= getIntent().getExtras().getInt("indi24");

        if(new3total == 1 || new1total2 == 1 || new1total3 == 1)
        {
            rel_1.setVisibility(View.GONE);
        }
        else
        {
            rel_1.setVisibility(View.VISIBLE);
        }



    }
}
