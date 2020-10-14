package com.example.animalquiz.activityQuiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.animalquiz.R;

import java.util.ArrayList;
import java.util.Random;

public class AleatorioQuizActivity extends AppCompatActivity {

    //TODO: Poner sonido al hacer click en la imagen
    //TODO: Incluir idioma ingles

    TextView tvNumPreguntas;
    TextView tvPuntos;
    TextView tvVidas;
    TextView tvPregunta;
    Button btnOpcion1;
    Button btnOpcion2;
    Button btnOpcion3;
    Button btnSiguiente;
    Button btnSalir;

    int puntos = 0;
    int vidas = 3;
    int currentQuestion = 0;
    int pruebaCurrentQuestion = 0;
    int valorDado;
    int correctas = 0;
    int incorrectas = 0;
    ArrayList<Integer> listaAleatorios;

    String[] listaPreguntas = {"¿Dónde vive el León?", "¿Qué animal come hojas de Eucalipto?", "¿Cuántos años vive el Canguro?"};
    String[][] listaOpciones = {{"Europa", "Africa", "America"}, {"Canguro", "Águila real", "Koala"}, {"20 años", "15-30 años", "10-20 años"}};
    String[] listaRespuestas = {"Africa", "Koala", "20 años"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aleatorio_quiz);

        setUpUI();

        actualizarPregunta();

        btnSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (int i = 0; i < listaAleatorios.size(); i++){
                    int numero = listaAleatorios.get(i);
                    tvPregunta.setText(String.valueOf(listaAleatorios.get(i)));
                }
            }
        });

        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent salirQuizAleatorio = new Intent(AleatorioQuizActivity.this, PrincipalQuizActivity.class);
                startActivity(salirQuizAleatorio);
            }
        });

        btnOpcion1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (btnOpcion1.getText().toString().trim().equalsIgnoreCase(listaRespuestas[valorDado])){

                    actualizarPregunta();

                    puntos = puntos + 1;
                    correctas = correctas +1;
                    currentQuestion = currentQuestion + 1;
                    pruebaCurrentQuestion = pruebaCurrentQuestion + 1;
                    tvPuntos.setText("Puntos: " + puntos);
                    tvNumPreguntas.setText("Pregunta " + currentQuestion + " de 3");

                }else {
                    actualizarPregunta();

                    vidas = vidas - 1;
                    incorrectas = incorrectas - 1;
                    currentQuestion = currentQuestion + 1;
                    pruebaCurrentQuestion = pruebaCurrentQuestion + 1;
                    tvVidas.setText("Vidas: " + (vidas));
                    tvNumPreguntas.setText("Pregunta " + currentQuestion + " de 3");
                }
            }
        });

        btnOpcion2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (btnOpcion2.getText().toString().trim().equalsIgnoreCase(listaRespuestas[valorDado])){

                    actualizarPregunta();

                    puntos = puntos + 1;
                    correctas = correctas +1;
                    currentQuestion = currentQuestion + 1;
                    pruebaCurrentQuestion = pruebaCurrentQuestion + 1;
                    tvPuntos.setText("Puntos: " + puntos);
                    tvNumPreguntas.setText("Pregunta " + currentQuestion + " de 3");

                }else {

                    actualizarPregunta();

                    vidas--;
                    incorrectas = incorrectas - 1;
                    currentQuestion = currentQuestion + 1;
                    pruebaCurrentQuestion = pruebaCurrentQuestion + 1;
                    tvVidas.setText("Vidas: " + vidas);
                    tvNumPreguntas.setText("Pregunta " + currentQuestion + " de 3");
                }
            }
        });

        btnOpcion3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (btnOpcion3.getText().toString().trim().equalsIgnoreCase(listaRespuestas[valorDado])){
                    actualizarPregunta();

                    puntos = puntos + 1;
                    correctas = correctas +1;
                    currentQuestion = currentQuestion + 1;
                    pruebaCurrentQuestion = pruebaCurrentQuestion + 1;
                    tvPuntos.setText("Puntos: " + puntos);
                    tvNumPreguntas.setText("Pregunta " + currentQuestion + " de 3");

                }else {
                    actualizarPregunta();

                    vidas--;
                    incorrectas = incorrectas - 1;
                    currentQuestion = currentQuestion + 1;
                    pruebaCurrentQuestion = pruebaCurrentQuestion + 1;
                    tvVidas.setText("Vidas: " + vidas);
                    tvNumPreguntas.setText("Pregunta " + currentQuestion + " de 3");
                }
            }
        });
    }

    private void actualizarPregunta() {

        listaAleatorios = new ArrayList<>(guardarNumeroAleatoriosNoRepetidos(3));

        for (int i = 0; i < listaAleatorios.size(); i++) {
            valorDado = listaAleatorios.get(i);
        }

        tvPregunta.setText(listaPreguntas[valorDado]);

        btnOpcion1.setText(listaOpciones[valorDado][0]);
        btnOpcion2.setText(listaOpciones[valorDado][1]);
        btnOpcion3.setText(listaOpciones[valorDado][2]);

        tvNumPreguntas.setText("Pregunta " + currentQuestion + " de 3");

        if (pruebaCurrentQuestion == listaPreguntas.length - 1){
            Toast.makeText(this, "fin del activity", Toast.LENGTH_LONG).show();
        }
    }

    public void setUpUI() {

        tvNumPreguntas = findViewById(R.id.tvNumPreguntas);
        tvPuntos = findViewById(R.id.tvPuntosQuizAleatorio);
        tvVidas = findViewById(R.id.tvVidasQuizAleatorio);
        tvPregunta = findViewById(R.id.tvPreguntaQuizAleatorio);
        btnOpcion1 = findViewById(R.id.btnOpcion1Aleatorio);
        btnOpcion2 = findViewById(R.id.btnOpcion2Aleatorio);
        btnOpcion3 = findViewById(R.id.btnOpcion3Aleatorio);
        btnSiguiente = findViewById(R.id.btnSiguienteAleatorioQuiz);
        btnSalir = findViewById(R.id.btnSalirAleatorioQuiz);
    }

    //Generamos números aleatorios entre 0 y 3 y comprobamos si está repetido o no. Luego retornamos dicho numero
    public static int gen(ArrayList<Integer> a) {
        Random ra = new Random();
        int numero = ra.nextInt(3);
        if (!a.contains(numero)) {
            return numero;
        }else {
            return gen(a);
        }
    }

    //Guardamos los número aleatorios generados en un arrayList para luego usarlos
    public ArrayList<Integer> guardarNumeroAleatoriosNoRepetidos (int cantidad) {
        ArrayList<Integer> respuesta = new ArrayList<>();
        for (int i = 0; i < cantidad; i++) {
            respuesta.add(gen(respuesta));
        }
        return respuesta;
    }
}
