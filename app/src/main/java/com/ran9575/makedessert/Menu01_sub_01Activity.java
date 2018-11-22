package com.ran9575.makedessert;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Menu01_sub_01Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu01_sub_01);

/*
        txt1=(TextView) findViewById(R.id.main_txt);
        Typeface typeface1=Typeface.createFromAsset(getAssets(),"fonts/tvN 즐거운이야기 Bold.ttf");
        txt1.setTypeface(typeface1);
*/

        TextView textView = (TextView) findViewById(R.id.close_btn_01);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


    }
}
