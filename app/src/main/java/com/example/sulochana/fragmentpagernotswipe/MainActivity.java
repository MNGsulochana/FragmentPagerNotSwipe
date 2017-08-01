package com.example.sulochana.fragmentpagernotswipe;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;

import github.chenupt.multiplemodel.viewpager.ModelPagerAdapter;
import github.chenupt.multiplemodel.viewpager.PagerModelManager;
import github.chenupt.springindicator.SpringIndicator;
import github.chenupt.springindicator.viewpager.ScrollerViewPager;


//BOTH MANACTIVIYT AND MAINACTIVITY2 ARE WORKING USE WHATEVER YOU WANT AS LAUNCHER BU THE DIFFERENCE IS THE VIEWPAGER THATS IT

public class MainActivity extends AppCompatActivity {

   public static ScrollerViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager= (ScrollerViewPager) findViewById(R.id.view_pager);

        SpringIndicator springIndicator = (SpringIndicator) findViewById(R.id.indicator);
      //  Toolbar toolbar = (Toolbar) findViewById(R.id.tool_bar);
//        setSupportActionBar(toolbar);

        PagerModelManager manager = new PagerModelManager();
       // manager.addCommonFragment(GuideFragment.class,getBgRes(),getTitles() );
        manager.addCommonFragment(getfragments(),getTitles());
        ModelPagerAdapter adapter = new ModelPagerAdapter(getSupportFragmentManager(), manager);
        viewPager.setAllowedSwipeDirection1(ScrollerViewPager.SwipeDirectoin.none);
        viewPager.setAdapter(adapter);
        viewPager.fixScrollSpeed();


        // just set viewPager
        springIndicator.setViewPager(viewPager);

    }

    private List<? extends Fragment> getfragments() {
        return Lists.newArrayList(new BlankFragment(),new BlankFragment2(),new BlankFragment3());

    }

    private List<String> getTitles(){
        return Lists.newArrayList("1", "2", "3");
    }

  //main code
    private List<Integer> getBgRes(){
        return Lists.newArrayList(R.drawable.sd, R.drawable.sdf, R.drawable.index);
    }


}

