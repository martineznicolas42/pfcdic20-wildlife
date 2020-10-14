package com.example.animalquiz.activityQuiz.quiz2Preguntas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.animalquiz.R;

public class Pregunta4Quiz2Activity extends AppCompatActivity implements View.OnClickListener{

    private Button btnOpcion1Aguila;
    private Button btnOpcion2Aguila;
    private Button btnOpcion3Aguila;
    private Button btnOpcion4Aguila;
    private Button btnSiguiente;

    double puntosA;
    double recuperamos_puntos;

    int correctasA;
    int incorrectasA;

    int recuperamos_correctas;
    int recuperamos_incorrectas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta4_quiz2);

        btnOpcion1Aguila = findViewById(R.id.btnOpcion1Aguila);
        btnOpcion2Aguila = findViewById(R.id.btnOpcion2Aguila);
        btnOpcion3Aguila = findViewById(R.id.btnOpcion3Aguila);
        btnOpcion4Aguila = findViewById(R.id.btnOpcion4Aguila);
        btnSiguiente = findViewById(R.id.btnSiguienteQ2);

        btnOpcion1Aguila.setOnClickListener(this);
        btnOpcion2Aguila.setOnClickListener(this);
        btnOpcion3Aguila.setOnClickListener(this);
        btnOpcion4Aguila.setOnClickListener(this);
        btnSiguiente.setOnClickListener(this);

        Bundle datos = this.getIntent().getExtras();
        Bundle correctas = this.getIntent().getExtras();
        Bundle incorrectas = this.getIntent().getExtras();

        recuperamos_puntos = datos.getDouble("puntosC");
        recuperamos_correctas = correctas.getInt("correctasC");
        recuperamos_incorrectas = incorrectas.getInt("incorrectasC");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnOpcion1Aguila:
                deshabilitarOpcion1();
                incorrectasA = recuperamos_incorrectas + 1;
                correctasA = recuperamos_correctas;
                puntosA = recuperamos_puntos;
                break;
            case R.id.btnOpcion2Aguila:
                deshabilitarOpcion2();
                correctasA = recuperamos_correctas + 1;
                incorrectasA = recuperamos_incorrectas;
                puntosA = recuperamos_puntos + 2;
                break;
            case R.id.btnOpcion3Aguila:
                deshabilitarOpcion3();
                incorrectasA = recuperamos_incorrectas + 1;
                correctasA = recuperamos_correctas;
                puntosA = recuperamos_puntos;
                break;
            case R.id.btnOpcion4Aguila:
                deshabilitarOpcion4();
                incorrectasA = recuperamos_incorrectas + 1;
                correctasA = recuperamos_correctas;
                puntosA = recuperamos_puntos;
                break;
            case R.id.btnSiguienteQ2:
                Intent i = new Intent(Pregunta4Quiz2Activity.this, ResultadosActivity.class);
                i.putExtra("puntosA", puntosA);
                i.putExtra("correctasA", correctasA);
                i.putExtra("incorrectasA", incorrectasA);
                startActivity(i);
                break;
        }
    }

    private void deshabilitarOpcion4() {
        btnOpcion4Aguila.setBackgroundColor(Color.RED);
        btnOpcion2Aguila.setBackgroundColor(Color.GREEN);

        btnOpcion1Aguila.setEnabled(false);
        btnOpcion2Aguila.setEnabled(false);
        btnOpcion3Aguila.setEnabled(false);
        btnOpcion4Aguila.setEnabled(false);
        btnSiguiente.setEnabled(true);
    }

    private void deshabilitarOpcion3() {
        btnOpcion3Aguila.setBackgroundColor(Color.RED);
        btnOpcion2Aguila.setBackgroundColor(Color.GREEN);

        btnOpcion1Aguila.setEnabled(false);
        btnOpcion2Aguila.setEnabled(false);
        btnOpcion3Aguila.setEnabled(false);
        btnOpcion4Aguila.setEnabled(false);
        btnSiguiente.setEnabled(true);
    }

    private void deshabilitarOpcion2() {
        btnOpcion2Aguila.setBackgroundColor(Color.GREEN);

        btnOpcion1Aguila.setEnabled(false);
        btnOpcion2Aguila.setEnabled(false);
        btnOpcion3Aguila.setEnabled(false);
        btnOpcion4Aguila.setEnabled(false);
        btnSiguiente.setEnabled(true);
    }

    private void deshabilitarOpcion1() {
        btnOpcion1Aguila.setBackgroundColor(Color.RED);
        btnOpcion2Aguila.setBackgroundColor(Color.GREEN);

        btnOpcion1Aguila.setEnabled(false);
        btnOpcion2Aguila.setEnabled(false);
        btnOpcion3Aguila.setEnabled(false);
        btnOpcion4Aguila.setEnabled(false);
        btnSiguiente.setEnabled(true);
    }
}
