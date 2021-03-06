package com.progtechuc.moviedb.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationMenuView;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.progtechuc.moviedb.R;

public class MainMenuActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    NavHostFragment navHostFragment;
    Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        toolbar = findViewById(R.id.toolbar_main_menu);
        setSupportActionBar(toolbar);



        bottomNavigationView = findViewById(R.id.bottom_nav_main_menu);
        navHostFragment = (NavHostFragment) getSupportFragmentManager().
                findFragmentById(R.id.nav_fragment_main_menu);




        //Ini dihapus kalau tidak pakai action bar ----------------------------------------
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.
                Builder(R.id.nowPlayingFragment, R.id.upComingFragment, R.id.popularFragment).build();

        NavigationUI.setupActionBarWithNavController(MainMenuActivity.this,
                navHostFragment.getNavController(), appBarConfiguration);
        //---------------------------------------------------------------------------------


        NavigationUI.setupWithNavController(bottomNavigationView, navHostFragment.getNavController());
    }

    @Override
    public boolean onSupportNavigateUp() {
        return navHostFragment.getNavController().navigateUp() || super.onSupportNavigateUp();
    }
}