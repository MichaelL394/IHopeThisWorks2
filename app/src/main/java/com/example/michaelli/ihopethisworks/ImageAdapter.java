package com.example.michaelli.ihopethisworks;


import android.content.Context;

import android.view.View;
import android.view.ViewGroup;

import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {
    private Context mContext;

    // Constructor

    public ImageAdapter(Context c) {
        mContext = c;
    }

    public int getCount() {
        return mThumbIds.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        SquareView squareView;

        if (convertView == null) {
            squareView = new SquareView(mContext);
            squareView.setLayoutParams(new GridView.LayoutParams(350, 350));
            squareView.setScaleType(SquareView.ScaleType.CENTER_CROP);
            squareView.setPadding(2, 2, 2, 2);
        }
        else
        {
            squareView = (SquareView) convertView;
        }
        squareView.setImageResource(mThumbIds[position]);
        return squareView;
    }

    // Keep all Images in array
    public Integer[] mThumbIds = {

            R.drawable.apple,
            R.drawable.strawberries,
            R.drawable.tomatoes,
            R.drawable.watermelons
    };
    public String[] two = {
           "This is an apple","These are strawberries \n They taste good \n Much good","A red Fruit",("Green mean\n melon machine"), "cat"
    };

}