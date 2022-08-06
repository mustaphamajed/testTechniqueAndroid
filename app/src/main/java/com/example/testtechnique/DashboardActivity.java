package com.example.testtechnique;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.testtechnique.databinding.ActivityDashboardBinding;
import com.example.testtechnique.databinding.ActivityMainBinding;

public class DashboardActivity extends AppCompatActivity {

    ActivityDashboardBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDashboardBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(new DashboardFragment());
        binding.bottomNavBar.setOnItemSelectedListener(item -> {
            switch (item.getItemId())
            {
                case R.id.dash :
                    replaceFragment(new DashboardFragment());
                    break;
                case R.id.phone :
                    replaceFragment(new PhoneUsageFragment());
                    break;
                case R.id.social :
                    replaceFragment(new SocialMediaFragment());
                    break;
                case R.id.alert :
                    replaceFragment(new AlertsFragment());
                    break;

            }
            return true;
        });
    }

    private void replaceFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout,fragment);
        fragmentTransaction.commit();
    }
}