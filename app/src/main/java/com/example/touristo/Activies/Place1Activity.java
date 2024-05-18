package com.example.touristo.Activies;

import androidx.appcompat.app.AppCompatActivity;
import java.util.List;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.touristo.R;
import com.example.touristo.Views.Map;

import java.util.ArrayList;

// Place1Activity.java
public class Place1Activity extends AppCompatActivity {
    ImageView btnReturn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place1);
        btnReturn = findViewById(R.id.btnReturn);

        // Remplir itemList avec les données spécifiques à cet endroit
        List<Item> itemList = new ArrayList<>();
        itemList.add(new Item(R.drawable.place1_image1, "Château de Sousse, Tunisie", null));
        itemList.add(new Item(R.drawable.place1_image2, "table crépuscule times", null));
        itemList.add(new Item(R.drawable.ss1, "Mall-Of-Sousse-", null));
        itemList.add(new Item(R.drawable.ss2, "Sousse_Ribat_", null));
        itemList.add(new Item(R.drawable.ss3, "acquoi palace  de sousse", null));
        itemList.add(new Item(R.drawable.ss4, "bled arbii sousse", null));
        itemList.add(new Item(R.drawable.ss5, "el kantaoui port sousse", null));
        itemList.add(new Item(R.drawable.ss6, "jardin boujaafer sousse", null));
        itemList.add(new Item(R.drawable.ss7, "le  village hergla", null));
        itemList.add(new Item(R.drawable.ss8, "medina de sousse", null));
        itemList.add(new Item(R.drawable.ss9, "medinadesouss-", null));
        itemList.add(new Item(R.drawable.ss10, "plage boujaafer sousse", null));
        itemList.add(new Item(R.drawable.ss11, "ribat de sousse", null));
        itemList.add(new Item(R.drawable.ss12, "rimusée dar essid de sousse", null));
        // Ajouter d'autres images et vidéos si nécessaire
        Uri videoUri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.vedio1);
        itemList.add(new Item(0, "Visit Sousse, a bustling coastal city in eastern Tunisia, renowned for its stunning beaches and rich history. Explore the UNESCO-listed Medina of Sousse, with its winding alleys and historic sites. Sousse seamlessly blends ancient heritage with modern amenities, making it a popular destination for tourists and locals alike.\n" +
                "\n",videoUri));

        // Configurer la RecyclerView avec ItemAdapter
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ItemAdapter adapter = new ItemAdapter(itemList);
        recyclerView.setAdapter(adapter);

        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Map.class );
                startActivity(intent);
                finish();
            }
        });
    }
}
