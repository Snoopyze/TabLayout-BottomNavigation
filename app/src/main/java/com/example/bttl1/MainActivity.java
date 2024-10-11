package com.example.bttl1;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Switch;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.bttl1.fragment.ViewPageAdapter;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        viewPager = findViewById(R.id.view_pager);
        bottomNavigationView = findViewById(R.id.bottom_navigation);

        ViewPageAdapter adapter = new ViewPageAdapter(getSupportFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        viewPager.setAdapter(adapter);

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                switch (position) {
                    case 0:
                        bottomNavigationView.getMenu().findItem(R.id.menu_home).setChecked(true);
                        break;
                    case 1:
                        bottomNavigationView.getMenu().findItem(R.id.menu_chest).setChecked(true);
                        break;
                    case 2:
                        bottomNavigationView.getMenu().findItem(R.id.menu_shield).setChecked(true);
                        break;
                    case 3:
                        bottomNavigationView.getMenu().findItem(R.id.menu_accout).setChecked(true);
                        break;
                    case 4:
                        bottomNavigationView.getMenu().findItem(R.id.menu_noitication).setChecked(true);
                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                int itemId = item.getItemId();

                if(itemId == R.id.menu_home) {
                    viewPager.setCurrentItem(0, true);

                } else if (itemId == R.id.menu_chest) {
                    viewPager.setCurrentItem(1, true);
                } else if (itemId == R.id.menu_shield) {
                    viewPager.setCurrentItem(2, true);
                } else if (itemId == R.id.menu_accout) {
                    viewPager.setCurrentItem(3, true);
                } else if (itemId == R.id.menu_noitication) {
                    viewPager.setCurrentItem(4, true);
                }

//                    switch (item.getItemId()) {
//                        case R.id.menu_home:
//                            viewPager.setCurrentItem(0);
//                            break;
//                        case R.id.menu_chest:
//                            viewPager.setCurrentItem(1);
//                            break;
//                        case R.id.menu_shield:
//                            viewPager.setCurrentItem(2);
//                            break;
//                        case R.id.menu_home:
//                            viewPager.setCurrentItem(3);
//                            break;
//                        case R.id.menu_accout:
//                            viewPager.setCurrentItem(4);
//                            break;
//                        case R.id.menu_noitication:
//                            viewPager.setCurrentItem(5);
//                            break;
//                    }
                return true;
            }
        });

    }
}