package com.example.animalquiz.javabean;

import com.example.animalquiz.R;

import java.util.ArrayList;

public class DatosReptiles {
    private ArrayList<Reptiles> listaReptiles;

    public DatosReptiles() {
        listaReptiles = new ArrayList<Reptiles>();

        rellenarLista();
    }

    private void rellenarLista() {

        listaReptiles.add(new Reptiles("Europa","Galápago leproso", R.drawable.galapagoleproso, R.drawable.iconoeuropa ,"Reptil", "¿?", "Suelen medir 100 - 180 mm pero pueden llegar a 200 mm", "Su media de vida es de 20 años", "Las tortugas más jóvenes tienden a ser carnívoras. (comen más proteína animal), y cuando crecen se vuelven más herbívoras. Cuando son menores de 3 años, necesitan muchas proteínas pues están" +
                " en una etapa crucial de su crecimiento. Suelen alimentarse de grillos, caracoles de agua, gambusia, lombrices de tierra y otros pequeños animales.",
                "NO", "Común sobre todo en el sur de España. Vive en masas de agua dulce como ríos o pantanos."));

        listaReptiles.add(new Reptiles("América del Norte","Serpiente del lodo", R.drawable.serpientedellodo, R.drawable.iconoamericanorte ,"Mammalia", "", "1 a 1,4 m, aunque puede alcanzar una longitud de 2 m", "6 años aprox.", "Hervíboros. Comen hojas o vegetales",
                "Si", "Zonas áridas, como estepas o sabanas"));

        listaReptiles.add(new Reptiles("América del Sur","Boa constrictor", R.drawable.boaconstrictor, R.drawable.iconoamericasur ,"Mammalia", "10 – 15 kg", "2,1 – 3 m", "Entre 15 - 20 años en libertad", "Se alimenta de ratas y los ratones",
                "Si", "Vive en zonas con poca agua, como sabanas y desiertos."));

        listaReptiles.add(new Reptiles("Asia","Krait rayado", R.drawable.kraitrayada, R.drawable.iconoasia ,"Mammalia", "", "2,8 m", "6 años aprox.", "Hervíboros. Comen hojas o vegetales",
                "Si", "Zonas áridas, como estepas o sabanas"));

        listaReptiles.add(new Reptiles("Oceanía","Diablo espinoso", R.drawable.diabloespinoso, R.drawable.iconooceania ,"Mammalia", "", "2,8 m", "6 años aprox.", "Hervíboros. Comen hojas o vegetales",
                "Si", "Zonas áridas, como estepas o sabanas"));

        listaReptiles.add(new Reptiles("Africa","Mamba negra", R.drawable.mambanegra, R.drawable.iconoafrica ,"Mammalia", "", "2,8 m", "6 años aprox.", "Hervíboros. Comen hojas o vegetales",
                "Si", "Zonas áridas, como estepas o sabanas"));
    }

    public ArrayList<Reptiles> getListaReptiles(){
        return listaReptiles;
    }
}
