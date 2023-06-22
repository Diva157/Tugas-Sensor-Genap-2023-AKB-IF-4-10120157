package com.example.sensor_10120157;

//10120157, Diva Alvita Donny Syahputri, IF4

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity implements NavigationBarView.OnItemSelectedListener {

    private BottomNavigationView bottomNavigationView;
    private ProfileActivity profileActivity = new ProfileActivity();
    private InfoActivity infoActivity = new InfoActivity();
    private CurrentLocationActivity currentLocationActivity = new CurrentLocationActivity();
    private NearbyPlacesActivity nearbyPlacesActivity = new NearbyPlacesActivity();
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottomView);
        bottomNavigationView.setOnItemSelectedListener(this);
        bottomNavigationView.setSelectedItemId(R.id.profile);

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.profile:
                getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, profileActivity).commit();
                return true;
            case R.id.nearbyPlaces:
                getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, nearbyPlacesActivity).commit();
                return true;
            case R.id.currentLocation:
                getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, currentLocationActivity).commit();
                return true;
            case R.id.info:
                getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, infoActivity).commit();
                return true;

        }
        return false;
    }
}
