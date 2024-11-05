package com.cst7335.entitylist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class EntityAdapter extends ArrayAdapter<Entity> {

    public EntityAdapter(Context context, List<Entity> entities) {
        super(context, 0, entities);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.entity_item, parent, false);
        }

        // Get the data item for this position
        Entity entity = getItem(position);

        // Lookup view for data population
        ImageView entityImage = convertView.findViewById(R.id.entity_image);
        TextView entityName = convertView.findViewById(R.id.entity_name);
        TextView entityType = convertView.findViewById(R.id.entity_type);

        // Populate the data into the template view using the data object
        if (entity != null) {
            // Set entity name and type
            entityName.setText(entity.getName());
            entityType.setText(entity.getType());

            // Get image resource ID based on the entity's ID
            int imageResId = getContext().getResources().getIdentifier("entity_" + entity.getId(), "drawable", getContext().getPackageName());
            
            // Check if the image resource exists and set it, otherwise set a default image
            if (imageResId != 0) {
                entityImage.setImageResource(imageResId);
            } else {
                entityImage.setImageResource(R.drawable.default_image); // Ensure default_image.png exists in the drawable folder
            }
        }

        // Return the completed view to render on screen
        return convertView;
    }
}
