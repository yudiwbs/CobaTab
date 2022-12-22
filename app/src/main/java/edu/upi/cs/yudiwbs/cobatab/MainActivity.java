package edu.upi.cs.yudiwbs.cobatab;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {
    ViewPager2 viewPager;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.pager);
        tabLayout = findViewById(R.id.tab_layout);

        // Set adapter untuk ViewPager
        FragmentAdapter adapter = new FragmentAdapter(getSupportFragmentManager(),getLifecycle());
        viewPager.setAdapter(adapter);

        // Inisialisasi TabLayoutMediator
        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(tabLayout, viewPager,
                new TabLayoutMediator.TabConfigurationStrategy() {
                    @Override
                    public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                        switch (position) {
                            case 0:
                                tab.setText("Tab 1");
                                break;
                            case 1:
                                tab.setText("Tab 2");
                                break;
                        }
                    }
                }
        );
        tabLayoutMediator.attach();

    }
}