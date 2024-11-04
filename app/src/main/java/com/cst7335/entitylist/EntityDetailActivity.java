package com.cst7335.entitylist;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class EntityDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entity_detail);

        // Get references to the views in activity_entity_detail.xml
        ImageView entityImageView = findViewById(R.id.entity_image);
        TextView entityNameTextView = findViewById(R.id.entity_name);
        TextView entityTypeTextView = findViewById(R.id.entity_type);

        // Retrieve data from the Intent that started this activity
        Intent intent = getIntent();
        if (intent != null) {
            // Get data from the Intent extras
            String entityName = intent.getStringExtra("entity_name");
            String entityTextType = intent.getStringExtra("entity_text_type");
            int entityType = intent.getIntExtra("entity_type", -1);

            // Set data to the views
            entityNameTextView.setText(entityName != null ? entityName : "Unknown");
            entityTypeTextView.setText(entityTextType != null ? entityTextType : "Unknown Type");

            // Dynamically set the image resource based on entityType
            if (entityType != -1) {  // Ensure entityType is a valid value
                String imageName = "entity_" + entityType;  // Generate the drawable resource name
                int imageResId = getResources().getIdentifier(imageName, "drawable", getPackageName());
                if (imageResId != 0) {
                    entityImageView.setImageResource(imageResId);  // Set the image if found
                } else {
                    entityImageView.setImageResource(R.drawable.entity_1);  // Use default image (e.g., entity_1)
                }
            } else {
                entityImageView.setImageResource(R.drawable.entity_1);  // Use default image if entityType is invalid
            }
        }
    }
}
