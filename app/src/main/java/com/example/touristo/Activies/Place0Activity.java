package com.example.touristo.Activies;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
import android.graphics.Typeface;

import com.example.touristo.R;
import com.example.touristo.Views.LoginActivity;
import com.example.touristo.Views.Map;
import com.example.touristo.Views.RegisterActivity;

public class Place0Activity extends AppCompatActivity {
    private List<Item> itemList = new ArrayList<>();
    ImageView btnReturn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place0);

        // Définir le nom du pays en haut de l'activité
        TextView countryNameTextView = findViewById(R.id.countryNameTextView);
        btnReturn = findViewById(R.id.btnReturn);
        countryNameTextView.setText("Sidi Bouzid");
        countryNameTextView.setTypeface(null, Typeface.BOLD);

        // Remplir itemList avec les données d'images et de vidéos
        itemList.add(new Item(R.drawable.image1, "",null));
        itemList.add(new Item(R.drawable.image2, "",null));
        itemList.add(new Item(R.drawable.image4, "",null));
        itemList.add(new Item(R.drawable.image5, "",null));
        itemList.add(new Item(R.drawable.im1, " agriculture sidi bouzid tunisie",null));
        itemList.add(new Item(R.drawable.im3, " ain-haddej",null));
        itemList.add(new Item(R.drawable.im6, "parc nationnal de bouhedma",null));
        itemList.add(new Item(R.drawable.im7, "souk sidi bouzid",null));
        // Ajouter la vidéo en tant qu'élément de la liste
        Uri videoUri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.vedio);
        itemList.add(new Item(0, "Discover Sidi Bouzid, an iconic city in the heart of Tunisia. Known for its crucial role in the Jasmine Revolution of 2011, Sidi Bouzid is also a thriving agricultural region. Dive into its history marked by courage and resilience while exploring its picturesque landscapes, bustling markets, and rich culture. A unique destination where every corner tells an inspiring story.\n" +
                "\n",videoUri));

        // Configurer la RecyclerView
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
