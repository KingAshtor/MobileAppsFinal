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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_order);

        //For displaying values to the tableLayout
        TableLayout tableLayout = (TableLayout) findViewById(R.id.tableLayout);
        tableLayout.findViewsWithText(ArrayList<View>); //need to reference other activities
        // Create a new row to be added.
        //TableRow row1 = new TableRow(this);
        //row1.setLayoutParams(new TableRow.LayoutParams(TableLayout.LayoutParams.MATCH_PARENT, TableRow.LayoutParams.WRAP_CONTENT));

        //this is after the line initializing the stringArray, might have to be in the other activities instead
        setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, attraction));

        protected void onListItemCheck(TableLayout tableLayout, View v, int position, long id){

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











        //for order total
        TextView txtMyOrderTotal = null;

        txtMyOrderTotal.getAutofillValue(){

            public static String currencyFormat (String total){
                DecimalFormat formatter = new DecimalFormat("###,###,##0.00");
                return formatter.format(Double.parseDouble(String.valueOf(total)));
            }
        }


//        radioGroup.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });

//        radioSmall.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v) {
//                TableLayout tableLayout=(TableLayout)findViewById(R.id.tableLayout);
//                TableRow tr2 = new TableRow(this);
//            }
//        });
//
//        radioMedium.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v) {
//
//            }
//        });
//
//        radioLarge.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });


        }
    }

