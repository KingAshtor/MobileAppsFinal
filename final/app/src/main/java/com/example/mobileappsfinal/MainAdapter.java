package com.example.mobileappsfinal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MainAdapter extends BaseAdapter {


    private Context context;
    private LayoutInflater inflater;
    private  String[] breakfastFood;
    private int[] breakfastNumber;

    public MainAdapter(Context c,String[] breakfastFood, int[] breakfastNumber) {
        context = c;
        this.breakfastFood = breakfastFood;
        this.breakfastNumber = breakfastNumber;
    }

    @Override
    public int getCount() {
        return breakfastFood.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (inflater == null){
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        }
        if (convertView == null){
            convertView = inflater.inflate(R.layout.row_item, null);
        }
        ImageView imageView = convertView.findViewById(R.id.image_view);
        TextView textView = convertView.findViewById(R.id.text_view);
        imageView.setImageResource(breakfastNumber[position]);
        textView.setText(breakfastFood[position]);
        return convertView;


    }
}
