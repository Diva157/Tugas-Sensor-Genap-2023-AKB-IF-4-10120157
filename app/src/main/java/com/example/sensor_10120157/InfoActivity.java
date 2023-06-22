package com.example.sensor_10120157;

//10120157, Diva Alvita Donny Syahputri, IF4

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import com.example.sensor_10120157.base.ViewPagerBase;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link InfoActivity#newInstance} factory method to
 * create an instance of this fragment.
 */
public class InfoActivity extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    View myFragment;
    ViewPager viewPager;
    TabLayout tabLayout;

    public InfoActivity() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment InfoActivity.
     */
    // TODO: Rename and change types and number of parameters
    public static InfoActivity newInstance(String param1, String param2) {
        InfoActivity fragment = new InfoActivity();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setUpViewPager(viewPager);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        myFragment =  inflater.inflate(R.layout.activity_info, container, false);
        viewPager = myFragment.findViewById(R.id.view_pager);
        tabLayout = myFragment.findViewById(R.id.tab_layout);
        return myFragment;
    }

    private void setUpViewPager(ViewPager viewPager) {
        ViewPagerBase adapter = new ViewPagerBase(getChildFragmentManager());
        adapter.addFragment(new ViewPagerInfoActivity(), "Info");
        adapter.addFragment(new ViewPagerSettingsActivity(), " Settings");
        viewPager.setAdapter(adapter);
    }
}