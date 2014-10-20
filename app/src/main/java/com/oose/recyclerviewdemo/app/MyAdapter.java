package com.oose.recyclerviewdemo.app;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by bubu on 10/20/14.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private ArrayList<MyPojo> pojos;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public View view;

        public ViewHolder(View v) {
            super(v);
            view = v;
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public MyAdapter(ArrayList<MyPojo> pojos) {
        this.pojos = pojos;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                   int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row, parent, false);
        // set the view's size, margins, paddings and layout parameters
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        TextView title = (TextView) holder.view.findViewById(R.id.title);
        TextView desc = (TextView) holder.view.findViewById(R.id.desc);
        final ImageView imageView = (ImageView) holder.view.findViewById(R.id.imageView);

        title.setText(pojos.get(position).getTitle());
        desc.setText(pojos.get(position).getDesc());
        imageView.setImageResource(pojos.get(position).getImage());

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.setImageResource(R.drawable.heart_red);
            }
        });

    }

    //@kidd_Bubu

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return pojos.size();
    }
}