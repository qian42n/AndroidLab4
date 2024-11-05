package com.cst7335.entitylist;

import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView entityListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize the ListView
        entityListView = findViewById(R.id.entityListView);

        // Load data and set the adapter
        List<Entity> entities = loadEntities();
        EntityAdapter adapter = new EntityAdapter(this, entities);
        entityListView.setAdapter(adapter);
    }

    private List<Entity> loadEntities() {
        // Creating entities with IDs and names that match the drawable images
        List<Entity> entities = new ArrayList<>();
        entities.add(new Entity(1, "Storage Minecart", "Type 1"));
        entities.add(new Entity(2, "Powered Minecart", "Type 2"));
        entities.add(new Entity(3, "Minecart with TNT", "Type 3"));
        entities.add(new Entity(4, "Minecart with Hopper", "Type 4"));
        entities.add(new Entity(5, "Minecart with Spawner", "Type 5"));
        entities.add(new Entity(6, "Creeper", "Type 6"));
        entities.add(new Entity(7, "Skeleton", "Type 7"));
        // Continue adding entities as per your drawable resources
        return entities;
    }
}
