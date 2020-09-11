package com.example.rentalbazaar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.PointerIcon;
import android.widget.Toast;

import com.etebarian.meowbottomnavigation.MeowBottomNavigation;

public class MainActivity extends AppCompatActivity {

    MeowBottomNavigation BottomNav;
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

        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer,new HomeFragment()).commit();

        BottomNav.setOnClickMenuListener(new MeowBottomNavigation.ClickListener() {
            @Override
            public void onClickItem(MeowBottomNavigation.Model item) {
                Toast.makeText(getApplicationContext(),"Clicked item"+item.getId(),Toast.LENGTH_SHORT).show();
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
    }
}