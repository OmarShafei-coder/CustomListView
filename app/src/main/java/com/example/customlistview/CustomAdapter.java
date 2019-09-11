package com.example.customlistview;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    private String[] animals;
    private int[] pictures;
    private Activity activity;

    public CustomAdapter(String[] animals, int[] pictures, Activity activity) {
        this.animals = animals;
        this.pictures = pictures;
        this.activity = activity;
    }

    @Override
    public int getCount() {
        return pictures.length;
    }

    @Override
    public Object getItem(int i) {  //i is the position
        //return any element in the list item
        return animals[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {

        LayoutInflater inflater = activity.getLayoutInflater();
        view = inflater.inflate(R.layout.list_item, parent, false);

        TextView textView = view.findViewById(R.id.text);
        ImageView imageView = view.findViewById(R.id.image);

        textView.setText(animals[i]);
        imageView.setImageResource(pictures[i]);

        return view;
    }
}
