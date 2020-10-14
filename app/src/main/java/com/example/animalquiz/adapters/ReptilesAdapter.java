package com.example.animalquiz.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.animalquiz.R;
import com.example.animalquiz.javabean.Aves;
import com.example.animalquiz.javabean.Reptiles;

import java.util.ArrayList;

public class ReptilesAdapter extends RecyclerView.Adapter<ReptilesAdapter.ReptilesViewHolder> implements View.OnClickListener{
    private ArrayList<Reptiles> datosReptiles;
    private View.OnClickListener aaListener;

    public ReptilesAdapter(ArrayList<Reptiles> datosReptiles) {
        this.datosReptiles = datosReptiles;
    }

    public static class ReptilesViewHolder extends RecyclerView.ViewHolder {

        private TextView tvNomAnimal;

        public ReptilesViewHolder(View v) {
            super(v);
            tvNomAnimal = v.findViewById(R.id.tv_nom_reptiles);
        }

        public void bindListaItem(Reptiles r) {
            tvNomAnimal.setText(r.getNombreR());
        }
    }

    public ReptilesAdapter.ReptilesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_reptiles, parent, false);
        v.setOnClickListener(this);
        ReptilesAdapter.ReptilesViewHolder ra = new ReptilesAdapter.ReptilesViewHolder(v);

        return ra;
    }

    @Override
    public void onBindViewHolder(@NonNull ReptilesAdapter.ReptilesViewHolder holder, int position) {
        holder.bindListaItem(datosReptiles.get(position));
    }

    @Override
    public int getItemCount() {
        return datosReptiles.size();
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
