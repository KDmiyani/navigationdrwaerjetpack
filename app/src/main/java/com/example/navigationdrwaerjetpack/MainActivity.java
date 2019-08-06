package com.example.navigationdrwaerjetpack;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;

import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    public Toolbar toolbar;
    public DrawerLayout drawerlayout;
    public NavController navController;
    public NavigationView navigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupnavigation();

    }

    public  void setupnavigation(){


        toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        drawerlayout = findViewById(R.id.drawer_layout);
        //might
        navigationView = findViewById(R.id.nav_view);
        navController = Navigation.findNavController(this,R.id.host_fragment);

        NavigationUI.setupActionBarWithNavController(this,navController,drawerlayout);

        NavigationUI.setupWithNavController(navigationView,navController);

       navigationView.setNavigationItemSelectedListener(this);

    }


    @Override
    public void onBackPressed() {
        if (drawerlayout.isDrawerOpen(GravityCompat.START))
        {
            drawerlayout.closeDrawer(GravityCompat.START);


        }else {

            super.onBackPressed();
        }

        super.onBackPressed();
    }

    @Override
    public boolean onSupportNavigateUp() {
        return NavigationUI.navigateUp(Navigation.findNavController(this,R.id.host_fragment),drawerlayout);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        menuItem.setCheckable(true);


        drawerlayout.closeDrawers();

        int id = menuItem.getItemId();

        switch (id){


            case  R.id.first:
                navController.navigate(R.id.first_fragment);
                break;
            case R.id.second:
                navController.navigate(R.id.second_fragment);
                break;

            case R.id.third:
                navController.navigate(R.id.third_fragmentt);
                break;



        }

        return false;
    }
}
