package com.example.animalquiz.activityQuiz.activityQuiz3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.animalquiz.R;

public class Pregunta2Quiz3Activity extends AppCompatActivity {

    TextView tv_pregunta2;
    TextView tvPuntos;
    EditText etR2;
    ImageView imgFotoRespuesta;
    Button btnContinuar;
    Button btnCorregir;

    int correcto = 0;
    int recuperamos_puntos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta2_quiz3);

        tvPuntos = findViewById(R.id.tvPuntos);
        tv_pregunta2 = findViewById(R.id.tv_pregunta2_quiz3);
        etR2 = findViewById(R.id.etLetra2);
        btnContinuar = findViewById(R.id.btnContinuar);
        imgFotoRespuesta = findViewById(R.id.imgFotoRespuesta);
        btnCorregir = findViewById(R.id.btnCorregir);

        tvPuntos.setText("Puntos: 0");

        etR2.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_FLAG_NO_SUGGESTIONS);
        imgFotoRespuesta.setVisibility(View.INVISIBLE);
        btnContinuar.setVisibility(View.INVISIBLE);
        tv_pregunta2.setText(Html.fromHtml("El <font color='red'> ? ? ? ? </font> puede llegar a pesar 190 kgs"));

        Bundle datos = this.getIntent().getExtras();
        recuperamos_puntos = datos.getInt("puntos");

        tvPuntos.setText("Puntos: " + recuperamos_puntos);
    }

    public void corregirRespuesta(View v){
        String r1 = etR2.getText().toString().trim();

        if (r1.isEmpty()){
            Toast.makeText(this, "Debes introducir la respuesta", Toast.LENGTH_LONG).show();
        }else if (!r1.equalsIgnoreCase("leon")){
            Toast.makeText(this, "Respuesta incorrecta...", Toast.LENGTH_LONG).show();
            etR2.setEnabled(false);
            imgFotoRespuesta.setVisibility(View.VISIBLE);
            btnContinuar.setVisibility(View.VISIBLE);
            btnCorregir.setEnabled(false);
            tv_pregunta2.setText(Html.fromHtml("El <font color='red'> León </font> puede llegar a pesar 190 kgs"));
        }else {
            correcto = recuperamos_puntos + 1;
            Toast.makeText(this, "Respuesta correcta", Toast.LENGTH_LONG).show();
            tv_pregunta2.setText(Html.fromHtml("El <font color='green'> León </font> puede llegar a pesar 190 kgs"));
            tvPuntos.setText("Puntos: " + correcto);
            etR2.setEnabled(false);
            imgFotoRespuesta.setVisibility(View.VISIBLE);
            btnContinuar.setVisibility(View.VISIBLE);
            btnCorregir.setEnabled(false);
        }
    }
}
