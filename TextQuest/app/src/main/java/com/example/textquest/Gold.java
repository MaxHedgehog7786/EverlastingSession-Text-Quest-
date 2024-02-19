package com.example.textquest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.textquest.databinding.ActivityGoldBinding;

public class Gold extends AppCompatActivity {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle arguments = getIntent().getExtras();
        int choice = arguments.getInt("score");
        ActivityGoldBinding binding = ActivityGoldBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        btn = binding.nextBtn;
        double value = Math.random();
        if (value<0.5){
            binding.tv.setText("Крапов подбрасывает монетку... Решка!");
        } else {
            binding.tv.setText("Крапов подбрасывает монетку... Орел!");
        }
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (value<0.5 && choice==0 || value>=0.5 && choice==1){
                    Intent intent = new Intent(Gold.this, winActivity.class);
                    startActivity(intent);
                } else {
                    Intent intent = new Intent(Gold.this, finishActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}