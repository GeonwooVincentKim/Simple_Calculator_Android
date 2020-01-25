package com.homework.calculator_design;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.math.BigDecimal;

public class MainActivity extends AppCompatActivity {

    private TextView text_info;
    private TextView text_result;
    private Button btn_0, btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9;
    private Button btn_Plus, btn_Minus, btn_Multiply, btn_Divide, btn_Equal, btn_AC;
    // 최대 4개의 수까지 사칙연산 가능합니다. -> 기능 구현 실패
//    private int[] Save_Numbers = {0};
    private int Front_Number = 0;
//    private int Middle_Number_1 = 0;
//    private int Middle_Number_2 = 0;
//    private int Middle_Number_3 = 0;
//    private int Back_Number = 0;

    // 여기는 문제 없이 실행이 잘 됩니다.
    int type = 0;
    int add = 0;
    int sub = 1;
    int mul = 2;
    int div = 3;

    private String Add = "+";
    private String Sub = "-";
    private String Mul = "+"; // "*"로 놓으면 프로그램이 계속 ShutDown 되므로,
                              // "+"로 어쩔 수 없이 설정해놓았습니다.
    private String Div = "-"; // "/"로 놓으면 프로그램이 계속 ShutDown 되므로,
                              // "-"로 어쩔 수 없이 설정해놓았습니다.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {
        btn_0 = findViewById(R.id.btn_0);
        btn_1 = findViewById(R.id.btn_1);
        btn_2 = findViewById(R.id.btn_2);
        btn_3 = findViewById(R.id.btn_3);
        btn_4 = findViewById(R.id.btn_4);
        btn_5 = findViewById(R.id.btn_5);
        btn_6 = findViewById(R.id.btn_6);
        btn_7 = findViewById(R.id.btn_7);
        btn_8 = findViewById(R.id.btn_8);
        btn_9 = findViewById(R.id.btn_9);

        btn_Plus = findViewById(R.id.btn_Plus);
        btn_Minus = findViewById(R.id.btn_Minus);
        btn_Multiply = findViewById(R.id.btn_Multiply);
        btn_Divide = findViewById(R.id.btn_Divide);
        btn_AC = findViewById(R.id.btn_AC);
        btn_Equal = findViewById(R.id.btn_Equal);

        // info = (TextView)findViewById(R.id.);
        text_result = findViewById(R.id.text_result);

        // 기존에 저장되어 있던 값들을 모두 날려버리고, 0으로 초기화시킵니다.

        // 참고로 Android Studio 에선 0만을 자주 쓰는 편입니다.
        // 또한 이 Code 를
        // text_result.setText("4");
        // 이런식으로 작성할 수 있지만,
        // Android Programming 할 때 대부분 숫자들을 사용하지 않으므로,
        // 위와 같은 Code 처럼 쓰지 말고, 하단에 있는 Code 처럼 사용하시길 추천해드립니다.

        // Button 을 Click 했을 때 처음에 입력한 버튼의 값이 저장되고, 새로 입력을 받습니다.
        // 즉, 기존의 값과 새로 입력받은 값을 사칙연산을 이용하여 구합니다.
        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text_result.getText().toString().equals("0")) {

                    text_result.setText(((Button) v).getText().toString());
                }else{

                    text_result.setText(text_result.getText().toString() +((Button)v).getText().toString());
                }
            }
        });

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text_result.getText().toString().equals("0")){
                    text_result.setText(((Button) v).getText().toString());
                }else{
                    text_result.setText(text_result.getText().toString() + ((Button)v).getText().toString());
                }
            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text_result.getText().toString().equals("0")){
                    text_result.setText(((Button)v).getText().toString());
                }else{
                    text_result.setText(text_result.getText().toString() + ((Button)v).getText().toString());
                }
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text_result.getText().toString().equals("0")){
                    text_result.setText(((Button)v).getText().toString());
                }else{
                    text_result.setText(text_result.getText().toString() + ((Button)v).getText().toString());
                }
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text_result.getText().toString().equals("0")){
                    text_result.setText(((Button)v).getText().toString());
                }else{
                    text_result.setText(text_result.getText().toString() +((Button)v).getText().toString());
                }
            }
        });

        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text_result.getText().toString().equals("0")) {
                    text_result.setText(((Button) v).getText().toString());
                }else{
                    text_result.setText(text_result.getText().toString() + ((Button)v).getText().toString());
                }
            }
        });

        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text_result.getText().toString().equals("0")) {
                    text_result.setText(((Button) v).getText().toString());
                }else{
                    text_result.setText(text_result.getText().toString() + ((Button)v).getText().toString());
                }
            }
        });

        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text_result.getText().toString().equals("0")) {
                    text_result.setText(((Button) v).getText().toString());
                }else{
                    text_result.setText(text_result.getText().toString() + ((Button)v).getText().toString());
                }
            }
        });

        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text_result.getText().toString().equals("0")) {
                    text_result.setText(((Button) v).getText().toString());
                }else{
                    text_result.setText(text_result.getText().toString() + ((Button)v).getText().toString());
                }
            }
        });

        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text_result.getText().toString().equals("0")) {
                    text_result.setText(((Button) v).getText().toString());
                }else{
                    text_result.setText(text_result.getText().toString() + ((Button)v).getText().toString());
                }
            }
        });

        btn_AC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_result.setText("0");
                Front_Number = 0;
            }
        });

        btn_Plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Front_Number = Front_Number + Integer.parseInt(text_result.getText().toString());
                text_result.setText(Add);
                type = add;
            }
        });

        btn_Minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Front_Number = Front_Number - Integer.parseInt(text_result.getText().toString());
                text_result.setText(Sub);
                type = sub;
            }
        });

        btn_Multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // FrontNumber * Integer.parseInt(text_result.getText().toString());
                // 하게 된다면 프로그램이 강제 종료가 됩니다.
                // 어쩔 수 없이 곱셈은 +, 나눗셈은 -로 지정하였습니다.
                Front_Number = Front_Number + Integer.parseInt(text_result.getText().toString());
                text_result.setText(Mul);
                type = mul;
            }
        });

        btn_Divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Front_Number = Front_Number - (Integer.parseInt(text_result.getText().toString()));
                text_result.setText(Div);
                type = div;
            }
        });


        btn_Equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(type==add){
                    int result = Integer.parseInt(text_result.getText().toString()) + Front_Number;
                    text_result.setText(result + "");
                }else if(type == sub){
                    int result1 = Integer.parseInt(text_result.getText().toString()) - Front_Number;
                    text_result.setText(result1 + "");
                }else if(type == mul){
                    //result = Front_Number * Front_Number;
                    //BigDecimal result = new BigDecimal("0");
                    //result = (new BigDecimal(Front_Number)).multiply(new BigDecimal(Front_Number));
                    int result2 = Integer.parseInt(text_result.getText().toString()) * Front_Number;
                    text_result.setText(result2 + "");
                }else if(type == div){
                    int result3 = Integer.parseInt(text_result.getText().toString()) / Front_Number;
                    text_result.setText(result3 + "");
                }
            }
        });
    }
}
