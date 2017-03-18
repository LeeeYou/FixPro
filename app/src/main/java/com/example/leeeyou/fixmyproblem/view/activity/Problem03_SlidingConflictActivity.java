package com.example.leeeyou.fixmyproblem.view.activity;

import android.os.Bundle;
import android.support.v4.view.ViewPager;

import com.example.leeeyou.fixmyproblem.R;
import com.example.leeeyou.fixmyproblem.view.fragment.PageFragment;
import com.example.leeeyou.fixmyproblem.view.fragment.PageSlidingConflictFragment;
import com.ogaclejapan.smarttablayout.SmartTabLayout;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;

/**
 * 事件冲突案例
 */
public class Problem03_SlidingConflictActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sliding_conflict);

        FragmentPagerItemAdapter adapter = new FragmentPagerItemAdapter(
                getSupportFragmentManager(), FragmentPagerItems.with(this)
                .add("title_A", PageFragment.class)
                .add("title_B", PageFragment.class)
                .add("title_C", PageFragment.class)
                .add("title_D", PageFragment.class)
                .add("title_E", PageSlidingConflictFragment.class)
                .create());

        ViewPager viewPager = (ViewPager) findViewById(R.id.pager);
        viewPager.setAdapter(adapter);

        SmartTabLayout viewPagerTab = (SmartTabLayout) findViewById(R.id.viewpagertab);
        viewPagerTab.setViewPager(viewPager);
    }

}
