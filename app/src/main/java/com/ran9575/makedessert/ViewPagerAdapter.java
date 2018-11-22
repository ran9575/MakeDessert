package com.ran9575.makedessert;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class ViewPagerAdapter extends PagerAdapter {
    private Context context;
    private LayoutInflater layoutInflater;
    private Integer[] images = {R.drawable.pre01img01, R.drawable.pre01img02, R.drawable.pre01img03};


    public ViewPagerAdapter(Context context){
        this.context=context;
    }

    @Override
    public int getCount(){
        return images.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object){
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position){
        layoutInflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view=layoutInflater.inflate(R.layout.viewpager_slide, null);

        ImageView imageView=(ImageView) view.findViewById(R.id.imageView);
        TextView textView=(TextView) view.findViewById(R.id.textView);

        imageView.setImageResource(images[position]);

        String text=(position + 1)+" / "+images.length;
        //textView.setText(text);

        ViewPager vp=(ViewPager) container;
        vp.addView(view,0);

        return view;
    }


    /*인스턴트화한다는 것 자체가 안드로이드 시스템에서 메모리공간을 차지하게 되는데, 종료 역할을 담당해서 메모리의 부하를 막는 기능
     호출했을 때만 가져오고, 다른 프래그먼트로 넘어 갈 경우 종료*/
    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        ViewPager vp=(ViewPager) container;
        View view=(View) object;
        vp.removeView(view);
    }


}
