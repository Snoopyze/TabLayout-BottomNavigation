package com.example.bttl1.home;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.bttl1.fragment.AccountFragment;
import com.example.bttl1.fragment.HomeFragment;
import com.example.bttl1.fragment.NoiticationFragment;
import com.example.bttl1.fragment.RewardFragment;
import com.example.bttl1.fragment.ShieldFragment;

public class HomeViewPageAdapter extends FragmentStatePagerAdapter {
    public HomeViewPageAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new Imfomation1Fragment();
            case 1:
                return new Information2Fragment();
            case 2:
                return new Information3Fragment();
            default:
                return new Imfomation1Fragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Thông Tin Cơ Bản";
            case 1:
                return "Thông Tin Cá Nhân";
            case 2:
                return "Information 3";
            default:
                return "Information 1";
        }
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
