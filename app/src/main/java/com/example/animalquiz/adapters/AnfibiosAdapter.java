package com.example.animalquiz.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.animalquiz.R;
import com.example.animalquiz.javabean.Anfibios;
import com.example.animalquiz.javabean.Aves;

import java.util.ArrayList;

public class AnfibiosAdapter extends RecyclerView.Adapter<AnfibiosAdapter.AnfibiosViewHolder> implements View.OnClickListener{
    private ArrayList<Anfibios> datosAnfibios;
    private View.OnClickListener aaListener;

    public AnfibiosAdapter(ArrayList<Anfibios> datosAnfibios) {
        this.datosAnfibios = datosAnfibios;
    }

    public static class AnfibiosViewHolder extends RecyclerView.ViewHolder {

        private TextView tvNomAnimal;

        public AnfibiosViewHolder(View v) {
            super(v);
            tvNomAnimal = v.findViewById(R.id.tv_nom_anfibios);
        }

        public void bindListaItem(Anfibios an) {
            tvNomAnimal.setText(an.getNombreAn());
        }
    }

    public AnfibiosAdapter.AnfibiosViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_anfibios, parent, false);
        v.setOnClickListener(this);
        AnfibiosAdapter.AnfibiosViewHolder anA = new AnfibiosAdapter.AnfibiosViewHolder(v);

        return anA;
    }

    @Override
    public void onBindViewHolder(@NonNull AnfibiosAdapter.AnfibiosViewHolder holder, int position) {
        holder.bindListaItem(datosAnfibios.get(position));
    }

    @Override
    public int getItemCount() {
        return datosAnfibios.size();
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
