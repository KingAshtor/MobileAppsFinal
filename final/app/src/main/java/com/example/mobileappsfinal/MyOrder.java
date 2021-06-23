package com.example.mobileappsfinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatRadioButton;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.QuickContactBadge;
import android.widget.RadioButton;
import android.widget.TableLayout;
import android.widget.TableRow;

public class MyOrder extends AppCompatActivity {

    private Button btnGoBack;
    private Button btnClearOrder;
    private RadioButton radioSmall;
    private RadioButton radioMedium;
    private RadioButton radioLarge;


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

        radioSmall.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                TableLayout tableLayout=(TableLayout)findViewById(R.id.tableLayout);
                TableRow tr2 = new TableRow(this);
//                tr2.setLayoutParams(new LayoutParams( LayoutParams.FILL_PARENT,LayoutParams.WRAP_CONTENT));
//                TextView textview = new TextView(this);
//                textview.setText(data);
            }
        });

        radioMedium.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

            }
        });

        radioLarge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });



    }
}