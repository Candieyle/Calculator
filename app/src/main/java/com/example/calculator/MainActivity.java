package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;



public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    TextView resultTv,solutionTv;
    MaterialButton buttonC, buttonBracket, buttonPercent,buttonDivide,buttonMultiply,buttonAdd,buttonSubtract;
    MaterialButton button0, button1, button2, button3, button4, button5, button6, button7, button8, button9;
    MaterialButton buttonComma, buttonEquals;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultTv = findViewById(R.id.results_tv);
        solutionTv = findViewById(R.id.solution_tv);

        assignId(buttonC,R.id.buttons_c);
        assignId(buttonBracket,R.id.buttons_bracket);
        assignId(buttonPercent,R.id.buttons_percent);
        assignId(buttonDivide,R.id.buttons_divide);
        assignId(buttonMultiply,R.id.buttons_multiply);
        assignId(buttonAdd,R.id.buttons_add);
        assignId(buttonSubtract,R.id.buttons_subtract);
        assignId(button0,R.id.buttons_0);
        assignId(button1,R.id.buttons_1);
        assignId(button2,R.id.buttons_2);
        assignId(button3,R.id.buttons_3);
        assignId(button4,R.id.buttons_4);
        assignId(button5,R.id.buttons_5);
        assignId(button6,R.id.buttons_6);
        assignId(button7,R.id.buttons_7);
        assignId(button8,R.id.buttons_8);
        assignId(button9,R.id.buttons_9);
        assignId(buttonComma,R.id.buttons_comma);
        assignId(buttonEquals,R.id.buttons_equal);
    }
    void assignId(MaterialButton btn,int id) {

        btn = findViewById(id);
        btn.setOnClickListener(this);
    }



    @Override
    public void onClick(View view) {
        MaterialButton button=(MaterialButton) view;
        String buttonText= button.getText().toString();
        String dataToCalculate= solutionTv.getText().toString();

        if(buttonText.equals("C")){
            solutionTv.setText("");
            resultTv.setText("0");
            return;
        }
        if(buttonText.equals("=")){
            solutionTv.setText(resultTv.getText());
            return;
        }


        dataToCalculate = dataToCalculate+buttonText;
        solutionTv.setText(dataToCalculate);

        String finalResult=getResult(dataToCalculate);


    }
    String getResult(String data){


        return data;
    }

    }
