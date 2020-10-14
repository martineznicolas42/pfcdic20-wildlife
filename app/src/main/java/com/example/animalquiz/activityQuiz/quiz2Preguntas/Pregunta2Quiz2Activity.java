package com.example.animalquiz.activityQuiz.quiz2Preguntas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.animalquiz.R;

public class Pregunta2Quiz2Activity extends AppCompatActivity implements View.OnClickListener{

    private Button btnOpcion1Leon;
    private Button btnOpcion2Leon;
    private Button btnOpcion3Leon;
    private Button btnOpcion4Leon;
    private Button btnSiguiente;

    double puntosL;
    double recuperamos_puntos;
    int correctasL;
    int incorrectasL;

    int recuperamos_correctas;
    int recuperamos_incorrectas;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta2_quiz2);

        btnOpcion1Leon = findViewById(R.id.btnOpcion1Leon);
        btnOpcion2Leon = findViewById(R.id.btnOpcion2Leon);
        btnOpcion3Leon = findViewById(R.id.btnOpcion3Leon);
        btnOpcion4Leon = findViewById(R.id.btnOpcion4Leon);
        btnSiguiente = findViewById(R.id.btnSiguienteQ2);

        btnOpcion1Leon.setOnClickListener(this);
        btnOpcion2Leon.setOnClickListener(this);
        btnOpcion3Leon.setOnClickListener(this);
        btnOpcion4Leon.setOnClickListener(this);
        btnSiguiente.setOnClickListener(this);

        Bundle datos = this.getIntent().getExtras();
        Bundle correctas = this.getIntent().getExtras();
        Bundle incorrectas = this.getIntent().getExtras();

        recuperamos_puntos = datos.getDouble("puntos");
        recuperamos_correctas = correctas.getInt("correctas");
        recuperamos_incorrectas = incorrectas.getInt("incorrectas");
    }

    public void onClick (View v) {
        switch (v.getId()){
            case R.id.btnOpcion1Leon:
                deshabilitarOpcion1();
                puntosL = recuperamos_puntos;
                incorrectasL = recuperamos_incorrectas + 1;
                correctasL = recuperamos_correctas;
                break;
            case R.id.btnOpcion2Leon:
                deshabilitarOpcion2();
                incorrectasL = recuperamos_incorrectas + 1;
                correctasL = recuperamos_correctas;
                puntosL = recuperamos_puntos;
                break;
            case R.id.btnOpcion3Leon:
                deshabilitarOpcion3();
                correctasL = recuperamos_correctas + 1;
                incorrectasL = recuperamos_incorrectas;
                puntosL = recuperamos_puntos + 2;
                break;
            case R.id.btnOpcion4Leon:
                deshabilitarOpcion4();
                incorrectasL = recuperamos_incorrectas + 1;
                correctasL = recuperamos_correctas;
                puntosL = recuperamos_puntos;
                break;
            case R.id.btnSiguienteQ2:
                Intent i = new Intent(Pregunta2Quiz2Activity.this, Pregunta3Quiz2Activity.class);
                i.putExtra("puntosL", puntosL);
                i.putExtra("correctasL", correctasL);
                i.putExtra("incorrectasL", incorrectasL);
                startActivity(i);
                break;
        }
    }

    private void deshabilitarOpcion4() {
        btnOpcion4Leon.setBackgroundColor(Color.RED);
        btnOpcion3Leon.setBackgroundColor(Color.GREEN);

        btnOpcion1Leon.setEnabled(false);
        btnOpcion2Leon.setEnabled(false);
        btnOpcion3Leon.setEnabled(false);
        btnOpcion4Leon.setEnabled(false);
        btnSiguiente.setEnabled(true);
    }

    private void deshabilitarOpcion3() {
        btnOpcion3Leon.setBackgroundColor(Color.GREEN);

        btnOpcion1Leon.setEnabled(false);
        btnOpcion2Leon.setEnabled(false);
        btnOpcion3Leon.setEnabled(false);
        btnOpcion4Leon.setEnabled(false);
        btnSiguiente.setEnabled(true);
    }

    private void deshabilitarOpcion2() {
        btnOpcion2Leon.setBackgroundColor(Color.RED);
        btnOpcion3Leon.setBackgroundColor(Color.GREEN);

        btnOpcion1Leon.setEnabled(false);
        btnOpcion2Leon.setEnabled(false);
        btnOpcion3Leon.setEnabled(false);
        btnOpcion4Leon.setEnabled(false);
        btnSiguiente.setEnabled(true);
    }

    private void deshabilitarOpcion1() {
        btnOpcion1Leon.setBackgroundColor(Color.RED);
        btnOpcion3Leon.setBackgroundColor(Color.GREEN);

        btnOpcion1Leon.setEnabled(false);
        btnOpcion2Leon.setEnabled(false);
        btnOpcion3Leon.setEnabled(false);
        btnOpcion4Leon.setEnabled(false);
        btnSiguiente.setEnabled(true);
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
