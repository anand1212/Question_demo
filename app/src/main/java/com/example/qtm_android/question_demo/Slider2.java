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
    Button answer_2, next_2;
    TextView txt_answer2;

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



        ans_grop2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId == R.id.radioButton_1) {
                    Toast.makeText(getApplicationContext(), "Rajnath sinh",
                            Toast.LENGTH_SHORT).show();
                } else if(checkedId == R.id.radioButton_2) {
                    Toast.makeText(getApplicationContext(), "Narendra Modi",
                            Toast.LENGTH_SHORT).show();
                }
                else if(checkedId == R.id.radioButton_3) {
                    Toast.makeText(getApplicationContext(), "Sonia Gandhi",
                            Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(getApplicationContext(), "Pappu Gandhi",
                            Toast.LENGTH_SHORT).show();
                }

            }
        });


        answer_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int selectedId2 = ans_grop2.getCheckedRadioButtonId();

                // find which radioButton is checked by id

                if(selectedId2 == rad_btn_1.getId()) {
                    txt_answer2.setText("You chose 'Rajnath sinh' ");
                } else if(selectedId2 == rad_btn_2.getId()) {
                    txt_answer2.setText("You chose 'Narendra Modi' ");
                }
                else if(selectedId2 == rad_btn_3.getId()) {
                    txt_answer2.setText("You chose 'Sonia Gandhi' ");
                }
                else
                {
                    txt_answer2.setText("You chose 'Pappu Gandhi' ");
                }
            }
        });

        Intent intent = getIntent();
        int checked = intent.getIntExtra("checked");

        next_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Slider2.this,Slider3.class);
                startActivity(intent);
            }
        });
    }

}
