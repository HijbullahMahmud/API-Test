package com.devmahmud.apiexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.devmahmud.apiexample.adapter.TabAdapter;
import com.devmahmud.apiexample.fragments.NewsFragment;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private TabAdapter tabAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar                 = findViewById(R.id.toolbar);
        tabLayout               = findViewById(R.id.tab_layout);
        viewPager               = findViewById(R.id.view_pager);
        setSupportActionBar(toolbar);

        setFragments();
    }

    private void setFragments() {
        //setup view pager and tabLayout
        tabAdapter = new TabAdapter(getSupportFragmentManager());
        tabAdapter.addFragment(new NewsFragment(), getString(R.string.top_news));
        tabAdapter.addFragment(new NewsFragment(), getString(R.string.top_news));
        tabAdapter.addFragment(new NewsFragment(), getString(R.string.top_news));
        tabAdapter.addFragment(new NewsFragment(), getString(R.string.top_news));
        tabAdapter.addFragment(new NewsFragment(), getString(R.string.top_news));
        tabAdapter.addFragment(new NewsFragment(), getString(R.string.top_news));
        tabAdapter.addFragment(new NewsFragment(), getString(R.string.top_news));

        viewPager.setOffscreenPageLimit(8);
        viewPager.setAdapter(tabAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
