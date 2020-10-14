package com.example.animalquiz.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.animalquiz.R;
import com.example.animalquiz.javabean.Anfibios;
import com.example.animalquiz.javabean.Aves;

import uk.co.senab.photoview.PhotoViewAttacher;

public class DatosAnfibiosCompletosActivity extends AppCompatActivity {

    private TextView tvContinenteAn;
    private ImageView imgFotoAnimalAn;
    private TextView tvClaseAn;
    private TextView tvNomAnimalAn;
    private TextView tvPesoAdultoAn;
    private TextView tvLongitudAdultoAn;
    private TextView tvPromedioVidaAn;
    private TextView tvAlimentacionAn;
    private TextView tvPeligrosoAn;
    private TextView tvDondeViveAn;
    private ImageView imgFotoContinenteAn;

    private PhotoViewAttacher photoViewAttacher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos_anfibios_completos);

        tvContinenteAn = findViewById(R.id.tvContinenteAn);
        tvNomAnimalAn = findViewById(R.id.tvNomAn);
        imgFotoAnimalAn = findViewById(R.id.imgAnimalAn);
        tvClaseAn = findViewById(R.id.tvClaseAn);
        tvPesoAdultoAn = findViewById(R.id.tvPesoAdultoAn);
        tvLongitudAdultoAn = findViewById(R.id.tvLongitudAdultoAn);
        tvPromedioVidaAn = findViewById(R.id.tvPromedioVidaAn);
        tvAlimentacionAn = findViewById(R.id.tvAlimentacionAn);
        tvPeligrosoAn = findViewById(R.id.tvPeligrosoAn);
        tvDondeViveAn = findViewById(R.id.tvDondeViveAn);
        imgFotoContinenteAn = findViewById(R.id.imgContinenteAn);

        Anfibios an = getIntent().getParcelableExtra(AnfibiosActivity.CLAVE_ANFIBIOS);

        tvNomAnimalAn.setText(Html.fromHtml("<strong><big> " + an.getNombreAn() + "</big></strong>"));
        imgFotoContinenteAn.setImageResource(an.getIdFotoContinenteAn());
        imgFotoAnimalAn.setImageResource(an.getIdFotoAnimalAn());
        tvClaseAn.setText(Html.fromHtml("<strong>Clase:</strong> " + " <br><small>" + an.getClaseAn() + "</br></small>"));
        tvPesoAdultoAn.setText(Html.fromHtml("<strong>Peso adulto:</strong> " + " <br><small>" + an.getPesoAdultoAn() + "</br></small>"));
        tvLongitudAdultoAn.setText(Html.fromHtml("<strong>Longitud adulto:</strong> " + " <br><small>" + an.getLongitudAdultoAn() + "</br></small>"));
        tvPromedioVidaAn.setText(Html.fromHtml("<strong>Promedio vida:</strong> " + " <br><small>" + an.getPromedioVidaAn() + "</br></small>"));
        tvAlimentacionAn.setText(Html.fromHtml("<strong>Alimentación:</strong> " + " <br><small>" + an.getAlimentacionAn() + "</br></small>"));
        tvPeligrosoAn.setText(Html.fromHtml("<strong>Peligroso:</strong> " + " <br><small>" + an.getPeligrosoAn() + "</br></small>"));
        tvDondeViveAn.setText(Html.fromHtml("<strong>Dónde vive:</strong> " + " <br><small>" + an.getDondeViveAn() + "</br></small>"));
        tvContinenteAn.setText(Html.fromHtml("<strong>Continente:</strong> " + " <br><small>" + an.getContinenteAn() + "</br></small>"));

        photoViewAttacher = new PhotoViewAttacher(imgFotoAnimalAn);
    }
}
