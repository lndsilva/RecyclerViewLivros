package br.com.etecia.myapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.card.MaterialCardView;

import java.util.List;

public class AdapterLivros extends RecyclerView.Adapter<AdapterLivros.ViewHolder> {

    private Context context;
    private List<Livros> lstLivros;

    public AdapterLivros(Context context, List<Livros> lstLivros) {
        this.context = context;
        this.lstLivros = lstLivros;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;

        LayoutInflater inflater = LayoutInflater.from(context);
        view = inflater.inflate(R.layout.modelo_livros,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.modeloTituloLivro.setText(lstLivros.get(position).getTitulo());
        holder.modeloImgLivros.setImageResource(lstLivros.get(position).getImgLivro());

    }

    @Override
    public int getItemCount() {
        return lstLivros.size();
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
