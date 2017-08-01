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
import android.widget.Toast;

import github.chenupt.springindicator.TabClickListener;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {


    Button movinghj;

    ViewPager viewpager;
    EditText et;
    TabClickListener tabClickListener;
    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_blank, container, false);

        movinghj=v.findViewById(R.id.tomvhg);
     //   viewpager=Main2Activity.viewpager;

        viewpager=MainActivity.viewPager;
        et=v.findViewById(R.id.ghhj);

        movinghj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(tabClickListener==null) {
                    Log.d("wel","fdnb");

                    Log.d("firstfrag",et.getText().toString());
                    if(et.getText().toString().isEmpty())
                    {
                        Toast.makeText(getActivity(),"pleae fill the value",Toast.LENGTH_SHORT).show();
                    }
                       else {
                        viewpager.setCurrentItem(1);
                    }

                }

            }
        });
        return v;
    }

}
