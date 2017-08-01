package com.example.sulochana.fragmentpagernotswipe;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import github.chenupt.springindicator.TabClickListener;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment2 extends Fragment {

    Button movinghj1;

    ViewPager viewpager;
    EditText et1;
    TabClickListener tabClickListener;

    public BlankFragment2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_blank_fragment2, container, false);

        movinghj1=v.findViewById(R.id.ncvb);
       // viewpager=Main2Activity.viewpager;

        viewpager=MainActivity.viewPager;
        et1=v.findViewById(R.id.dhsgfhd);

        movinghj1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(tabClickListener==null) {
                    Log.d("wel","fdnb");

                    Log.d("seocndfrag",et1.getText().toString());
                    viewpager.setCurrentItem(2);

                }

            }
        });
        return v;
    }

}
