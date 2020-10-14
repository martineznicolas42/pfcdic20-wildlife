package com.example.animalquiz.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.animalquiz.R;
import com.example.animalquiz.activities.AvesActivity;
import com.example.animalquiz.activities.DatosAvesCompletosActivity;
import com.example.animalquiz.javabean.Aves;
import com.example.animalquiz.javabean.Mamiferos;

import java.util.ArrayList;

public class AvesAdapter extends RecyclerView.Adapter<AvesAdapter.AvesViewHolder> implements View.OnClickListener{
    private ArrayList<Aves> datosAves;
    private View.OnClickListener aaListener;

    public AvesAdapter(ArrayList<Aves> datosAves) {
        this.datosAves = datosAves;
    }

    public static class AvesViewHolder extends RecyclerView.ViewHolder {

        private TextView tvNomAnimal;

        public AvesViewHolder(View v) {
            super(v);
            tvNomAnimal = v.findViewById(R.id.tv_nom_aves);
        }

        public void bindListaItem(Aves a) {
            tvNomAnimal.setText(a.getNombreA());
        }
    }

    public AvesAdapter.AvesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_aves, parent, false);
        v.setOnClickListener(this);
        AvesAdapter.AvesViewHolder aa = new AvesAdapter.AvesViewHolder(v);

        return aa;
    }

    @Override
    public void onBindViewHolder(@NonNull AvesAdapter.AvesViewHolder holder, int position) {
        holder.bindListaItem(datosAves.get(position));
    }

    @Override
    public int getItemCount() {
        return datosAves.size();
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
