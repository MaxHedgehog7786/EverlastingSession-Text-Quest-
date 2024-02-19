package com.example.textquest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.textquest.databinding.ActivityQuestion4Binding;

public class question4 extends AppCompatActivity {
    Button btn1,btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityQuestion4Binding binding = ActivityQuestion4Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        btn1 = binding.finishBtn;
        btn2 = binding.nextBtn;
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(question4.this, Gold.class);
                intent.putExtra("score", 1);
                startActivity(intent);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(question4.this, Gold.class);
                intent.putExtra("score", 0);
                startActivity(intent);
            }
        });
    }
}