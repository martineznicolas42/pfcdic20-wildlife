package com.example.animalquiz.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.animalquiz.R;
import com.example.animalquiz.javabean.DatosMamiferos;
import com.example.animalquiz.javabean.Mamiferos;

import java.util.ArrayList;

public class MamiferoAdapter extends RecyclerView.Adapter<MamiferoAdapter.MamiferosViewHolder> implements View.OnClickListener{

    private ArrayList<Mamiferos> datosMamiferos;
    private View.OnClickListener aaListener;

    public MamiferoAdapter(ArrayList<Mamiferos> datosMamiferos) {
        this.datosMamiferos = datosMamiferos;
    }

    public static class MamiferosViewHolder extends RecyclerView.ViewHolder {

        private TextView tvNomAnimal;

        public MamiferosViewHolder(View v) {
            super(v);
            tvNomAnimal = v.findViewById(R.id.tv_nom_mamifero);
        }

        public void bindListaItem(Mamiferos m) {
            tvNomAnimal.setText(m.getNombreM());
        }
    }

    public MamiferosViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_mamiferos, parent, false);
        v.setOnClickListener(this);
        MamiferosViewHolder vh = new MamiferoAdapter.MamiferosViewHolder(v);

        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull MamiferosViewHolder holder, int position) {
        holder.bindListaItem(datosMamiferos.get(position));
    }

    @Override
    public int getItemCount() {
        return datosMamiferos.size();
    }

    @Override
    public void onClick(View v) {
        if (aaListener != null){
            aaListener.onClick(v);
        }
    }

    public void asignacionOnClickListener(View.OnClickListener listener) {

        aaListener = listener;
    }
}
