package com.example.animalquiz.activityQuiz.quiz2Preguntas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.animalquiz.R;

public class ResultadosActivity extends AppCompatActivity {

    private TextView tvTotalPuntos;
    private TextView tvAcertadas;
    private TextView tvFalladas;
    private TextView tvMensaje;

    double recuperamos_puntos;

    int recuperamos_correctas;
    int recuperamos_incorrectas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultados);

        Bundle datos = this.getIntent().getExtras();
        Bundle correctas = this.getIntent().getExtras();
        Bundle incorrectas = this.getIntent().getExtras();

        recuperamos_puntos = datos.getDouble("puntosA");
        recuperamos_correctas = correctas.getInt("correctasA");
        recuperamos_incorrectas = incorrectas.getInt("incorrectasA");

        tvTotalPuntos = findViewById(R.id.tvTotalPuntosQ2);
        tvAcertadas = findViewById(R.id.tvAcertadasQ2);
        tvFalladas = findViewById(R.id.tvFalladasQ2);
        tvMensaje = findViewById(R.id.tvMensajeQ2);

        resultadosSegunDatos();
    }

    public void resultadosSegunDatos (){
        tvTotalPuntos.setText("Has tenido un total de: " + recuperamos_puntos + " puntos");
        tvAcertadas.setText("Has acertado: " + recuperamos_correctas + " preguntas de 4 preguntas");
        tvFalladas.setText("Has fallado: " + recuperamos_incorrectas + " preguntas de 4 preguntas");

        if (recuperamos_puntos < 4.0){
            tvMensaje.setText("Podías haberlo hecho mucho mejor!!! sigue intentándolo");
        }else if (recuperamos_puntos >= 4.0 && recuperamos_puntos < 8.0 ){
            tvMensaje.setText("No está nada mal!! Ánimo puedes acertar todas");
        }else if (recuperamos_puntos >= 8.0){
            tvMensaje.setText("Enhorabuena!!! No has tenido ningún fallo, así se hace");
        }
    }
}
