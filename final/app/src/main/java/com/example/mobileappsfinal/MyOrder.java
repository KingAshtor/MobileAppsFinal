package com.example.mobileappsfinal;

import static com.example.mobileappsfinal.R.*;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.Placeholder;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class MyOrder extends AppCompatActivity {

    private Button btnGoBack;
    private Button btnClearOrder;
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

            TableLayout tableLayout = (TableLayout) findViewById(id.tableLayout);


//
//            ArrayList<String> BreakfastPicked = ArrayList<String>();
//            ArrayAdapter<String> foodArrayAdapter = new ArrayAdapter<String>(this, R.layout.tableLayout, id.food1, BreakfastPicked);
//
//            ArrayList<Double> BreakfastPrice = ArrayList<Double>();
//            ArrayAdapter<Double> priceArrayAdapter = new ArrayAdapter<Double>(this, R.layout.tableLayout, id.price1, BreakfastPrice);

        ArrayList<String> totalNames = (ArrayList<String>) getIntent().getSerializableExtra("totalnames");

//
            for(int i=0;i<totalNames.size();i++)
            {
                //getListAdapter(new ArrayAdapter<String>(MyOrder.this, totalNames, totalPrice));

                TableRow row1 =new TableRow(this);
                //String name = totalNames(i);
                //double price = BreakfastPrice.get(i);

                TextView food1=new TextView(this);
                food1.setText(totalNames.get(i));
                //TextView price1=new TextView(this);
                //price1.setText(findViewById(Integer.parseInt("$" + BreakfastPrice)));

                row1.addView(food1);
                //row1.addView(price1);
                tableLayout.addView(row1);

            }
//

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


        btnClearOrder = (Button)findViewById(id.btnClearOrder);
        btnClearOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                btnClearOrder();
            }
        });

        btnGoBack = (Button)findViewById(id.btnGoBack);
        btnGoBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnGoBack();
            }
        });
//        TextView testView = (TextView) findViewById(R.id.txtTest);
//        testView.setText(totalNames.get(0) +" " + totalNames.get(0));

        }


    public void btnGoBack() {
        Intent intent = new Intent(this, Placeholder.class);
        startActivity(intent);
    }

    private void btnClearOrder() {
        Intent intent = new Intent(this, MyOrder.class);
                finish();
            }






//    public ArrayAdapter<String> getListAdapter() {
//        totalNames.get(breakfastFood[getString()]);
//        totalPrice.get(breakfastPrices[getString()]);
//        return listAdapter;
//    }
}

