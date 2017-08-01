package com.example.sulochana.fragmentpagernotswipe;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import github.chenupt.springindicator.SpringIndicator;

public class Main2Activity extends AppCompatActivity {

    public static CustomViewPager viewpager;
    SpringIndicator springindictor;
    MyPagerAdapter pagradapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        viewpager= (CustomViewPager) findViewById(R.id.viepgr);
        springindictor= (SpringIndicator) findViewById(R.id.indicator1);
        pagradapter=new MyPagerAdapter(getSupportFragmentManager());

        viewpager.setAllowedSwipeDirection(SwipeDirection.none);
        viewpager.setAdapter(pagradapter);
        springindictor.setViewPager(viewpager);

    }

    public static class MyPagerAdapter extends FragmentStatePagerAdapter

    {

       public static String title[]={"STEP 1","STEP 2","STEP 3"};


        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {

            switch (position)
            {
                case 0:
                    return new BlankFragment();

                case  1:
                    return new BlankFragment2();

                case 2:
                    return new BlankFragment3();

            }
            return null;
        }

        @Override
        public int getCount() {
            return title.length;
        }

        /*@Override
        public CharSequence getPageTitle(int position) {
            //return super.getPageTitle(position);
            return ;
        }*/

        @Override
        public CharSequence getPageTitle(int position) {
            return title[position];
        }
    }
}
