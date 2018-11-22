package com.ran9575.makedessert;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        LinearLayout button1=(LinearLayout) findViewById(R.id.menu1);
        LinearLayout button2=(LinearLayout) findViewById(R.id.menu2);
        LinearLayout button3=(LinearLayout) findViewById(R.id.menu3);

        //getFragmentManager().beginTransaction().replace(R.id.frameLayout, new Menu00()).commit();

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmentManager().beginTransaction().replace(R.id.frameLayout, new Menu01()).commit();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmentManager().beginTransaction().replace(R.id.frameLayout, new Menu02()).commit();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmentManager().beginTransaction().replace(R.id.frameLayout, new Menu03()).commit();
            }
        });
    }

    public void onIntent1(View v){
        Intent intent = new Intent(SubActivity.this, Menu01_sub_01Activity.class  );
        startActivity(intent);
    }

    public void onSaveClicked(View v){
        Toast.makeText(this, "전송되었습니다.", Toast.LENGTH_LONG).show();

    }

}
