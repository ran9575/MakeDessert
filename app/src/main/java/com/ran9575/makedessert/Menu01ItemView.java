package com.ran9575.makedessert;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Menu01ItemView extends LinearLayout {
    TextView textView1;
    ImageView imageView;

    public Menu01ItemView(Context context) {
            super(context);
            init(context);
    }

    public Menu01ItemView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private void init(Context context) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.itembox, this, true);

        textView1 = (TextView) findViewById(R.id.textView1);
        imageView = (ImageView) findViewById(R.id.imageView);

    }

    public  void setTitle(String title) {textView1.setText(title);}
    public  void setImg(int resId) {imageView.setImageResource(resId);}

}
