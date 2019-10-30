package id.ac.polinema.recyclerviewsangatsederhana;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import id.ac.polinema.recyclerviewsangatsederhana.adapters.BungaAdapter;
import id.ac.polinema.recyclerviewsangatsederhana.adapters.SuperHeroAdapter;
import id.ac.polinema.recyclerviewsangatsederhana.models.SuperHero;
import id.ac.polinema.recyclerviewsangatsederhana.models.bunga;

public class MainActivity extends AppCompatActivity {
    //instansiasi RecycleView
    RecyclerView rvSuperHero;
    RecyclerView rvBunga;
    //instansiasi list superHero
    List<SuperHero> listSuperHero = new ArrayList<>();
    List<bunga> bungaList= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //menyambungkan rvSuperHero ke layout
        rvSuperHero = findViewById(R.id.rvSuperHero);
        rvBunga = findViewById(R.id.rvBunga);
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

        bunga bunga=new bunga("Bunga Matahari","Bunganya kuning dan lucu",R.drawable.sunflower);
        bungaList.add(bunga);

        bunga=new bunga("Anggrek","Bunga majemuk yang memiliki banyak warna",R.drawable.orchid);
        bungaList.add(bunga);

        bunga=new bunga("Melati","Bunganya berwarna putih dan bisa dipakai jadi teh",R.drawable.jasmine);
        bungaList.add(bunga);

        bunga=new bunga("Teratai","Bunga yang hidup di air dan daunnya lebar",R.drawable.lotus);
        bungaList.add(bunga);

        bunga=new bunga("Telang","Bunganya berwarna ungu dan menjadi pencegah kanker",R.drawable.telangflower);
        bungaList.add(bunga);

        BungaAdapter bungaAdapter = new BungaAdapter(bungaList);
        rvBunga.setAdapter(bungaAdapter);
        rvBunga.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        rvBunga.setLayoutManager(new GridLayoutManager(this,3));

    }


}
