package com.example.asdscreening;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class EleventhQuestionActivity extends AppCompatActivity implements View.OnClickListener {
   private ImageView ivQ111;
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eleventh_question);

        ivQ111 = findViewById(R.id.iv_q111);
        ivQ111.setOnClickListener(this);
//        btnq111.setOnClickListener(new View.OnClickListener(){

    }

    @Override
    public void onClick(View v) {
        if(v == ivQ111){
            Intent intent= new Intent(EleventhQuestionActivity.this, TwelvethQuestionActivity.class);
            startActivity(intent);
        }
    }
}
