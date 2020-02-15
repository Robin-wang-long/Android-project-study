package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    Button btn1; // 数字1
    Button btn2; // 数字2
    Button btn3; // 数字3
    Button btn4; // 数字4
    Button btn5; // 数字5
    Button btn6; // 数字6
    Button btn7; // 数字7
    Button btn8; // 数字8
    Button btn9; // 数字9
    Button btn0; // 数字0
    Button add; // +号
    Button sub; // -号
    Button mul; // *号
    Button div; // 除号
    Button dot; // 小数点
    Button equ; // =号
    Button clear; //清除
    EditText result; // 显示文本


    double num1 = 0, num2 = 0; //计算的数字
    double Result = 0;//计算结果
    int op = 0;//判断操作符
    String opd = " ";//显示操作符
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.bt_1);
        btn2 = findViewById(R.id.bt_2);
        btn3 = findViewById(R.id.bt_3);
        btn4 = findViewById(R.id.bt_4);
        btn5 = findViewById(R.id.bt_5);
        btn6 = findViewById(R.id.bt_6);
        btn7 = findViewById(R.id.bt_7);
        btn8 = findViewById(R.id.bt_8);
        btn9 = findViewById(R.id.bt_9);
        btn0 = findViewById(R.id.bt_0);
        add = findViewById(R.id.bt_jia);
        sub = findViewById(R.id.bt_jian);
        mul = findViewById(R.id.bt_cheng);
        div = findViewById(R.id.bt_chu);
        dot = findViewById(R.id.bt_dian);
        equ = findViewById(R.id.bt_deng);
        clear = findViewById(R.id.bt_clear);
        result = findViewById(R.id.et_result);

        //按钮点击事件

        btn0.setOnClickListener(new click());
        btn1.setOnClickListener(new click());
        btn2.setOnClickListener(new click());
        btn3.setOnClickListener(new click());
        btn4.setOnClickListener(new click());
        btn5.setOnClickListener(new click());
        btn6.setOnClickListener(new click());
        btn7.setOnClickListener(new click());
        btn8.setOnClickListener(new click());
        btn9.setOnClickListener(new click());
        add.setOnClickListener(new click());
        sub.setOnClickListener(new click());
        mul.setOnClickListener(new click());
        div.setOnClickListener(new click());
        dot.setOnClickListener(new click());
        equ.setOnClickListener(new click());
        clear.setOnClickListener(new click());


    }
    class click implements View.OnClickListener{
        public void onClick(View v){
            switch (v.getId()){
                case R.id.bt_0:
                    String mstring = result.getText().toString();
                    mstring += "0";
                    result.setText(mstring);
                    break;
                case R.id.bt_1:
                    String mstring1 = result.getText().toString();
                    mstring1 += "1";
                    result.setText(mstring1);
                    break;
                case R.id.bt_2:
                    String mstring2 = result.getText().toString();
                    mstring2 += "2";
                    result.setText(mstring2);
                    break;
                case R.id.bt_3:
                    String mstring3 = result.getText().toString();
                    mstring3 += "3";
                    result.setText(mstring3);
                    break;
                case R.id.bt_4:
                    String mstring4 = result.getText().toString();
                    mstring4 += "4";
                    result.setText(mstring4);
                    break;
                case R.id.bt_5:
                    String mstring5 = result.getText().toString();
                    mstring5 += "5";
                    result.setText(mstring5);
                    break;
                case R.id.bt_6:
                    String mstring6 = result.getText().toString();
                    mstring6 += "6";
                    result.setText(mstring6);
                    break;
                case R.id.bt_7:
                    String mstring7 = result.getText().toString();
                    mstring7 += "7";
                    result.setText(mstring7);
                    break;
                case R.id.bt_8:
                    String mstring8 = result.getText().toString();
                    mstring8+= "8";
                    result.setText(mstring8);
                    break;
                case R.id.bt_9:
                    String mstring9 = result.getText().toString();
                    mstring9 += "9";
                    result.setText(mstring9);
                    break;
                case R.id.bt_dian:
                    String mstringdian = result.getText().toString();
                    mstringdian += ".";
                    result.setText(mstringdian);
                    break;
                case R.id.bt_jia:
                    String mstringjia = result.getText().toString();
                    if(mstringjia.equals(null)){
                        return;
                    }
                    num1 = Double.valueOf(mstringjia);
                    result.setText(null);
                    op = 1;
                    opd = "+";
                    break;
                case R.id.bt_jian:
                    String mstringjian = result.getText().toString();
                    if (mstringjian.equals(null)){
                        return;
                    }
                    num1 = Double.valueOf(mstringjian);
                    result.setText(null);
                    op = 2;
                    opd = "-";
                    break;
                case R.id.bt_cheng:
                    String mstringcheng = result.getText().toString();
                    if(mstringcheng.equals(null)){
                        return;
                    }
                    num1 = Double.valueOf(mstringcheng);
                    result.setText(null);
                    op = 3;
                    opd = "×";
                    break;
                case R.id.bt_chu:
                    String mstringchu = result.getText().toString();
                    if(mstringchu.equals(null)){
                        return;
                    }
                    num1 = Double.valueOf(mstringchu);
                    result.setText(null);
                    op = 4;
                    opd = "÷";
                    break;
                case R.id.bt_clear:
                    result.setText(null);
                    break;
                case R.id.bt_deng:
                    String mstringdeng = result.getText().toString();
                    if(mstringdeng.equals(null)){
                        return;
                    }
                    num2 = Double.valueOf(mstringdeng);
                    switch (op){
                        case 0:
                            Result = num2;
                            break;
                        case 1:
                            Result = num1+num2;
                            break;
                        case 2:
                            Result = num1-num2;
                            break;
                        case 3:
                            Result = num1 * num2;
                            break;
                        case 4:
                            if(num2 == 0){
                                Result = 0;
                            }
                            Result = num1 / num2;
                            break;
                        default:
                            Result = 0;
                            break;
                    }
                    result.setText(Double.toString(num1) + opd + Double.toString(num2) + "=" + Double.toString(Result));
                    break;
                default:
                    break;
            }
        }
    }

}
