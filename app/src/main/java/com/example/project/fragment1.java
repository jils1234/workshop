package com.example.project;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.r0adkll.slidr.Slidr;
import com.r0adkll.slidr.model.SlidrInterface;

public class fragment1 extends AppCompatActivity {
String st;
    Toolbar toolbar;
    ActionBarDrawerToggle toggle;
   
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment1);
        overridePendingTransition(R.anim.left_in, R.anim.left_out);
        Slidr.attach(this);



        st=getIntent().getStringExtra("value");
        switch (st) {
            case "a":
                Fragment fr1;
                fr1 = new ProfFragment();

                FragmentManager fm1 = getSupportFragmentManager();
                FragmentTransaction tx1 = fm1.beginTransaction();
                tx1.replace(R.id.frag, fr1).commit();
                break;
            case "b":
                Fragment fr2;
                fr2 = new AboutFragment();

                FragmentManager fm2=getSupportFragmentManager();
                FragmentTransaction tx2  =fm2.beginTransaction();
                tx2.replace(R.id.frag,fr2).commit();
                break;
            case "c":
                Fragment fr3;
                fr3 = new WorkFragment();

                FragmentManager fm3=getSupportFragmentManager();
                FragmentTransaction tx3 =fm3.beginTransaction();
                tx3.replace(R.id.frag,fr3).commit();
                break;
            case "d":
                Fragment fr4;
                fr4 = new TutorFragment();

                FragmentManager fm4=getSupportFragmentManager();
                FragmentTransaction tx4 =fm4.beginTransaction();
                tx4.replace(R.id.frag,fr4).commit();
                break;



        }
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.right_in, R.anim.right_out);
    }

}
