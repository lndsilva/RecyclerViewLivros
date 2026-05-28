package br.com.etecia.myapp;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.card.MaterialCardView;

public class AdapterLivros extends RecyclerView.Adapter<AdapterLivros.ViewHolder> {

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        MaterialCardView modeloCardLivros;
        ImageView modeloImgLivros;
        TextView modeloTituloLivro;


        public ViewHolder(@NonNull View itemView) {

            super(itemView);
            modeloTituloLivro = itemView.findViewById(R.id.modeloTituloLivro);
            modeloImgLivros = itemView.findViewById(R.id.modeloImgLivros);
            modeloCardLivros = itemView.findViewById(R.id.modeloCardLivros);
        }
    }
}
