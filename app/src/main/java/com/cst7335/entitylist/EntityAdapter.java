package com.cst7335.entitylist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;

public class EntityAdapter extends ArrayAdapter<Entity> {

    public EntityAdapter(Context context, List<Entity> entities) {
        super(context, 0, entities);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Inflate the layout for each list item
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.entity_item, parent, false);
        }

        // Get the data item for this position
        Entity entity = getItem(position);

        // Lookup view for data population
        TextView entityName = convertView.findViewById(R.id.entity_name);
        TextView entityType = convertView.findViewById(R.id.entity_type);

        // Populate the data into the template view using the data object
        if (entity != null) {
            entityName.setText(entity.getName());
            entityType.setText(entity.getType());
        }

        // Return the completed view to render on screen
        return convertView;
    }
}
