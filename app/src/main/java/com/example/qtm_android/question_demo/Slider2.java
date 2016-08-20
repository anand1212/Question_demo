package com.example.qtm_android.question_demo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by qtm-android on 15/8/16.
 */
public class Slider2 extends Activity {
    RadioGroup ans_grop2;
    RadioButton rad_btn_1, rad_btn_2, rad_btn_3,rad_btn_4;
    Button answer_2, next_2, mark2;
    TextView txt_answer2;
    int total;
    int new1total;
    int new2total;
    int new3total;
    int new4total;
  //  int new1total1,new1total2,new1total3,new1total4;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.slider_2);





        ans_grop2 = (RadioGroup) findViewById(R.id.answer_group2);
        rad_btn_1 = (RadioButton) findViewById(R.id.radioButton_1);
        rad_btn_2 = (RadioButton) findViewById(R.id.radioButton_2);
        rad_btn_3 = (RadioButton) findViewById(R.id.radioButton_3);
        rad_btn_4 = (RadioButton) findViewById(R.id.radioButton_4);
        answer_2 = (Button) findViewById(R.id.btn_ans2);
        next_2 = (Button) findViewById(R.id.btn_next2);
        txt_answer2 = (TextView) findViewById(R.id.tet2);
        mark2 = (Button) findViewById(R.id.mark2);

        ans_grop2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId){
                    case R.id.radioButton_1:
                        // do operations specific to this selection
                        Toast.makeText(Slider2.this,"FALSE Answer",Toast.LENGTH_LONG).show();
                        total= getIntent().getExtras().getInt("marks");
                        new1total= getIntent().getExtras().getInt("indi1");
                        new2total= getIntent().getExtras().getInt("indi2");
                        new3total= getIntent().getExtras().getInt("indi3");
                        new4total= getIntent().getExtras().getInt("indi4");
                        total = total + 0;
           //             total = new1total1 ;
                        int new1total1 = 0;
                        Intent intentslide21 = new Intent(Slider2.this, Slider3.class);
                        intentslide21.putExtra("indi11", new1total1);
                        intentslide21.putExtra("marks", total);
                        intentslide21.putExtra("indi1", new1total);
                        intentslide21.putExtra("indi2", new2total);
                        intentslide21.putExtra("indi3", new3total);
                        intentslide21.putExtra("indi4", new4total);

                        startActivity(intentslide21);



                        break;

                    case R.id.radioButton_2:
                        // do operations specific to this selection
                        int new1total2 = 1;
                        Toast.makeText(Slider2.this,"Right Answer",Toast.LENGTH_LONG).show();

                        total= getIntent().getExtras().getInt("marks");
                        new1total= getIntent().getExtras().getInt("indi1");
                        new2total= getIntent().getExtras().getInt("indi2");
                        new3total= getIntent().getExtras().getInt("indi3");
                        new4total= getIntent().getExtras().getInt("indi4");

                        total = total + 1;

            //            total = new1total2 ;
                        Intent intentslide22 = new Intent(Slider2.this, Slider3.class);
                        intentslide22.putExtra("marks", total);
                        intentslide22.putExtra("indi12", new1total2);
                        intentslide22.putExtra("indi1", new1total);
                        intentslide22.putExtra("indi2", new2total);
                        intentslide22.putExtra("indi3", new3total);
                        intentslide22.putExtra("indi4", new4total);


                        startActivity(intentslide22);



                        break;

                    case R.id.radioButton_3:
                        // do operations specific to this selection
                        Toast.makeText(Slider2.this,"FALSE Answer",Toast.LENGTH_LONG).show();
                        total= getIntent().getExtras().getInt("marks");
                        new1total= getIntent().getExtras().getInt("indi1");
                        new2total= getIntent().getExtras().getInt("indi2");
                        new3total= getIntent().getExtras().getInt("indi3");
                        new4total= getIntent().getExtras().getInt("indi4");
                //        total = new1total3;
                       int  new1total3  = 0;
                        Intent intentslide23 = new Intent(Slider2.this, Slider3.class);
                        intentslide23.putExtra("marks", total);
                        intentslide23.putExtra("indi13", new1total3);

                        intentslide23.putExtra("indi1", new1total);
                        intentslide23.putExtra("indi2", new2total);
                        intentslide23.putExtra("indi3", new3total);
                        intentslide23.putExtra("indi4", new4total);
                        startActivity(intentslide23);



                        break;
                    case R.id.radioButton_4:
                        Toast.makeText(Slider2.this,"FALSE Answer",Toast.LENGTH_LONG).show();
                        total= getIntent().getExtras().getInt("marks");
                        new1total= getIntent().getExtras().getInt("indi1");
                        new2total= getIntent().getExtras().getInt("indi2");
                        new3total= getIntent().getExtras().getInt("indi3");
                        new4total= getIntent().getExtras().getInt("indi4");
                        total = total + 0;
          //             total = new1total4;
                        int new1total4 = 0;
                        Intent intentslide24 = new Intent(Slider2.this, Slider3.class);
                        intentslide24.putExtra("indi14", new1total4);
                        intentslide24.putExtra("marks", total);


                        intentslide24.putExtra("indi1", new1total);
                        intentslide24.putExtra("indi2", new2total);
                        intentslide24.putExtra("indi3", new3total);
                        intentslide24.putExtra("indi4", new4total);

                        startActivity(intentslide24);


                        break;

                }


            }
        });


        answer_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txt_answer2.setText("Correct Ansewer Is Narendra Modi");

            }
        });


        next_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Slider2.this, Slider3.class);
                i.putExtra("marks", total);
                startActivity(i);
            }
        });
        mark2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Slider2.this, "Your Total Marks is :"+total,Toast.LENGTH_LONG).show();
            }
        });
    }


}
