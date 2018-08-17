package com.example.heridev.fragmentsnavigationruntime;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public static FragmentManager anotherFragmentManager;
    public static android.support.v4.app.FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        anotherFragmentManager = getFragmentManager();

        if (findViewById(R.id.fragment_container) != null) {
            if(savedInstanceState != null) {
                return;
            }


            FragmentTransaction anotherFragmentTransaction = anotherFragmentManager.beginTransaction();
            HomeFragment homeFragment = new HomeFragment();
            anotherFragmentTransaction.add(R.id.fragment_container, homeFragment, "asdl");
            anotherFragmentTransaction.commit();
        }
    }
}
