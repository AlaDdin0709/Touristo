package com.example.touristo.Activies;

import androidx.appcompat.app.AppCompatActivity;
import java.util.List;
import android.net.Uri;
import android.os.Bundle;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.touristo.R;

import java.util.ArrayList;

// Place1Activity.java
public class Place2Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place1);

        // Remplir itemList avec les données spécifiques à cet endroit
        List<Item> itemList = new ArrayList<>();
        /*itemList.add(new Item(R.drawable.gb1, "waha gabés", null));
        itemList.add(new Item(R.drawable.gb2, "star wars matmata de gebes", null));
        itemList.add(new Item(R.drawable.gb3, "région tourestique gabés", null));
        itemList.add(new Item(R.drawable.gb4, "gabes-henna a gebes", null));
        itemList.add(new Item(R.drawable.gb5, "gebés chnenni", null));
        itemList.add(new Item(R.drawable.gb6, "hotel de matmata", null));
        itemList.add(new Item(R.drawable.gb7, "hotel sidi idris gebes", null));
        itemList.add(new Item(R.drawable.gb8, "mereth line military museum gebes", null));
        itemList.add(new Item(R.drawable.gb9, "mosqué sidi boulbeba a gebes", null));
        itemList.add(new Item(R.drawable.gb10, "mosqué sidi boulbeba", null));
        itemList.add(new Item(R.drawable.gb11, "paroisse de l_immaculée conception gebes", null));
        itemList.add(new Item(R.drawable.gb12, "nouvelle mosquée de jara", null));
        itemList.add(new Item(R.drawable.gb13, "plage cornich de gabés", null));
        itemList.add(new Item(R.drawable.gb14, "Toujane", null));
        itemList.add(new Item(R.drawable.gb15, "plage gebes", null));
        itemList.add(new Item(R.drawable.gb16, "Marine de Gabes", null));*/
        // Ajouter d'autres images et vidéos si nécessaire
       /**Uri videoUri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.vedio2);
        itemList.add(new Item(0, "Discover Gabès, a unique coastal oasis city in southeastern Tunisia. Known for its distinctive blend of desert and sea, Gabès offers a unique landscape where palm groves meet the Mediterranean. Visit the colorful local markets, enjoy the therapeutic hot springs, and explore the nearby Matmata troglodyte dwellings.\n" +
                "\n",videoUri));

        Uri videoUri1 = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.vedio22);**/
        // Configurer la RecyclerView avec ItemAdapter
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ItemAdapter adapter = new ItemAdapter(itemList);
        recyclerView.setAdapter(adapter);
    }
}
