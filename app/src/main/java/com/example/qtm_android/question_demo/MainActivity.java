package com.example.qtm_android.question_demo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;


public class MainActivity extends Activity {

    RadioGroup ans_grop;
    RadioButton rad_btn1, rad_btn2, rad_btn3,rad_btn4;
    Button answer, next,mark1;
    TextView txt_answer;
    int total =0;

    int new2total;
  //  int new3total;
    int new4total;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ans_grop = (RadioGroup) findViewById(R.id.answer_group);
        rad_btn1 = (RadioButton) findViewById(R.id.radioButton);
        rad_btn2 = (RadioButton) findViewById(R.id.radioButton2);
        rad_btn3 = (RadioButton) findViewById(R.id.radioButton3);
        rad_btn4 = (RadioButton) findViewById(R.id.radioButton4);
        answer = (Button) findViewById(R.id.btn_ans);
        txt_answer = (TextView) findViewById(R.id.tet);
        next = (Button) findViewById(R.id.btn_next);
        mark1 = (Button) findViewById(R.id.mark1);


//        final int checked = ans_grop.getCheckedRadioButtonId();
 //       final int id= ans_grop.getCheckedRadioButtonId();
 //       answer.setOnClickListener(new View.OnClickListener() {
 //           @Override
  //          public void onClick(View v) {

  //              RadioButton rb = (RadioButton) ans_grop.findViewById(ans_grop.getCheckedRadioButtonId());
//                Toast.makeText(MainActivity.this, rb.getText(), Toast.LENGTH_SHORT).show();
//            }
 //       });

        ans_grop.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId){


                    case R.id.radioButton:
                        // do operations specific to this selection
                        int new1total = 0;
                        Toast.makeText(MainActivity.this,"False Answer",Toast.LENGTH_LONG).show();
                        total =total + 0;
                        Intent intent1 = new Intent(MainActivity.this, Slider2.class);
                        intent1.putExtra("indi1", new1total);
                        intent1.putExtra("marks", total);
                        startActivity(intent1);

                        break;

                    case R.id.radioButton2:
                        // do operations specific to this selection
                        Toast.makeText(MainActivity.this,"False Answer",Toast.LENGTH_LONG).show();
                        total =total + 0;
                        new2total = 0;
                        Intent intent2 = new Intent(MainActivity.this, Slider2.class);
                        intent2.putExtra("indi2", new2total);
                        intent2.putExtra("marks", total);
                        startActivity(intent2);

                        break;

                    case R.id.radioButton3:
                        // do operations specific to this selection
                        int new3total = 1;
                        Toast.makeText(MainActivity.this,"right Answer",Toast.LENGTH_LONG).show();
                        total = total+1;
                        Intent intent3 = new Intent(MainActivity.this, Slider2.class);
                        intent3.putExtra("marks", total);
                        intent3.putExtra("indi3", new3total);
                        startActivity(intent3);


                        break;
                    case R.id.radioButton4:
                        Toast.makeText(MainActivity.this,"FALSE Answer",Toast.LENGTH_LONG).show();
                        total = total + 0;
                        new4total = 0;
                        Intent intent4 = new Intent(MainActivity.this, Slider2.class);
                        intent4.putExtra("indi4", new4total);
                        intent4.putExtra("marks", total);
                        startActivity(intent4);

                        break;

                }


            }
        });
        mark1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Total Marks Is :" +total,Toast.LENGTH_LONG).show();
            }
        });



        answer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_answer.setText("Correct Answer is Vijay Rupani");
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Slider2.class);
                i.putExtra("marks", total);
                startActivity(i);
            }
        });


    }

}
