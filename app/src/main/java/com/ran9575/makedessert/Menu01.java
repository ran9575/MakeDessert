package com.ran9575.makedessert;

import android.content.Context;
import android.os.Bundle;
import android.app.Fragment;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.GridView;

import java.util.ArrayList;

public class Menu01 extends Fragment {

//    EditText editText;
//    GridView gridView;
//    SingleAdapter adapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        return inflater.inflate(R.layout.menu01, container, false);
    }
/*


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.menu01);


        gridView = (GridView) gridView.findViewById(R.id.gridView);

        adapter = new SingleAdapter();

        adapter.addItem(new Menu01Item("초코 곰돌이 모닝빵", R.drawable.subimg01));
        adapter.addItem(new Menu01Item("딸기 모찌", R.drawable.subimg02));
        adapter.addItem(new Menu01Item("병아리 만쥬", R.drawable.subimg03));
        adapter.addItem(new Menu01Item("초코바나나 머핀", R.drawable.subimg04));
        adapter.addItem(new Menu01Item("딸기 생초콜릿", R.drawable.subimg05));
        adapter.addItem(new Menu01Item("진저브레드 쿠키", R.drawable.cookie));
        adapter.addItem(new Menu01Item("초코 마카롱", R.drawable.chocolatemacaroon));
        adapter.addItem(new Menu01Item("리에쥬 와플", R.drawable.waffle));
        adapter.addItem(new Menu01Item("녹차 생초콜릿", R.drawable.greenteachocolate));
        adapter.addItem(new Menu01Item("미니컵케익 초콜릿", R.drawable.chocolatecup));
        adapter.addItem(new Menu01Item("티라미수", R.drawable.tiramisu));
        adapter.addItem(new Menu01Item("딸기 마카롱케익", R.drawable.strawberrymacaron));
        adapter.addItem(new Menu01Item("레몬 마들렌", R.drawable.lemonmadelenine));
        adapter.addItem(new Menu01Item("파스텔 봉봉 초콜릿", R.drawable.chocolatetruffles));
        adapter.addItem(new Menu01Item("망고 미니 무스케익", R.drawable.mangomoussecake));
        adapter.addItem(new Menu01Item("몽키 브레드", R.drawable.hotteokmix));
        adapter.addItem(new Menu01Item("다쿠아즈", R.drawable.dacquoise));
        adapter.addItem(new Menu01Item("베이글", R.drawable.bagle));
        adapter.addItem(new Menu01Item("스톤슈", R.drawable.stonechoux));
        adapter.addItem(new Menu01Item("발로나 초콜릿 푸딩", R.drawable.chocolatepudding));
        adapter.addItem(new Menu01Item("딸기 탕후루", R.drawable.strawberrytanghuru));
        adapter.addItem(new Menu01Item("플레인 오믈렛", R.drawable.spongeomelette));

        gridView.setAdapter(adapter);

    }


    private void setContentView(int itembox) {
    }


    class SingleAdapter extends BaseAdapter {
        ArrayList<Menu01Item> items = new ArrayList<Menu01Item>();

        @Override
        public int getCount() {
            return items.size();
        }

        public void addItem(Menu01Item item){
            items.add(item);
        }

        @Override
        public Object getItem(int position) {
            return items.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View v, ViewGroup viewGroup) {
            Menu01ItemView view = new Menu01ItemView(getApplicationContext());

            Menu01Item item = items.get(position);
            view.setTitle(item.getTitle());
            view.setImg(item.resId);

            int numColumns = gridView.getNumColumns();
            int rowIndex = position/numColumns;
            int columnIndex = position % numColumns;


            return view;
        }

        private Context getApplicationContext() {
            return null;
        }

    }*/
}
