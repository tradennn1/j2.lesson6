package com.example.twoproject;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView reg,zabyl,vypolni,dobro,vhod;
    Button button;
    EditText email,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        reg = findViewById(R.id.reg);
        zabyl = findViewById(R.id.zabyl);
        dobro = findViewById(R.id.dobro);
        vypolni = findViewById(R.id.vypolni);
        vhod = findViewById(R.id.vhod);
        button = findViewById(R.id.button);
        email = findViewById(R.id.Email);
        password = findViewById(R.id.password);

        email.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (email.getText().toString().equals("") && password.getText().toString().equals("")){
                    button.setBackgroundColor(Color.YELLOW);
                } else{
                    button.setBackgroundColor(Color.GRAY);
                }
            }
        });

        password.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (email.getText().toString().equals("") && password.getText().toString().equals("")){
                    button.setBackgroundColor(Color.YELLOW);
                } else{
                    button.setBackgroundColor(Color.GRAY);
                }
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (email.getText().toString().equals("admin") && password.getText().toString().equals("admin")){
                    Toast.makeText(MainActivity.this, "Вы успешно зарегистрировались", Toast.LENGTH_SHORT).show();
                    reg.setVisibility(View.GONE);
                    zabyl.setVisibility(View.GONE);
                    vypolni.setVisibility(View.GONE);
                    vhod.setVisibility(View.GONE);
                    email.setVisibility(View.GONE);
                    password.setVisibility(View.GONE);
                    button.setVisibility(View.GONE);
                } else {
                    Toast.makeText(MainActivity.this, "Вы ввели не правильно", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
