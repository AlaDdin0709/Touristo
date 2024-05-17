package com.example.touristo.Activies;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.net.Uri;
import android.os.Bundle;

import com.example.touristo.R;

import java.util.ArrayList;
import java.util.List;

public class Place7Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place7);

        // Remplir itemList avec les données spécifiques à cet endroit
        List<Item> itemList = new ArrayList<>();
        /*itemList.add(new Item(R.drawable.g1, "Jardin-Kasserine-Tunisie", null));
        itemList.add(new Item(R.drawable.g2, "archaeological site of sbeitla", null));
        itemList.add(new Item(R.drawable.g3, "djbel chambi national park kasserine", null));
        itemList.add(new Item(R.drawable.g4, "haidra kasserine", null));
        itemList.add(new Item(R.drawable.g5, "haidra-en-hiver kasserine", null));
        itemList.add(new Item(R.drawable.g6, "kasserine ville", null));
        itemList.add(new Item(R.drawable.g7, "sbiba kasserine", null));
        itemList.add(new Item(R.drawable.g8, "thala et layoun", null));*/
        // Ajouter d'autres images et vidéos si nécessaire
        /**Uri videoUri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.vedio7);
        itemList.add(new Item(0, "Discover Kasserine, a historic city in west-central Tunisia, near the country's highest peak, Jebel Chambi. Explore the well-preserved Roman ruins at Sbeitla and enjoy stunning natural landscapes. Kasserine offers a unique blend of history, culture, and outdoor adventure.\n" +
                "\n",videoUri));
        Uri videoUri1 = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.vedio77);
        itemList.add(new Item(0, "Sbeïtla",videoUri1));**/
        // Configurer la RecyclerView avec ItemAdapter
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ItemAdapter adapter = new ItemAdapter(itemList);
        recyclerView.setAdapter(adapter);
    }
}