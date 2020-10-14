package com.example.animalquiz.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.animalquiz.R;
import com.example.animalquiz.javabean.Peces;
import com.example.animalquiz.javabean.Reptiles;

import java.util.ArrayList;

public class PecesAdapter extends RecyclerView.Adapter<PecesAdapter.PecesViewHolder> implements View.OnClickListener{
    private ArrayList<Peces> datosPeces;
    private View.OnClickListener aaListener;

    public PecesAdapter(ArrayList<Peces> datosPeces) {
        this.datosPeces = datosPeces;
    }

    public static class PecesViewHolder extends RecyclerView.ViewHolder {

        private TextView tvNomAnimal;

        public PecesViewHolder(View v) {
            super(v);
            tvNomAnimal = v.findViewById(R.id.tv_nom_peces);
        }

        public void bindListaItem(Peces p) {
            tvNomAnimal.setText(p.getNombreP());
        }
    }

    public PecesAdapter.PecesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_peces, parent, false);
        v.setOnClickListener(this);
        PecesAdapter.PecesViewHolder p = new PecesAdapter.PecesViewHolder(v);

        return p;
    }

    @Override
    public void onBindViewHolder(@NonNull PecesAdapter.PecesViewHolder holder, int position) {
        holder.bindListaItem(datosPeces.get(position));
    }

    @Override
    public int getItemCount() {
        return datosPeces.size();
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
