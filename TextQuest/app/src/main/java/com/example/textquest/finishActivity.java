package com.example.textquest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.textquest.databinding.ActivityFinishBinding;

public class finishActivity extends AppCompatActivity {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityFinishBinding binding = ActivityFinishBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        btn = binding.nextBtn;
        btn.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                Intent intent = new Intent(finishActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}