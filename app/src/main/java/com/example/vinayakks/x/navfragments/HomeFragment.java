package com.example.vinayakks.x.navfragments;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.vinayakks.x.R;
import com.example.vinayakks.x.constants.K;
import com.example.vinayakks.x.navdrawer.SlidingTabLayout;
import com.example.vinayakks.x.tabfragments.DummyFragment;
import com.example.vinayakks.x.tabfragments.Vtu;
import com.example.vinayakks.x.tabfragments.april;
import com.example.vinayakks.x.tabfragments.feb;
import com.example.vinayakks.x.tabfragments.jan;
import com.example.vinayakks.x.tabfragments.mar;

import java.util.ArrayList;
import java.util.Calendar;

public class HomeFragment extends Fragment {

    SlidingTabLayout tabLayout;

    ViewPager mViewPager;
    SectionsPagerAdapter mSectionsPagerAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_home, container, false);
        mViewPager = (ViewPager) v.findViewById(R.id.pagerCities);
        mSectionsPagerAdapter = new SectionsPagerAdapter(
                getChildFragmentManager());
        mViewPager.setAdapter(mSectionsPagerAdapter);
        tabLayout = (SlidingTabLayout) v.findViewById(R.id.tabanim_tabs);
        tabLayout.setViewPager(mViewPager);
        Calendar now = Calendar.getInstance();

        mViewPager.setCurrentItem(now.get(Calendar.MONTH));

        return v;
    }

    public class SectionsPagerAdapter extends FragmentPagerAdapter {
        private final ArrayList<String> tabNames = new ArrayList<String>() {
            {
                add("JAN      ");
                add("FEB      ");
                add("MAR      ");
                add("APR      ");
                add("MAY      ");
                add("JUN      ");
                add("JUL      ");
                add("AUG      ");
                add("SEP      ");
                add("OCT      ");
                add("NOV      ");
                add("DEC      ");
                add("Holidays ");

            }
        };


        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            if (position == 0) {
                return Vtu.newInstance(position);
            } else if (position == 1) {

                return jan.newInstance(position);

            } else if (position == 2) {
                return feb.newInstance(position);
            } else if (position == 3) {
                return mar.newInstance(position);
            } else {
                return april.newInstance(position);
            }

        }

        @Override
        public int getCount() {
            return tabNames.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return tabNames.get(position);
        }

    }

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}
