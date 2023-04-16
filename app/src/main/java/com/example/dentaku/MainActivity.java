package com.example.dentaku;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView, textView2, result;
    Button button, button2, button3, button4, button5;
    EditText editText1, editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        result = findViewById(R.id.result);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strNum1 = editText1.getText().toString();
                String strNum2 = editText2.getText().toString();

                try {
                    int num1 = Integer.parseInt(strNum1);
                    int num2 = Integer.parseInt(strNum2);
                    int res = num1 - num2;
                    result.setText(String.valueOf(res));
                } catch (NumberFormatException e) {
                    Toast.makeText(MainActivity.this, "数値を入力してください", Toast.LENGTH_SHORT).show();
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strNum1 = editText1.getText().toString();
                String strNum2 = editText2.getText().toString();

                try {
                    int num1 = Integer.parseInt(strNum1);
                    int num2 = Integer.parseInt(strNum2);
                    int res = num1 + num2;
                    result.setText(String.valueOf(res));
                } catch (NumberFormatException e) {
                    Toast.makeText(MainActivity.this, "数値を入力してください", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strNum1 = editText1.getText().toString();
                String strNum2 = editText2.getText().toString();

                try {
                    int num1 = Integer.parseInt(strNum1);
                    int num2 = Integer.parseInt(strNum2);
                    int res = num1 * num2;
                    result.setText(String.valueOf(res));
                } catch (NumberFormatException e) {
                    Toast.makeText(MainActivity.this, "数値を入力してください", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strNum1 = editText1.getText().toString();
                String strNum2 = editText2.getText().toString();

                try {
                    int num1 = Integer.parseInt(strNum1);
                    int num2 = Integer.parseInt(strNum2);
                    int res = num1 % num2;
                    result.setText(String.valueOf(res));
                } catch (NumberFormatException e) {
                    Toast.makeText(MainActivity.this, "数値を入力してください", Toast.LENGTH_SHORT).show();
                } catch (ArithmeticException e) {
                    Toast.makeText(MainActivity.this, "0で除算しようとしています", Toast.LENGTH_SHORT).show();
                }
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText1.setText("");
                editText2.setText("");
                result.setText("result");
            }
        });

    }
}

