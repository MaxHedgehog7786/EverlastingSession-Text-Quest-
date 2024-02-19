package com.example.textquest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.textquest.databinding.ActivityPhase3Binding;

public class phase3 extends AppCompatActivity {
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityPhase3Binding binding = ActivityPhase3Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        btn = binding.nextBtn;
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(phase3.this, question3.class);
                startActivity(intent);
            }
        });
    }
}