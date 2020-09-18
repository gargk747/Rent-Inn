package com.example.rentalbazaar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.PointerIcon;
import android.view.View;
import android.widget.Toast;

import com.etebarian.meowbottomnavigation.MeowBottomNavigation;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    MeowBottomNavigation BottomNav;
    DrawerLayout drawerLayout;
    Toolbar toolbar;
    private final static int ID_home=1;
    private final static int ID_explore=2;
    private final static int ID_add=3;
    private final static int ID_saved=4;
    private final static int ID_profile=5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNav=findViewById(R.id.bottom_nav);
        BottomNav.add(new MeowBottomNavigation.Model(1,R.drawable.ic_home));
        BottomNav.add(new MeowBottomNavigation.Model(2,R.drawable.ic_explore));
        BottomNav.add(new MeowBottomNavigation.Model(3,R.drawable.ic_add));
        BottomNav.add(new MeowBottomNavigation.Model(4,R.drawable.ic_saved));
        BottomNav.add(new MeowBottomNavigation.Model(5,R.drawable.ic_profile));

        toolbar=findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);

        drawerLayout=findViewById(R.id.drawerLayout);
        ActionBarDrawerToggle toggle= new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer,new HomeFragment()).commit();
        //BottomNav.setCount(1,"10");

        BottomNav.setOnClickMenuListener(new MeowBottomNavigation.ClickListener() {
            @Override
            public void onClickItem(MeowBottomNavigation.Model item) {
                switch (item.getId()){
                    case ID_home:
                        toolbar.setTitle("Home");
                        break;
                    case ID_explore:
                        toolbar.setTitle("Explore");
                        break;
                    case ID_add:
                        toolbar.setTitle("Add");
                        break;
                    case ID_saved:
                        toolbar.setTitle("Saved");
                        break;
                    case ID_profile:
                        toolbar.setTitle("Profile");
                        break;
                }
            }
        });

        BottomNav.setOnShowListener(new MeowBottomNavigation.ShowListener() {
            @Override
            public void onShowItem(MeowBottomNavigation.Model item) {
                Fragment selected_fragmment=null;
                switch (item.getId()){
                    case ID_home:
                        selected_fragmment=new HomeFragment();
                        break;
                    case ID_explore:
                        selected_fragmment=new ExploreFragment();
                        break;
                    case ID_add:
                        selected_fragmment=new AddFragment();
                        break;
                    case ID_saved:
                        selected_fragmment=new SavedFragment();
                        break;
                    case ID_profile:
                        selected_fragmment=new ProfileFragment();
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer,selected_fragmment).commit();
            }
        });

        BottomNav.setOnReselectListener(new MeowBottomNavigation.ReselectListener() {
            @Override
            public void onReselectItem(MeowBottomNavigation.Model item) {
                Fragment selected_fragmment=null;
                switch (item.getId()){
                    case ID_home:
                        selected_fragmment=new HomeFragment();
                        break;
                    case ID_explore:
                        selected_fragmment=new ExploreFragment();
                        break;
                    case ID_add:
                        selected_fragmment=new AddFragment();
                        break;
                    case ID_saved:
                        selected_fragmment=new SavedFragment();
                        break;
                    case ID_profile:
                        selected_fragmment=new ProfileFragment();
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer,selected_fragmment).commit();

            }
        });

        BottomNav.show(1,false);
    }

    @Override
    public void onBackPressed() {
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }else{
        super.onBackPressed();
        }
    }
}