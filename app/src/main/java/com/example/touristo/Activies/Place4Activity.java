package com.example.touristo.Activies;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.net.Uri;
import android.os.Bundle;

import com.example.touristo.R;

import java.util.ArrayList;
import java.util.List;

public class Place4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place4);

        // Remplir itemList avec les données spécifiques à cet endroit
        List<Item> itemList = new ArrayList<>();
        /*itemList.add(new Item(R.drawable.b1, "Vieux-port-de-bizerte-panoramique-", null));
        itemList.add(new Item(R.drawable.b2, "ain damous cap angela plage", null));
        itemList.add(new Item(R.drawable.b3, "alexander nevsky orthodox churuch bizert", null));
        itemList.add(new Item(R.drawable.b4, "table crépuscule times", null));
        itemList.add(new Item(R.drawable.b5, "fort d_espagne bizerte", null));
        itemList.add(new Item(R.drawable.b6, "ichkel national park bizert.", null));
        itemList.add(new Item(R.drawable.b7, "ichkel national park bizert", null));
        itemList.add(new Item(R.drawable.b8, "ksiba de bizert", null));
        itemList.add(new Item(R.drawable.b9, "la vieille ville de bizerte", null));
        itemList.add(new Item(R.drawable.b10, "le vieux port de bizert", null));
        itemList.add(new Item(R.drawable.b11, "le vieux port de bizerte", null));
        itemList.add(new Item(R.drawable.b12, "rimel bizert", null));
        itemList.add(new Item(R.drawable.b13, "sidi machrek sajnen bizert", null));
        itemList.add(new Item(R.drawable.b14, "utica bizert", null));*/
        // Ajouter d'autres images et vidéos si nécessaire
        /**Uri videoUri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.vedio4);
        itemList.add(new Item(0, "Welcome to Bizerte, Tunisia's northernmost city, famous for its picturesque old port and Mediterranean charm. Wander through the vibrant medina, relax on beautiful beaches, and enjoy fresh seafood at local restaurants. With its mix of French and Arabic influences, Bizerte offers a unique and delightful coastal experience.",videoUri));**/

        // Configurer la RecyclerView avec ItemAdapter
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ItemAdapter adapter = new ItemAdapter(itemList);
        recyclerView.setAdapter(adapter);
    }
}