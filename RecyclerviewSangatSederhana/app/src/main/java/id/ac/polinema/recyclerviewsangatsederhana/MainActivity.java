package id.ac.polinema.recyclerviewsangatsederhana;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import id.ac.polinema.recyclerviewsangatsederhana.adapters.SuperHeroAdapter;
import id.ac.polinema.recyclerviewsangatsederhana.models.SuperHero;

public class MainActivity extends AppCompatActivity {
    //instansiasi RecycleView
    RecyclerView rvSuperHero;
    //instansiasi list superHero
    List<SuperHero> listSuperHero = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //menyambungkan rvSuperHero ke layout
        rvSuperHero = findViewById(R.id.rvSuperHero);
        //Membuat object hero
        SuperHero hero = new SuperHero("Petruk");
        //menambahkan hero ke listSuperHero
        listSuperHero.add(hero);
        //membuat objek hero baru
        hero = new SuperHero("Gareng");
        //menambahkan hero baru ke listSuperHero
        listSuperHero.add(hero);
        //Instansi Adapter
        SuperHeroAdapter superHeroAdapter = new SuperHeroAdapter(listSuperHero);
        //set Adapter dan layoutmanager
        rvSuperHero.setAdapter(superHeroAdapter);
        rvSuperHero.setLayoutManager(new LinearLayoutManager(this));
    }
}
