package br.com.etecia.myapp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Livros> lstLivros;
    RecyclerView idRecLivros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        idRecLivros = findViewById(R.id.idRecLivros);

        lstLivros = new ArrayList<>();

        lstLivros.add(new Livros("Academia","Educação",R.drawable.academia,22.50));
        lstLivros.add(new Livros("Caso perdido","Romance",R.drawable.caso_perdido,1.99));
        lstLivros.add(new Livros("Fazer Amigos","Motivação",R.drawable.fazer_amigos,20.80));
        lstLivros.add(new Livros("Murdoku","Artesanato",R.drawable.murdoku,22.50));
        lstLivros.add(new Livros("Academia","Educação",R.drawable.caminho,22.50));
        lstLivros.add(new Livros("Academia","Educação",R.drawable.academia,22.50));
        lstLivros.add(new Livros("Academia","Educação",R.drawable.academia,22.50));
        lstLivros.add(new Livros("Academia","Educação",R.drawable.academia,22.50));
        lstLivros.add(new Livros("Academia","Educação",R.drawable.academia,22.50));
        lstLivros.add(new Livros("Academia","Educação",R.drawable.academia,22.50));
        lstLivros.add(new Livros("Academia","Educação",R.drawable.academia,22.50));


        AdapterLivros adapterLivros = new AdapterLivros(getApplicationContext(), lstLivros);

        idRecLivros.setLayoutManager(new GridLayoutManager(getApplicationContext(),2));

        idRecLivros.setAdapter(adapterLivros);






    }
}