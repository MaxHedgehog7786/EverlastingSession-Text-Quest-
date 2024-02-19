package com.example.textquest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.textquest.databinding.ActivityPhase1Binding;
import com.example.textquest.databinding.ActivityQuestion1Binding;

public class question1 extends AppCompatActivity {
    Button next,finish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityQuestion1Binding binding = ActivityQuestion1Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        next = binding.nextBtn;
        finish = binding.finishBtn;
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(question1.this, phase2.class);
                startActivity(intent);
            }
        });
        finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(question1.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}