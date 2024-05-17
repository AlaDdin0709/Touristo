package com.example.touristo.Activies;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.net.Uri;
import android.os.Bundle;

import com.example.touristo.R;

import java.util.ArrayList;
import java.util.List;

public class Place6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place6);

        // Remplir itemList avec les données spécifiques à cet endroit
        List<Item> itemList = new ArrayList<>();
        /*itemList.add(new Item(R.drawable.karoun1, "Bassins des Aghlabides", null));
        itemList.add(new Item(R.drawable.karoun2, "Mosquée Okba Ibn Nafaa", null));
        itemList.add(new Item(R.drawable.kraoun3, "bir barrouta kairouan", null));
        itemList.add(new Item(R.drawable.karoun4, "des bassins de jalabid kairouan", null));
        itemList.add(new Item(R.drawable.karoun5, "hotel la kasba kairouan", null));
        itemList.add(new Item(R.drawable.karoun6, "la vieille medina de kairouan", null));
        itemList.add(new Item(R.drawable.karoun7, "mausolée sidi amor abada kairouan", null));
        itemList.add(new Item(R.drawable.karoun8, "mosquée de barbier kairouan", null));
        itemList.add(new Item(R.drawable.karoun9, "mosquée des 3 portes kairouan", null));
        itemList.add(new Item(R.drawable.karoun10, "musée national d_art islamique de raqadda kairouan", null));
        itemList.add(new Item(R.drawable.karoun11, "médina kairouan", null));*/
        // Ajouter d'autres images et vidéos si nécessaire
        /**Uri videoUri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.vedio6);
        itemList.add(new Item(0, "Discover Kairouan, one of the holiest cities in Islam and a UNESCO World Heritage Site. Located in central Tunisia, Kairouan is renowned for its impressive Great Mosque and rich Islamic heritage. Stroll through the ancient medina, admire traditional crafts, and soak in the spiritual atmosphere of this historic city.",videoUri));**/

        // Configurer la RecyclerView avec ItemAdapter
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ItemAdapter adapter = new ItemAdapter(itemList);
        recyclerView.setAdapter(adapter);
    }
}