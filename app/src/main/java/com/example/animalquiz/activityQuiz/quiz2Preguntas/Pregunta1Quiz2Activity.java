package com.example.animalquiz.activityQuiz.quiz2Preguntas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.animalquiz.R;

public class Pregunta1Quiz2Activity extends AppCompatActivity implements View.OnClickListener {

    static final String CLAVE_PUNTOS = "PUNTOS";
    private Button btnOpcion1Lince;
    private Button btnOpcion2Lince;
    private Button btnOpcion3Lince;
    private Button btnOpcion4Lince;
    private Button btnSiguiente;

    double puntos = 0;
    int correcto = 0;
    int incorrecto = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta1_quiz2);

        btnOpcion1Lince = findViewById(R.id.btnOpcion1Lince);
        btnOpcion2Lince = findViewById(R.id.btnOpcion2Lince);
        btnOpcion3Lince = findViewById(R.id.btnOpcion3Lince);
        btnOpcion4Lince = findViewById(R.id.btnOpcion4Lince);
        btnSiguiente = findViewById(R.id.btnSiguienteQ2);

        btnOpcion1Lince.setOnClickListener(this);
        btnOpcion2Lince.setOnClickListener(this);
        btnOpcion3Lince.setOnClickListener(this);
        btnOpcion4Lince.setOnClickListener(this);
        btnSiguiente.setOnClickListener(this);
    }

    public void onClick (View v) {
        switch (v.getId()){
            case R.id.btnOpcion1Lince:
                deshabilitarOpcion1();
                correcto = correcto + 1;
                incorrecto = incorrecto;
                puntos += 2;
                    break;
            case R.id.btnOpcion2Lince:
                deshabilitarOpcion2();
                puntos = puntos;
                incorrecto = incorrecto + 1;
                correcto = correcto;
                    break;
            case R.id.btnOpcion3Lince:
                deshabilitarOpcion3();
                correcto = correcto;
                incorrecto = incorrecto + 1;
                puntos = puntos;
                    break;
            case R.id.btnOpcion4Lince:
                incorrecto = incorrecto + 1;
                correcto = correcto;
                puntos = puntos;
                deshabilitarOpcion4();
                    break;
            case R.id.btnSiguienteQ2:
                Intent i = new Intent(Pregunta1Quiz2Activity.this, Pregunta2Quiz2Activity.class);
                i.putExtra("puntos", puntos);
                i.putExtra("correctas", correcto);
                i.putExtra("incorrectas", incorrecto);
                startActivity(i);
                    break;
        }
    }

    private void deshabilitarOpcion4() {
        btnOpcion1Lince.setBackgroundColor(Color.GREEN);
        btnOpcion4Lince.setBackgroundColor(Color.RED);

        btnOpcion1Lince.setEnabled(false);
        btnOpcion2Lince.setEnabled(false);
        btnOpcion3Lince.setEnabled(false);
        btnOpcion4Lince.setEnabled(false);
        btnSiguiente.setEnabled(true);
    }

    private void deshabilitarOpcion3() {
        btnOpcion1Lince.setBackgroundColor(Color.GREEN);
        btnOpcion3Lince.setBackgroundColor(Color.RED);

        btnOpcion1Lince.setEnabled(false);
        btnOpcion2Lince.setEnabled(false);
        btnOpcion3Lince.setEnabled(false);
        btnOpcion4Lince.setEnabled(false);
        btnSiguiente.setEnabled(true);
    }

    private void deshabilitarOpcion2() {
        btnOpcion1Lince.setBackgroundColor(Color.GREEN);
        btnOpcion2Lince.setBackgroundColor(Color.RED);

        btnOpcion1Lince.setEnabled(false);
        btnOpcion2Lince.setEnabled(false);
        btnOpcion3Lince.setEnabled(false);
        btnOpcion4Lince.setEnabled(false);
        btnSiguiente.setEnabled(true);
    }

    private void deshabilitarOpcion1() {
        btnOpcion1Lince.setBackgroundColor(Color.GREEN);

        btnOpcion1Lince.setEnabled(false);
        btnOpcion2Lince.setEnabled(false);
        btnOpcion3Lince.setEnabled(false);
        btnOpcion4Lince.setEnabled(false);
        btnSiguiente.setEnabled(true);
    }
}
