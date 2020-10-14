package com.example.animalquiz.activityQuiz.quiz2Preguntas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.animalquiz.R;

public class Pregunta3Quiz2Activity extends AppCompatActivity implements View.OnClickListener{

    private Button btnOpcionCanguro1;
    private Button btnOpcionCanguro2;
    private Button btnOpcionCanguro3;
    private Button btnOpcionCanguro4;
    private Button btnSiguiente;

    double recuperamos_puntos;
    double puntosC;
    int correctasC;
    int incorrectasC;

    int recuperamos_correctas;
    int recuperamos_incorrectas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta3_quiz2);

        btnOpcionCanguro1 = findViewById(R.id.btnOpcion1Canguro);
        btnOpcionCanguro2 = findViewById(R.id.btnOpcion2Canguro);
        btnOpcionCanguro3 = findViewById(R.id.btnOpcion3Canguro);
        btnOpcionCanguro4 = findViewById(R.id.btnOpcion4Canguro);
        btnSiguiente = findViewById(R.id.btnSiguienteQ2);

        btnOpcionCanguro1.setOnClickListener(this);
        btnOpcionCanguro2.setOnClickListener(this);
        btnOpcionCanguro3.setOnClickListener(this);
        btnOpcionCanguro4.setOnClickListener(this);
        btnSiguiente.setOnClickListener(this);

        Bundle datos = this.getIntent().getExtras();
        Bundle correctas = this.getIntent().getExtras();
        Bundle incorrectas = this.getIntent().getExtras();

        recuperamos_puntos = datos.getDouble("puntosL");
        recuperamos_correctas = correctas.getInt("correctasL");
        recuperamos_incorrectas = incorrectas.getInt("incorrectasL");
    }

    public void onClick (View v) {
        switch (v.getId()){
            case R.id.btnOpcion1Canguro:
                deshabilitarOpcion1();
                incorrectasC = recuperamos_incorrectas + 1;
                correctasC = recuperamos_correctas;
                puntosC = recuperamos_puntos;
                break;
            case R.id.btnOpcion2Canguro:
                deshabilitarOpcion2();
                incorrectasC = recuperamos_incorrectas + 1;
                correctasC = recuperamos_correctas;
                puntosC = recuperamos_puntos;
                break;
            case R.id.btnOpcion3Canguro:
                deshabilitarOpcion3();
                incorrectasC = recuperamos_incorrectas + 1;
                correctasC = recuperamos_correctas;
                puntosC = recuperamos_puntos;
                break;
            case R.id.btnOpcion4Canguro:
                deshabilitarOpcion4();
                correctasC = recuperamos_correctas + 1;
                incorrectasC = recuperamos_incorrectas;
                puntosC = recuperamos_puntos + 2;
                break;
            case R.id.btnSiguienteQ2:
                Intent i = new Intent(Pregunta3Quiz2Activity.this, Pregunta4Quiz2Activity.class);
                i.putExtra("puntosC", puntosC);
                i.putExtra("correctasC", correctasC);
                i.putExtra("incorrectasC", incorrectasC);
                startActivity(i);
                break;
        }
    }

    private void deshabilitarOpcion4() {
        btnOpcionCanguro4.setBackgroundColor(Color.GREEN);

        btnOpcionCanguro1.setEnabled(false);
        btnOpcionCanguro2.setEnabled(false);
        btnOpcionCanguro3.setEnabled(false);
        btnOpcionCanguro4.setEnabled(false);
        btnSiguiente.setEnabled(true);
    }

    private void deshabilitarOpcion3() {
        btnOpcionCanguro4.setBackgroundColor(Color.GREEN);
        btnOpcionCanguro3.setBackgroundColor(Color.RED);

        btnOpcionCanguro1.setEnabled(false);
        btnOpcionCanguro2.setEnabled(false);
        btnOpcionCanguro3.setEnabled(false);
        btnOpcionCanguro4.setEnabled(false);
        btnSiguiente.setEnabled(true);
    }

    private void deshabilitarOpcion2() {
        btnOpcionCanguro4.setBackgroundColor(Color.GREEN);
        btnOpcionCanguro2.setBackgroundColor(Color.RED);

        btnOpcionCanguro1.setEnabled(false);
        btnOpcionCanguro2.setEnabled(false);
        btnOpcionCanguro3.setEnabled(false);
        btnOpcionCanguro4.setEnabled(false);
        btnSiguiente.setEnabled(true);
    }

    private void deshabilitarOpcion1() {
        btnOpcionCanguro4.setBackgroundColor(Color.GREEN);
        btnOpcionCanguro1.setBackgroundColor(Color.RED);

        btnOpcionCanguro1.setEnabled(false);
        btnOpcionCanguro2.setEnabled(false);
        btnOpcionCanguro3.setEnabled(false);
        btnOpcionCanguro4.setEnabled(false);
        btnSiguiente.setEnabled(true);
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
