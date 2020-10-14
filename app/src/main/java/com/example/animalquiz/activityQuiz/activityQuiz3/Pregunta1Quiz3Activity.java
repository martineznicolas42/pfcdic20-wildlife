package com.example.animalquiz.activityQuiz.activityQuiz3;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.Html;
import android.text.InputType;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.animalquiz.R;

public class Pregunta1Quiz3Activity extends AppCompatActivity {

    TextView tv_pregunta1;
    TextView tvPuntos;
    EditText etR1;
    TextView tvCorrectas;
    ImageView imgFotoRespuesta;
    Button btnContinuar;
    Button btnCorregir;

    int correcto = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta1_quiz3);

        tvPuntos = findViewById(R.id.tvPuntos);
        tv_pregunta1 = findViewById(R.id.tv_pregunta1_quiz3);
        etR1 = findViewById(R.id.etLetra1);
        btnContinuar = findViewById(R.id.btnContinuar);
        imgFotoRespuesta = findViewById(R.id.imgFotoRespuesta);
        btnCorregir = findViewById(R.id.btnCorregir);

        tvPuntos.setText("Puntos: 0");

        etR1.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_FLAG_NO_SUGGESTIONS);
        imgFotoRespuesta.setVisibility(View.INVISIBLE);
        btnContinuar.setVisibility(View.INVISIBLE);
        tv_pregunta1.setText(Html.fromHtml("El <font color='red'> ? ? ? ? ? </font> come hojas de eucalipto"));
    }

    public void corregirRespuesta(View v){
        String r1 = etR1.getText().toString().trim();

        if (r1.isEmpty()){
            Toast.makeText(this, "Debes introducir la respuesta", Toast.LENGTH_LONG).show();
        }else if (!r1.equalsIgnoreCase("koala")){
            Toast.makeText(this, "Respuesta incorrecta...", Toast.LENGTH_LONG).show();
            etR1.setEnabled(false);
            imgFotoRespuesta.setVisibility(View.VISIBLE);
            btnContinuar.setVisibility(View.VISIBLE);
            btnCorregir.setEnabled(false);
            tv_pregunta1.setText(Html.fromHtml("El <font color='red'> Koala </font> come hojas de eucalito"));
        }else {
            correcto += 1;
            Toast.makeText(this, "Respuesta correcta", Toast.LENGTH_LONG).show();
            tv_pregunta1.setText(Html.fromHtml("El <font color='green'>Koala</font> come hojas de eucalito"));
            tvPuntos.setText("Puntos: " + correcto);
            etR1.setEnabled(false);
            imgFotoRespuesta.setVisibility(View.VISIBLE);
            btnContinuar.setVisibility(View.VISIBLE);
            btnCorregir.setEnabled(false);
        }
    }

    public void pasarPregunta2(View v) {
        Intent pasarPregunta2 = new Intent(this, Pregunta2Quiz3Activity.class);
        pasarPregunta2.putExtra("puntos", correcto);
        startActivity(pasarPregunta2);
    }
}
