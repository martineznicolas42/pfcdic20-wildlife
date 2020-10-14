package com.example.animalquiz.activityQuiz.activityQuiz3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.animalquiz.R;

public class PrincipalQuiz3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal_quiz3);
    }

    public void comenzarQuiz3 (View v){
        Intent entrarQuiz3 = new Intent(PrincipalQuiz3Activity.this, Pregunta1Quiz3Activity.class);
        startActivity(entrarQuiz3);
    }
}
