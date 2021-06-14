package com.example.mobileappsfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String[] items={"Breakfast", "Lunch","Dinner", "Desserts", "My Order"};
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_main, R.id.items, items));


    }

    protected void onListItemClick(ListView l, View v, int position, long id) {
        switch (position) {
            case 0:
                startActivity(new Intent(MainActivity.this, Breakfast.class));
                break;
            case 1:
                startActivity(new Intent(MainActivity.this, Lunch.class));
                break;
            case 2:
                startActivity(new Intent(MainActivity.this, Dinner.class));
                break;
            case 3:
                startActivity(new Intent(MainActivity.this, Desserts.class));
                break;
            case 4:
                startActivity(new Intent(MainActivity.this, MyOrder.class));
                break;
        }
    }
}