package com.example.touristo.Activies;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.net.Uri;
import android.os.Bundle;

import com.example.touristo.R;

import java.util.ArrayList;
import java.util.List;

public class Place3Activity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place3);

        // Remplir itemList avec les données spécifiques à cet endroit
        List<Item> itemList = new ArrayList<>();
        /*itemList.add(new Item(R.drawable.jd1, "El Feija National Park. Parcs nationaux", null));
        itemList.add(new Item(R.drawable.jad2, "Tabarka Mosque. jandouba", null));
        itemList.add(new Item(R.drawable.jad3, "bulla regia jendouba  ,", null));
        itemList.add(new Item(R.drawable.jad4, "bulla regia jendouba", null));
        itemList.add(new Item(R.drawable.jad6, "jandouba centre", null));
        itemList.add(new Item(R.drawable.jad5, "jandouba ,,,", null));
        itemList.add(new Item(R.drawable.jad7, "jandouba maison d_hote", null));
        itemList.add(new Item(R.drawable.jad8, "jendouba centre ville", null));
        itemList.add(new Item(R.drawable.jad9, "route de ain draham , photo de tbarka ,jendouba gouvernorate", null));
        itemList.add(new Item(R.drawable.jad10, "tabarka.jandouba", null));
        itemList.add(new Item(R.drawable.jad11, "tbarka jendouba", null));
        itemList.add(new Item(R.drawable.jad12, "tourist place jendouba", null));
        itemList.add(new Item(R.drawable.jad13, "zonne touristique jandouba", null));*/
        // Ajouter d'autres images et vidéos si nécessaire
       /** Uri videoUri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.vedio3);
        itemList.add(new Item(0, "Visit Jendouba, a charming city in northwestern Tunisia known for its lush landscapes and archaeological sites. Explore the ancient Roman ruins of Bulla Regia, famous for its underground villas. Enjoy the natural beauty of the surrounding countryside, making Jendouba a perfect destination for history buffs and nature lovers alike.",videoUri));**/

        // Configurer la RecyclerView avec ItemAdapter
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ItemAdapter adapter = new ItemAdapter(itemList);
        recyclerView.setAdapter(adapter);
    }
}