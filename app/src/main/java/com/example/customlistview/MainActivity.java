package com.example.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String[] animals = {"Bear", "Bird", "Camel", "Cat", "Elephant", "Fish", "Lion", "Monkey", "Turtle"};
        int[] pictures = {R.drawable.bear, R.drawable.bird, R.drawable.camel, R.drawable.cat, R.drawable.elephant,
                          R.drawable.fish, R.drawable.lion, R.drawable.monkey, R.drawable.turtle};

        ListView listView = findViewById(R.id.list_view);
        CustomAdapter adapter = new CustomAdapter(animals, pictures, MainActivity.this);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, ""+animals[i], Toast.LENGTH_SHORT).show();
            }
        });

        listView.setAdapter(adapter);
    }
}
