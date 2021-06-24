package com.example.mobileappsfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

public class MyOrder extends AppCompatActivity {

    private Button btnGoBack;
    //private Button btnClearOrder;
    private RadioButton radioSmall;
    private RadioButton radioMedium;
    private RadioButton radioLarge;
    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_order);

        btnGoBack = (Button) findViewById(R.id.btnGoBack);

        btnGoBack.setOnClickListener(new View.OnClickListener(){
            @Override
                    public void onClick(View v){
                finish();
                //this is for the Go Back button, see word doc
            }
        });

        radioSmall = (RadioButton) findViewById(R.id.radioSmall);
        radioMedium = (RadioButton) findViewById(R.id.radioMedium);
        radioLarge = (RadioButton) findViewById(R.id.radioLarge);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);


        radioGroup = findViewById(R.id.radioGroup);
        radioGroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedID = radioGroup.getCheckedRadioButtonId();
                Toast.makeText(activity_my_order.this, radioButton.getText(), Toast.LENGTH_SHORT).show();
            }
        });

        TextView txtMyOrderTotal = null;

        txtMyOrderTotal.getAutofillValue()



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

