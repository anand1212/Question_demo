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

public class MainActivity extends Activity {

    RadioGroup ans_grop;
    RadioButton rad_btn1, rad_btn2, rad_btn3,rad_btn4;
    Button answer, next;
    TextView txt_answer;



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

        ans_grop.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if(checkedId == R.id.radioButton) {
                    Toast.makeText(getApplicationContext(), "AnandiBen Patel",
                            Toast.LENGTH_SHORT).show();
                } else if(checkedId == R.id.radioButton2) {
                    Toast.makeText(getApplicationContext(), "Narendra Modi",
                            Toast.LENGTH_SHORT).show();
                }
                else if(checkedId == R.id.radioButton3) {
                    Toast.makeText(getApplicationContext(), "Vijay Rupani",
                            Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(getApplicationContext(), "Daud Ebrahim",
                            Toast.LENGTH_SHORT).show();
                }

            }
        });
//        final int checked = ans_grop.getCheckedRadioButtonId();

        answer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // get selected radio button from radioGroup
                int selectedId = ans_grop.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                ans_grop = (RadioGroup) findViewById(selectedId);

                Toast.makeText(MainActivity.this,
                        ans_grop.getText(), Toast.LENGTH_SHORT).show();
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this,Slider2.class);
                intent.putExtra("checked",id);
                startActivity(intent);

            }
        });

    }

}
