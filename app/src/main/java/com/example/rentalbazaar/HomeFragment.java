package com.example.rentalbazaar;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    private ViewPager home_viewPager;
    private TabLayout home_tabLayout;

    private ByCycleFragment byCycleFragment;
    private BookFragment bookFragment;
    private CameraFragment cameraFragment;
    private DressFragment dressFragment;
    private GameDVDFragment gameDVDFragment;
    private HouseFragment houseFragment;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setHasOptionsMenu(true);
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.fragment_home, container, false);

        home_viewPager =(ViewPager)v.findViewById(R.id.Home_viewPager);
        home_tabLayout =(TabLayout)v.findViewById(R.id.Home_tabLayout);
        byCycleFragment=new ByCycleFragment();
        bookFragment= new BookFragment();
        cameraFragment= new CameraFragment();
        dressFragment= new DressFragment();
        gameDVDFragment= new GameDVDFragment();
        houseFragment= new HouseFragment();

        home_tabLayout.setupWithViewPager(home_viewPager);

        ViewPagerAdapter viewPagerAdapter=new ViewPagerAdapter(getChildFragmentManager(),0);
        viewPagerAdapter.addFragment(byCycleFragment,"By-Cycle");
        viewPagerAdapter.addFragment(bookFragment,"Book");
        viewPagerAdapter.addFragment(cameraFragment,"Camera");
        viewPagerAdapter.addFragment(dressFragment,"Dress");
        viewPagerAdapter.addFragment(gameDVDFragment,"Game-DVD");
        viewPagerAdapter.addFragment(houseFragment,"House");
        home_viewPager.setAdapter(viewPagerAdapter);
        return v;
    }

    private class ViewPagerAdapter extends FragmentPagerAdapter {

        private List<Fragment> fragments=new ArrayList<>();
        private List<String> fragmentTitle=new ArrayList<>();

        public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
            super(fm, behavior);
        }

        public void addFragment(Fragment fragment,String title){
            fragments.add(fragment);
            fragmentTitle.add(title);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            return fragments.get(position);
        }

        @Override
        public int getCount() {
            return fragments.size();
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {

            return fragmentTitle.get(position);
        }
    }

    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        inflater.inflate(R.menu.homefragment_appbar_menu,menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.settings:
                Toast.makeText(getContext(),"Settings",Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}