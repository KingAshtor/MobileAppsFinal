package com.example.mobileappsfinal;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.constraintlayout.widget.Placeholder;
import androidx.navigation.ui.AppBarConfiguration;

import java.util.ArrayList;

public class Desserts extends AppCompatActivity {
    GridView grindView;
    String [] dessertFood = {"Apple Pie" , "Chocolate Strawberry Cake" , "Peanut Butter Chocolate Bites" , "Cheesecake Ice Cream"};
    int [] dessertNumber = {R.drawable.dessert1,R.drawable.dessert2,R.drawable.dessert3,R.drawable.dessert4};
    double[] dessertPrices = {3.25, 5.25, 7.25, 2.00};
    ArrayList<String> dessertPicked = new ArrayList<String>();
    ArrayList<Double> dessertPrice = new ArrayList<Double>();
    int test;

    //Michelle's ArrayLists
    ArrayList<String> totalNames = new ArrayList<String>();
    ArrayList<Double> totalPrice = new ArrayList<Double>();
    //Michelle's ArrayLists

    private AppBarConfiguration appBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desserts);
        grindView = findViewById(R.id.gridView);
        Button btnAdd = (Button) findViewById(R.id.btnAdd);
        MainAdapter adapter = new MainAdapter(Desserts.this,dessertFood,dessertNumber);
        grindView.setAdapter(adapter);

        grindView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView result = (TextView) findViewById(R.id.txtResult);
//            Toast.makeText(getApplicationContext(), breakfastFood[+position] + " added to your order",Toast.LENGTH_SHORT).show();
//            TextView result = (TextView) findViewById(R.id.txtResult);
//    test = +position;
//            result.setText("You Chose " + breakfastFood[+position]);
//            ImageView imgResult = (ImageView) findViewById(R.id.imgResult);
                Toast.makeText(getApplicationContext(), dessertFood[+position] + " Selected", Toast.LENGTH_SHORT).show();
//
//            imgResult.setImageResource(breakfastNumber[+position]);
//            breakfastPicked.add(breakfastFood[+position]);
                test = +position;
//            breakfastPrice.add(breakfastPrices[test]);
                btnAdd.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {



                        result.setText("You Chose " + dessertFood[+position]);
                        ImageView imgResult = (ImageView) findViewById(R.id.imgResult);

                        imgResult.setImageResource(dessertNumber[+position]);
                        dessertPicked.add(dessertFood[+position]);
                        dessertPrice.add(dessertPrices[test]);
                        totalNames.add(dessertFood[+position]);
                        totalPrice.add(dessertPrices[test]);

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