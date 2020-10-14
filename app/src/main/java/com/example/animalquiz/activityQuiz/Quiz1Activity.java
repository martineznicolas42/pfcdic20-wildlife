package com.example.animalquiz.activityQuiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.animalquiz.R;

import java.util.Locale;

public class Quiz1Activity extends AppCompatActivity {

    private int ids_answers[] = {
            R.id.rb1, R.id.rb2, R.id.rb3, R.id.rb4
    };

    private int correct_answer;
    private int current_question;
    private String[] all_questions;
    private boolean[] answer_is_correct;
    private int[] answer;
    private TextView text_question;
    private RadioGroup group;
    private Button btn_next, btn_prev;
    private TextView tvCorregido;
    private Button btnSalir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        text_question = findViewById(R.id.tv_pregunta);
        tvCorregido = findViewById(R.id.tvCorregido);
        group = findViewById(R.id.answer_group);

        btn_next = findViewById(R.id.btnSiguiente);
        btn_prev = findViewById(R.id.btnAnterior);
        btnSalir = findViewById(R.id.btnSalir);

        all_questions = getResources().getStringArray(R.array.all_questions);
        answer_is_correct = new boolean[all_questions.length];
        answer = new int[all_questions.length];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = -1;
        }
        current_question = 0;

        showQuestion();

        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer();
                if (current_question < all_questions.length-1) {
                    current_question++;
                    showQuestion();
                } else {
                    int correctas = 0, incorrectas = 0, puntos = 0;
                    for (boolean b : answer_is_correct) {
                        if (b) {
                            correctas++;
                            puntos += 1;
                        }else {
                            incorrectas++;
                        }
                    }
                    tvCorregido.setText("Puntos: " + puntos + "\n"
                        + "Correctas: " + correctas + "\n"
                        + "Incorrectas: " + incorrectas);
                    btnSalir.setVisibility(View.VISIBLE);
                }
            }
        });

        btn_prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer();
                if (current_question > 0) {
                    current_question--;
                    showQuestion();
                }
                btnSalir.setVisibility(View.GONE);
            }
        });
    }

    private void checkAnswer() {
        int id = group.getCheckedRadioButtonId();
        int ans = -1;
        for (int i = 0; i < ids_answers.length; i++) {
            if (ids_answers[i] == id) {
                ans = i;
            }
        }
        answer_is_correct[current_question] = (ans == correct_answer);
        answer[current_question] = ans;
        btnSalir.setVisibility(View.GONE);
    }

    private void showQuestion() {
        String q = all_questions[current_question];
        String[] parts = q.split(";");

        group.clearCheck();

        text_question.setText(parts[0]);
        for (int i = 0; i < ids_answers.length; i++) {
            RadioButton rb = (RadioButton) findViewById(ids_answers[i]);
            String ans = parts[i+1];
            if (ans.charAt(0) == '*') {
                correct_answer = i;
                ans = ans.substring(1);
            }
            rb.setText(ans);
            if (answer[current_question] == i) {
                rb.setChecked(true);
            }
        }
        if (current_question == 0) {
            btn_prev.setVisibility(View.GONE);
            btnSalir.setVisibility(View.GONE);
        } else {
            btn_prev.setVisibility(View.VISIBLE);
            btnSalir.setVisibility(View.GONE);
        }
        if (current_question == all_questions.length-1) {
            btn_next.setText(R.string.finish);
        } else {
            btn_next.setText(R.string.next);
        }
    }

    public void salirPrincipalQuiz(View v){
        Intent salirJuego = new Intent(this, PrincipalQuizActivity.class);
        startActivity(salirJuego);
    }
}
