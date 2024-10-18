package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    AppCompatButton btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,
                    btnAdd,btnMul,btnSub,btnDiv,btnClear,btnDot,btnCoast,btnModul,btnEqual;
    TextView tv_input, tv_output;
    String allProcess;
    Boolean check_coast=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0=findViewById(R.id.btn0);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);

        btnAdd=findViewById(R.id.btnAdd);
        btnSub=findViewById(R.id.btnSub);
        btnMul=findViewById(R.id.btnMul);
        btnDiv=findViewById(R.id.btnDiv);

        btnClear=findViewById(R.id.btnClear);
        btnCoast=findViewById(R.id.btnCoast);
        btnDot=findViewById(R.id.btnDot);
        btnModul=findViewById(R.id.btnModul);
        btnEqual=findViewById(R.id.btnEqual);

        tv_input=findViewById(R.id.tv_input);
        tv_output=findViewById(R.id.tv_output);

    }

    public void getbtn0(View view)
    {
        allProcess=tv_input.getText().toString();
        tv_input.setText(allProcess+"0");
    }


    public void getbtn1(View view)
    {
        allProcess=tv_input.getText().toString();
        tv_input.setText(allProcess+"1");
    }

    public void getbtn2(View view)
    {
        allProcess=tv_input.getText().toString();
        tv_input.setText(allProcess+"2");
    }

    public void getbtn3(View view)
    {
        allProcess=tv_input.getText().toString();
        tv_input.setText(allProcess+"3");
    }

    public void getbtn4(View view)
    {
        allProcess=tv_input.getText().toString();
        tv_input.setText(allProcess+"4");
    }

    public void getbtn5(View view)
    {
        allProcess=tv_input.getText().toString();
        tv_input.setText(allProcess+"5");
    }

    public void getbtn6(View view)
    {
        allProcess=tv_input.getText().toString();
        tv_input.setText(allProcess+"6");
    }

    public void getbtn7(View view)
    {
        allProcess=tv_input.getText().toString();
        tv_input.setText(allProcess+"7");
    }

    public void getbtn8(View view)
    {
        allProcess=tv_input.getText().toString();
        tv_input.setText(allProcess+"8");
    }

    public void getbtn9(View view)
    {
        allProcess=tv_input.getText().toString();
        tv_input.setText(allProcess+"9");
    }
    public void getbtnClear(View view)
    {
        tv_input.setText("");
        tv_output.setText("");
    }

    public void get_btn_Add(View view)
    {
        allProcess=tv_input.getText().toString();
        tv_input.setText(allProcess+"+");
    }
    public void getbtnSub(View view)
    {
        allProcess=tv_input.getText().toString();
        tv_input.setText(allProcess+"-");
    }
    public void getbtnMul(View view)
    {
        allProcess=tv_input.getText().toString();
        tv_input.setText(allProcess+"*");
    }
    public void getbtnDiv(View view)
    {
        allProcess=tv_input.getText().toString();
        tv_input.setText(allProcess+"/");
    }
    public void getbtnDot(View view)
    {
        allProcess=tv_input.getText().toString();
        tv_input.setText(allProcess+".");
    }
    public void getbtnModul(View view)
    {
        allProcess=tv_input.getText().toString();
        tv_input.setText(allProcess+"%");
    }
    public void getbtnCoast(View view)
    {
       if(check_coast)
       {
           allProcess=tv_input.getText().toString();
           tv_input.setText(allProcess+")");
           check_coast=false;
       }
       else
       {
           allProcess=tv_input.getText().toString();
           tv_input.setText(allProcess+"(");
           check_coast=true;
       }
    }
    public void get_btn_Equal(View view)
    {
         allProcess=tv_input.getText().toString();

         allProcess=allProcess.replace("%", "/100");
         allProcess=allProcess.replace("/", "/");
         allProcess=allProcess.replace("*", "*");


    }


}