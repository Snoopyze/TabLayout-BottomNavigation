package com.example.bttl1.fragment;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class ViewPageAdapter extends FragmentStatePagerAdapter {
    public ViewPageAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new HomeFragment();
            case 1:
                return new RewardFragment();
            case 2:
                return new ShieldFragment();
            case 3:
                return new AccountFragment();
            case 4:
                return new NoiticationFragment();
            default:
                return new HomeFragment();
        }
    }

    @Override
    public int getCount() {
        return 5;
    }


//    public ViewPageAdapter(@NonNull FragmentManager fm, int behavior) {
//        super(fm, behavior);
//    }
//
//    @NonNull
//    @Override
////    public Fragment getItem (int position) {
////        switch (position) {
////            case 0:
////                return new HomeFragment();
////            case 1:
////                return new RewardFragment();
////            case 2:
////                return new ShieldFragment();
////            case 3:
////                return new AccountFragment();
////            case 4:
////                return new NoiticationFragment();
////            default:
////                return new HomeFragment();
////        }
////
////    }
//
//    @Override
//    public int getItemCount() {
//        return 5;
//    }
//
//    @NonNull
//    @Override
//    public Fragment getItem(int position) {
//        return null;
//    }
//
//    @Override
//    public int getCount() {
//        return 0;
//    }
}
