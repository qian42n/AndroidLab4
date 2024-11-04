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
        // Sample data for demonstration
        List<Entity> entities = new ArrayList<>();
        entities.add(new Entity(1, "Entity Name 1", "Entity Type 1"));
        entities.add(new Entity(2, "Entity Name 2", "Entity Type 2"));
        entities.add(new Entity(3, "Entity Name 3", "Entity Type 3"));
        return entities;
    }
}
