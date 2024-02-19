package com.example.textquest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.textquest.databinding.ActivityPhase1Binding;

public class phase1 extends AppCompatActivity {
    TextView tv;
    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityPhase1Binding binding = ActivityPhase1Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        tv = binding.tv;
        next = binding.nextBtn;
        scenaryPhase1 s = new scenaryPhase1();
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phrase = s.nextPhrase();
                if (phrase.equals("stop")) {
                    Intent intent = new Intent(phase1.this, question1.class);
                    startActivity(intent);
                } else {
                    tv.setText(phrase);
                }
            }
        });
    }
}