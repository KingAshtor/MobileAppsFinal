package com.example.mobileappsfinal;

import static com.example.mobileappsfinal.R.*;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.Placeholder;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class MyOrder extends AppCompatActivity {

    private Button btnGoBack;
    //private Button btnClearOrder;
    private RadioButton radioSmall;
    private RadioButton radioMedium;
    private RadioButton radioLarge;
    private RadioGroup radioGroup;
    private String currencyFormat;
    private double total;
    private Object View;
    private TableLayout tableLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_my_order);


        //For displaying values to the tableLayout
        //TableLayout tableLayout = (TableLayout) findViewById(R.id.tableLayout);
        //tableLayout.findViewsWithText(ArrayList<View>); //need to reference other activities

        //this is after the line initializing the stringArray, might have to be in the other activities instead
        //setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, attraction));

//        protected void onCreate(TableLayout tableLayout, View v, int position, long id){
//            ArrayList<Double> totalNames = datasource.totalNames;
//            ArrayList<Double> totalPrice = datasource.totalPrice;

            TableLayout tableLayout = (TableLayout) findViewById(id.tableLayout);
            //tableLayout.findViewsWithText(ArrayList<View>);
            ArrayList<String> totalNames = new ArrayList<String>();
            ArrayAdapter<String> foodArrayAdapter = new ArrayAdapter<String>(this, id.tableLayout, id.food1, totalNames);
            //tableLayout.setAdapter(foodArrayAdapter);
//            ArrayList<String> totalNames = new ArrayList<String>();
            ArrayList<Double> totalPrice = new ArrayList<Double>();
            ArrayAdapter<Double> priceArrayAdapter = new ArrayAdapter<Double>(this, id.tableLayout, id.price1, totalPrice);
            //tableLayout.setAdapter(priceArrayAdapter0);

            //pull from the listArray in other projects to display here using for loop
            for(int i=0;i<totalNames.size();i++)
            {
                //getListAdapter(new ArrayAdapter<String>(MyOrder.this, totalNames, totalPrice));

                TableRow row1 =new TableRow(this);
                String name = totalNames.get(i);
                double price = totalPrice.get(i);

                TextView food1=new TextView(this);
                food1.setText(findViewById(totalNames.indexOf()));
                TextView price1=new TextView(this);
                price1.setText(findViewById(Integer.parseInt("$" + totalPrice));

                row1.addView(food1);
                row1.addView(price1);
                tableLayout.addView(row1);

            }
        //}

        radioGroup = (RadioGroup) findViewById(id.radioGroup);
        radioGroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedID = radioGroup.getCheckedRadioButtonId();
                //Toast.makeText(activity_my_order.this, radioButton.getText(), Toast.LENGTH_SHORT).show();
            }
        });
//
//
//
//
//        //for order total
//        TextView txtMyOrderTotal = null;
//
//        txtMyOrderTotal.getAutofillValue(){
//
//            public static String currencyFormat (String total){
//                DecimalFormat formatter = new DecimalFormat("###,###,##0.00");
//                return formatter.format(Double.parseDouble(String.valueOf(total)));
//            }
//        }


        btnGoBack = (Button)findViewById(id.btnGoBack);
        btnGoBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnGoBack();
            }
        });

        }
    public void btnGoBack() {
        Intent intent = new Intent(this, Placeholder.class);
        startActivity(intent);
    }

//    public ArrayAdapter<String> getListAdapter() {
//        totalNames.get(breakfastFood[getString()]);
//        totalPrice.get(breakfastPrices[getString()]);
//        return listAdapter;
//    }
}

