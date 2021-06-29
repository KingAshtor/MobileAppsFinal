package com.example.mobileappsfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_order);

        //For displaying values to the tableLayout
        //TableLayout tableLayout = (TableLayout) findViewById(R.id.tableLayout);
        //tableLayout.findViewsWithText(ArrayList<View>); //need to reference other activities

        //this is after the line initializing the stringArray, might have to be in the other activities instead
        //setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, attraction));

        protected void onListItemCheck(TableLayout tableLayout, View v, int position, long id){
            //pull from the listArray in other projects to display here using for loop
            for(int i=0;i<totalNames.size();i++)
            {
                TableRow row=new TableRow(this);
                double name = totalNames.get(i);
                double price = totalPrice.get(i);
                TextView food1=new TextView(this);
                food1.setText(findViewById(totalNames));
                TextView price1=new TextView(this);
                price1.setText(findViewById("$" + totalPrice);
                row.addView(food1);
                row.addView(price1);
                tableLayout.addView(row);
                setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, attraction));
            }
        }






        btnGoBack = (Button) findViewById(R.id.btnGoBack);
        btnGoBack.setOnClickListener(new View.OnClickListener(){
            @Override
                    public void onClick(View v){
                finish();
                //this is for the Go Back button, see word doc
            }
        });

        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
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
//
//
//
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


//

        }
  }
//
