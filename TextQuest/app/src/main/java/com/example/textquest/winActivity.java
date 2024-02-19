package com.example.textquest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.textquest.databinding.ActivityWinBinding;

public class winActivity extends AppCompatActivity {
    Button btn1;
    ImageView iv;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityWinBinding binding = ActivityWinBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        btn1 = binding.nextBtn;
        winScenary winScenary = new winScenary();
        iv = binding.imageView;
        tv = binding.tv;
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = winScenary.next();
                if (s.equals("stop")){
                    Intent intent = new Intent(winActivity.this, MainActivity.class);
                    startActivity(intent);
                } else if (s.equals("Вдруг что-то произошло... Все стало размываться и исчезать из виду...")){
                    iv.setImageResource(R.drawable.nrc);
                    tv.setText(s);
                } else {
                    iv.setImageResource(R.drawable.clock);
                    tv.setText(s);
                }
            }
        });
    }
}