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

public class Breakfast extends AppCompatActivity {
    GridView grindView;
    String [] breakfastFood = {"Waffles" , "Eggs and Bacon" , "Egg Sandwich" , "Pancakes"};
    int [] breakfastNumber = {R.drawable.breakfast1,R.drawable.breakfast2,R.drawable.breakfast3,R.drawable.breakfast4};
    double[] breakfastPrices = {4.75, 5.25, 7.25, 9.00};
    ArrayList<String> breakfastPicked = new ArrayList<String>();
    ArrayList<Double> breakfastPrice = new ArrayList<Double>();
    int test;

    //Michelle's ArrayLists
    ArrayList<String> totalNames = new ArrayList<String>();
    ArrayList<Double> totalPrice = new ArrayList<Double>();
    //Michelle's ArrayLists
//    Intent intent = new Intent(this, Desserts.class);
//    intent.putExtra(totalNames), "totalnames");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breakfast);
        grindView = findViewById(R.id.gridView);
        Button btnAdd = (Button) findViewById(R.id.btnAdd);
        MainAdapter adapter = new MainAdapter(com.example.mobileappsfinal.Breakfast.this,breakfastFood,breakfastNumber);
        grindView.setAdapter(adapter);
//        Intent intent = new Intent(this, MyOrder.class);

        grindView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView result = (TextView) findViewById(R.id.txtResult);
//            Toast.makeText(getApplicationContext(), breakfastFood[+position] + " added to your order",Toast.LENGTH_SHORT).show();
//            TextView result = (TextView) findViewById(R.id.txtResult);
//    test = +position;
                Toast.makeText(getApplicationContext(), breakfastFood[+position] + " Selected", Toast.LENGTH_SHORT).show();
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



                        result.setText("You Chose " + breakfastFood[+position]);
                        ImageView imgResult = (ImageView) findViewById(R.id.imgResult);

                        imgResult.setImageResource(breakfastNumber[+position]);
                        breakfastPicked.add(breakfastFood[+position]);
                        breakfastPrice.add(breakfastPrices[test]);

                        totalNames.add(breakfastFood[+position]);
                        totalPrice.add(breakfastPrices[test]);
//
//                        toMyOrder();

//                        intent.putExtra(totalNames), "totalnames");
//                        String totalNames = bundle.getString(totalNames);
//
//                        intent.putExtra("priceArr", totalPrice);
//                        String priceArr = bundle.getDouble("priceArr");

                    }
                });

//            TextView testView = (TextView) findViewById(R.id.txtTest);
//            testView.setText(breakfastPicked.get(0) +" " + breakfastPrice.get(0));


            }
        });

//        btnAdd = (Button)findViewById(R.id.btnAdd) {
//            intent.putExtra(totalNames), "totalnames");
//            String totalNames = bundle.getString(totalNames);
//
//        }

        Button btn = (Button)findViewById(R.id.btnBack);
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

//    public void toMyOrder() {
//        Intent intArray = new Intent(this, Desserts.class);
////        Intent intent = new Intent(this, MainActivity.class);
//        intArray.putExtra(String.valueOf(totalNames), "totalnames");
//
//        startActivity(intArray);
//        Intent intent = new Intent(this, MainActivity.class);
        //startActivity(intent);
//        Intent intArray = new Intent(this, Desserts.class);
//        Intent intent = new Intent(this, MainActivity.class);
        //intArray.putExtra(String.valueOf(totalNames), "totalnames");


    }




