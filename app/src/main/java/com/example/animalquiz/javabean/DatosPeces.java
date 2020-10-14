package com.example.animalquiz.javabean;

import com.example.animalquiz.R;

import java.util.ArrayList;

public class DatosPeces {
    private ArrayList<Peces> listaPeces;

    public DatosPeces() {
        listaPeces = new ArrayList<Peces>();

        rellenarLista();
    }

    private void rellenarLista() {

        listaPeces.add(new Peces("Europa","Barbo mediterráneo", R.drawable.barbomediterraneo, R.drawable.iconoeuropa ,"Mammalia", "", "2,8 m", "6 años aprox.", "Hervíboros. Comen hojas o vegetales",
                "Si", "Zonas áridas, como estepas o sabanas"));

        listaPeces.add(new Peces("América del Norte","Pez Gato", R.drawable.pezgato, R.drawable.iconoamericanorte ,"Mammalia", "", "2,8 m", "6 años aprox.", "Hervíboros. Comen hojas o vegetales",
                "Si", "Zonas áridas, como estepas o sabanas"));

        listaPeces.add(new Peces("América del Sur","Piraña", R.drawable.pirana, R.drawable.iconoamericasur ,"Mammalia", "", "2,8 m", "6 años aprox.", "Hervíboros. Comen hojas o vegetales",
                "Si", "Zonas áridas, como estepas o sabanas"));

        listaPeces.add(new Peces("Asia","Carpa plateada", R.drawable.carpaplateada, R.drawable.iconoasia ,"Mammalia", "", "2,8 m", "6 años aprox.", "Hervíboros. Comen hojas o vegetales",
                "Si", "Zonas áridas, como estepas o sabanas"));

        listaPeces.add(new Peces("Oceanía","Dragón de mar", R.drawable.dragondemar, R.drawable.iconooceania ,"Mammalia", "", "2,8 m", "6 años aprox.", "Hervíboros. Comen hojas o vegetales",
                "Si", "Zonas áridas, como estepas o sabanas"));

        listaPeces.add(new Peces("Africa","Tilapia", R.drawable.tilapia, R.drawable.iconoafrica ,"Mammalia", "", "2,8 m", "6 años aprox.", "Hervíboros. Comen hojas o vegetales",
                "Si", "Zonas áridas, como estepas o sabanas"));
    }

    public ArrayList<Peces> getListaPeces(){
        return listaPeces;
    }
}
