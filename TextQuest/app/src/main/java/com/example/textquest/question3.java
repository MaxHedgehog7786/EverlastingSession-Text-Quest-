package com.example.textquest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.textquest.databinding.ActivityQuestion3Binding;

public class question3 extends AppCompatActivity {
    Button btn1,btn2,btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityQuestion3Binding binding = ActivityQuestion3Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        btn1 = binding.finishBtn;
        btn2 = binding.nextBtn;
        btn3 = binding.nextBtn2;
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(question3.this, finishActivity.class);
                startActivity(intent);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(question3.this, finishActivity.class);
                startActivity(intent);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(question3.this, phase4.class);
                startActivity(intent);
            }
        });

    }
}