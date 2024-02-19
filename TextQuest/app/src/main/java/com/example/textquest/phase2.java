package com.example.textquest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.textquest.databinding.ActivityPhase2Binding;

public class phase2 extends AppCompatActivity {
    ImageView iv;
    Button next;
    TextView tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityPhase2Binding binding = ActivityPhase2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        iv = binding.iv;
        next = binding.nextBtn;
        tv = binding.tv;
        scenaryPhase2 s = new scenaryPhase2();
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phrase = s.nextPhrase();
                Log.d("phrase", phrase);
                if (phrase.equals("stop")) {
                    Intent intent = new Intent(phase2.this, question2.class);
                    startActivity(intent);
                } else if(phrase.equals("-Конечно можно! Проходите!\nО черт, это Крапов, мне пизд...")){
                    tv.setText(phrase);
                    iv.setImageResource(R.drawable.krapov);
                }
                else if(phrase.equals("Вот я уже сижу в аудитории и решаю билет. Ну, вроде готов.\n-Можно сдать?")){
                    tv.setText(phrase);
                    iv.setImageResource(R.drawable.auditory);

                }else {
                    tv.setText(phrase);
                }
            }
        });
    }
}