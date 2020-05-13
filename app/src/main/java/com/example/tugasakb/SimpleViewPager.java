package com.example.tugasakb;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.tugasakb.fragment.FirstFragment;
import com.example.tugasakb.fragment.SecondFragment;
import com.example.tugasakb.fragment.ThirdFragment;

public class SimpleViewPager extends FragmentStatePagerAdapter {

    public SimpleViewPager(FragmentManager fm){
        super(fm);
    }

    @Override
    public int getCount() {
        return 3;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: return new FirstFragment();
            case 1 : return new SecondFragment();
            case 2 : return new ThirdFragment();
            default: return null;
        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0 : return "Profile";
            case 1 : return "Contact Me";
            case 2 : return "Friend List";
            default : return "no";
        }
    }
}
