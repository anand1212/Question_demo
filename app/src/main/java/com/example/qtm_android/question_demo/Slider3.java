package com.example.qtm_android.question_demo;

import android.app.Activity;
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
public class Slider3 extends Activity{

    RadioGroup ans_grop3;
    RadioButton rad_btn_11, rad_btn_22, rad_btn_33,rad_btn_44;
    Button answer_3, mark;
    TextView txt_answer3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.slider_3);

        ans_grop3 = (RadioGroup) findViewById(R.id.answer_group3);
        rad_btn_11 = (RadioButton) findViewById(R.id.radioButton_31);
        rad_btn_22 = (RadioButton) findViewById(R.id.radioButton_32);
        rad_btn_33= (RadioButton) findViewById(R.id.radioButton_3);
        rad_btn_44 = (RadioButton) findViewById(R.id.radioButton_4);
        answer_3 = (Button) findViewById(R.id.btn_ans3);
        mark = (Button) findViewById(R.id.score);
        txt_answer3 = (TextView) findViewById(R.id.tet3);



        ans_grop3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId == R.id.radioButton_31) {
                    Toast.makeText(getApplicationContext(), "Jawaharlal Nehru",
                            Toast.LENGTH_SHORT).show();
                } else if(checkedId == R.id.radioButton_32) {
                    Toast.makeText(getApplicationContext(), "A.P.J.Abdul kalam",
                            Toast.LENGTH_SHORT).show();
                }
                else if(checkedId == R.id.radioButton_33) {
                    Toast.makeText(getApplicationContext(), "Rajemdra Prasad",
                            Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(getApplicationContext(), "Saradar Vallabhbhai Patel",
                            Toast.LENGTH_SHORT).show();
                }

            }
        });


        answer_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId3 = ans_grop3.getCheckedRadioButtonId();

                // find which radioButton is checked by id

                if(selectedId3 == rad_btn_11.getId()) {
                    txt_answer3.setText("You chose 'Jawaharlal Nehru' ");
                } else if(selectedId3 == rad_btn_22.getId()) {
                    txt_answer3.setText("You chose 'A.P.J.Abdul Kalam' ");
                }
                else if(selectedId3 == rad_btn_33.getId()) {
                    txt_answer3.setText("You chose 'Rajendra Prasad Sharma' ");
                }
                else
                {
                    txt_answer3.setText("You chose 'Sardar Vallabhbhai Patel' ");
                }
            }
        });

        mark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

}
