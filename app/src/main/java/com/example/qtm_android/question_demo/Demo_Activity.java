//package com.example.qtm_android.question_demo;
//
//import android.app.Activity;
//import android.content.Intent;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.RadioButton;
//import android.widget.RadioGroup;
//import android.widget.TextView;
//import android.widget.Toast;
//
///**
// * Created by qtm-android on 15/8/16.
// */
//public class Demo_Activity extends Activity{
//
//    RadioGroup ans_grop3;
//    RadioButton rad_btn_11, rad_btn_22, rad_btn_33,rad_btn_44;
//    Button answer_3, mark,btn_next_3;
//    TextView txt_answer3;
//    int total;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.slider_3);
//
//        total= getIntent().getExtras().getInt("marks");
//
//        ans_grop3 = (RadioGroup) findViewById(R.id.answer_group3);
//        rad_btn_11 = (RadioButton) findViewById(R.id.radioButton_31);
//        rad_btn_22 = (RadioButton) findViewById(R.id.radioButton_32);
//        rad_btn_33= (RadioButton) findViewById(R.id.radioButton_3);
//        rad_btn_44 = (RadioButton) findViewById(R.id.radioButton_4);
//        answer_3 = (Button) findViewById(R.id.btn_ans3);
//        mark = (Button) findViewById(R.id.score);
//        txt_answer3 = (TextView) findViewById(R.id.tet3);
//        btn_next_3 = (Button) findViewById(R.id.next3);
//
//
//
//        ans_grop3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
//        {
//            public void onCheckedChanged(RadioGroup group, int checkedId) {
//                switch(checkedId){
//                    case R.id.radioButton_31:
//                        // do operations specific to this selection
//                        Toast.makeText(Slider3.this,"False Answer",Toast.LENGTH_LONG).show();
//                        total = total + 0;
//                        break;
//
//                    case R.id.radioButton_32:
//                        // do operations specific to this selection
//                        Toast.makeText(Slider3.this,"FALSE Answer",Toast.LENGTH_LONG).show();
//                        total = total + 0;
//                        break;
//
//                    case R.id.radioButton_33:
//                        // do operations specific to this selection
//                        Toast.makeText(Slider3.this,"Right Answer",Toast.LENGTH_LONG).show();
//                        total = total + 1;
//                        break;
//                    case R.id.radioButton_34:
//                        Toast.makeText(Slider3.this,"FALSE Answer",Toast.LENGTH_LONG).show();
//                        total = total + 0;
//                        break;
//
//                }
//
//
//            }
//        });
//
//
//        answer_3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                int selectedId3 = ans_grop3.getCheckedRadioButtonId();
//
//                // find which radioButton is checked by id
//
//                if(selectedId3 == rad_btn_11.getId()) {
//                    txt_answer3.setText("You chose 'Jawaharlal Nehru' ");
//                } else if(selectedId3 == rad_btn_22.getId()) {
//                    txt_answer3.setText("You chose 'A.P.J.Abdul Kalam' ");
//                }
//                else if(selectedId3 == rad_btn_33.getId()) {
//                    txt_answer3.setText("You chose 'Rajendra Prasad Sharma' ");
//                }
//                else
//                {
//                    txt_answer3.setText("You chose 'Sardar Vallabhbhai Patel' ");
//                }
//            }
//        });
//
//        mark.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                Toast.makeText(Slider3.this,"Your Total Marks IS :"+total,Toast.LENGTH_LONG).show();
//            }
//        });
//
//        btn_next_3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent(Slider3.this, Report_Activity.class);
//                i.putExtra("marks", total);
//                startActivity(i);
//            }
//        });
//    }
//
//}
