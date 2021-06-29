package com.example.mobileappsfinal;

import android.content.Intent;
import android.os.Bundle;

import com.example.mobileappsfinal.MainAdapter;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.constraintlayout.widget.Placeholder;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import java.util.ArrayList;

public class Lunch extends AppCompatActivity {
    GridView grindView;
    String [] lunchFood = {"Tacos" , "Burger and Fries" , "Salad" , "Italian Hoagie"};
    int [] lunchNumber = {R.drawable.lunch1,R.drawable.lunch2,R.drawable.lunch3,R.drawable.lunch4};
    double[] lunchPrices = {6.00, 3.75, 6.25, 8.75};
    ArrayList<String> lunchPicked = new ArrayList<String>();
    ArrayList<Double> lunchPrice = new ArrayList<Double>();
    int test;

    //Michelle's ArrayLists
    ArrayList<String> totalNames = new ArrayList<String>();
    ArrayList<Double> totalPrice = new ArrayList<Double>();
    //Michelle's ArrayLists

    private AppBarConfiguration appBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lunch);
        grindView = findViewById(R.id.gridView);
        Button btnAdd = (Button) findViewById(R.id.btnAdd);
        MainAdapter adapter = new MainAdapter(com.example.mobileappsfinal.Lunch.this,lunchFood,lunchNumber);
        grindView.setAdapter(adapter);

        grindView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView result = (TextView) findViewById(R.id.txtResult);
//            Toast.makeText(getApplicationContext(), breakfastFood[+position] + " added to your order",Toast.LENGTH_SHORT).show();
//            TextView result = (TextView) findViewById(R.id.txtResult);
                Toast.makeText(getApplicationContext(), lunchFood[+position] + " Selected", Toast.LENGTH_SHORT).show();
//    test = +position;
//            result.setText("You Chose " + breakfastFood[+position]);
//            ImageView imgResult = (ImageView) findViewById(R.id.imgResult);
//
//            imgResult.setImageResource(breakfastNumber[+position]);
//            breakfastPicked.add(breakfastFood[+position]);
                test = +position;
//            breakfastPrice.add(breakfastPrices[test]);
                btnAdd.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {




                        result.setText("You Chose " + lunchFood[+position]);
                        ImageView imgResult = (ImageView) findViewById(R.id.imgResult);

                        imgResult.setImageResource(lunchNumber[+position]);
                        lunchPicked.add(lunchFood[+position]);
                        lunchPrice.add(lunchPrices[test]);
                        totalNames.add(lunchFood[+position]);
                        totalPrice.add(lunchPrices[test]);

                    }
                });

//            TextView testView = (TextView) findViewById(R.id.txtTest);

//            testView.setText(breakfastPicked.get(0) +" " + breakfastPrice.get(0));


            }
        });
        Button btn = (Button)findViewById(R.id.btnBack);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goBack();
            }
        });
    }
    public void goBack() {
        Intent intent = new Intent(this, Placeholder.class);
        startActivity(intent);
    }
}