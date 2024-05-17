package com.example.touristo.Activies;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.net.Uri;
import android.os.Bundle;

import com.example.touristo.R;

import java.util.ArrayList;
import java.util.List;

public class Place5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place5);

        // Remplir itemList avec les données spécifiques à cet endroit
        List<Item> itemList = new ArrayList<>();
        /*itemList.add(new Item(R.drawable.t1, "Tozeur.", null));
        itemList.add(new Item(R.drawable.t2, "chott el jerid tozeur", null));
        itemList.add(new Item(R.drawable.t3, "eden palm tozeur", null));
        itemList.add(new Item(R.drawable.t4, "eden palm tresors de l_oasis tozeur", null));
        itemList.add(new Item(R.drawable.t5, "le vieux quartier de ouled el hadef medina tozeur", null));
        itemList.add(new Item(R.drawable.t6, "musées des arts et traditions populaires tozeur", null));
        itemList.add(new Item(R.drawable.t7, "ong jemel tozeur", null));
        itemList.add(new Item(R.drawable.t8, "parc chak wak", null));
        itemList.add(new Item(R.drawable.t9, "sidi bouhel canyon tozeur", null));
        itemList.add(new Item(R.drawable.t10, "star wars tozeur", null));
        itemList.add(new Item(R.drawable.t11, "tamerza canyon tozeur", null));
        itemList.add(new Item(R.drawable.t12, "tamerza tozeur", null));*/
        // Ajouter d'autres images et vidéos si nécessaire
        /**Uri videoUri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.vedio5);
        itemList.add(new Item(0, "Welcome to Tozeur, an oasis city on the edge of the Sahara Desert, famous for its stunning palm groves and unique architecture. Explore the charming old town with its intricate brickwork, and visit the nearby Chott el Jerid salt lake. Tozeur is a gateway to the desert, offering unforgettable experiences and breathtaking scenery.",videoUri));

        Uri videoUri1 = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.vedio55);
        itemList.add(new Item(0, "Tozeur, Tamerza, Chebika... ",videoUri1));**/
        // Configurer la RecyclerView avec ItemAdapter
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ItemAdapter adapter = new ItemAdapter(itemList);
        recyclerView.setAdapter(adapter);
    }
}