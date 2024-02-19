package com.example.textquest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.textquest.databinding.ActivityPhase4Binding;

public class phase4 extends AppCompatActivity {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityPhase4Binding binding = ActivityPhase4Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        btn = binding.nextBtn;
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(phase4.this, question4.class);
                startActivity(intent);
            }
        });
    }
}