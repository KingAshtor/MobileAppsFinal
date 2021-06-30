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

import java.util.ArrayList;

public class Dinner extends AppCompatActivity {
    GridView grindView;
    String[] dinnerFood = {"Steak and Fries", "Chicken Parmesan", "Shrimp and Rice", "Stir Fry"};
    int[] dinnerNumber = {R.drawable.dinner1, R.drawable.dinner2, R.drawable.dinner3, R.drawable.dinner4};
    double[] dinnerPrices = {7.00, 2.25, 1.00, 10.00};
    ArrayList<String> dinnerPicked = new ArrayList<String>();
    ArrayList<Double> dinnerPrice = new ArrayList<Double>();


    //Michelle's ArrayLists
    //ArrayList<String> totalNames = new ArrayList<String>();
    //ArrayList<Double> totalPrice = new ArrayList<Double>();
    //Michelle's ArrayLists


    int test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinner);
        grindView = findViewById(R.id.gridView);
        Button btnAdd = (Button) findViewById(R.id.btnAdd);
        MainAdapter adapter = new MainAdapter(com.example.mobileappsfinal.Dinner.this, dinnerFood, dinnerNumber);
        grindView.setAdapter(adapter);

        grindView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView result = (TextView) findViewById(R.id.txtResult);
//            Toast.makeText(getApplicationContext(), breakfastFood[+position] + " added to your order",Toast.LENGTH_SHORT).show();
//            TextView result = (TextView) findViewById(R.id.txtResult);
//    test = +position;
//            result.setText("You Chose " + breakfastFood[+position]);
                Toast.makeText(getApplicationContext(), dinnerFood[+position] + " Selected", Toast.LENGTH_SHORT).show();
//            ImageView imgResult = (ImageView) findViewById(R.id.imgResult);
//
//            imgResult.setImageResource(breakfastNumber[+position]);
//            breakfastPicked.add(breakfastFood[+position]);
                test = +position;
//            breakfastPrice.add(breakfastPrices[test]);
                btnAdd.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {


                        result.setText("You Chose " + dinnerFood[+position]);
                        ImageView imgResult = (ImageView) findViewById(R.id.imgResult);

                        imgResult.setImageResource(dinnerNumber[+position]);
                        dinnerPicked.add(dinnerFood[+position]);
                        dinnerPrice.add(dinnerPrices[test]);
                        //totalNames.add(dinnerFood[+position]);
                        //totalPrice.add(dinnerPrices[test]);

                    }
                });

//            TextView testView = (TextView) findViewById(R.id.txtTest);

//            testView.setText(breakfastPicked.get(0) +" " + breakfastPrice.get(0));


            }
        });

        Button btn = (Button) findViewById(R.id.btnBack);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goBack();
            }
        });
    }

    public void goBack() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}







