package com.ran9575.makedessert;

import android.os.Bundle;
import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Menu03 extends Fragment {

    EditText name;
    EditText context;
    Button date_btn;
    TextView date_text;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.menu03, container, false);

        name = (EditText) view.findViewById(R.id.name);
        context = (EditText) view.findViewById(R.id.context);

        date_btn = (Button) view.findViewById(R.id.btn_date);
        date_text = (TextView) view.findViewById(R.id.txt_date);

        date_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                date_text.setText(getDataString());
                date_btn.setVisibility(View.GONE);
            }
        });

        return view;
    }
    public  String getDataString(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.KOREA);
        String str_date = dateFormat.format(new Date());
        return str_date;
    }



}
