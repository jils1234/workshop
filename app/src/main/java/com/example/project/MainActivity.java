package com.example.project;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.database.core.Context;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    DrawerLayout drawerlayout;
    Toolbar toolbar;
    NavigationView navigationView;
    ActionBarDrawerToggle toggle;
    String st;
 //   private RecyclerView mrecyclerview;
   // private DatabaseReference mdatabaseref;
   // private List<Upload> muploads;
   // private ProgressBar mprogresscircle;
    //private ImageAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       drawerlayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        toolbar = findViewById(R.id.toolbar);
        NavigationView navigationView = findViewById(R.id.navigationview);
        navigationView.setNavigationItemSelectedListener(this);
        setSupportActionBar(toolbar);


        toggle = new ActionBarDrawerToggle(MainActivity.this, drawerlayout, R.string.open, R.string.close);
        drawerlayout.addDrawerListener(toggle);
        toggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


       // mrecyclerview=findViewById(R.id.list);
       // mrecyclerview.setHasFixedSize(true);
        //mrecyclerview.setLayoutManager(new LinearLayoutManager(this));

        //mprogresscircle=findViewById(R.id.progress_circle);

        //muploads= new ArrayList<>();
        //mdatabaseref=FirebaseDatabase.getInstance().getReference("uploads");

        //mdatabaseref.addValueEventListener(new ValueEventListener() {
          //  @Override
            //public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

              //  for(DataSnapshot postsnapshot : dataSnapshot.getChildren()){
                //    Upload upload=postsnapshot.getValue(Upload.class);
                  //  muploads.add(upload);
                //}
           // mAdapter=new ImageAdapter(MainActivity.this,muploads);
             //   mrecyclerview.setAdapter(mAdapter);
               // mprogresscircle.setVisibility(View.INVISIBLE);
            //}

            //@Override
            //public void onCancelled(@NonNull DatabaseError databaseError) {
          //  Toast.makeText(MainActivity.this,databaseError.getMessage(),Toast.LENGTH_SHORT).show();
            //    mprogresscircle.setVisibility(View.INVISIBLE);
           // }
      //  }
      //  );



    }
//for the app

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        switch (menuItem.getItemId()) {
            case R.id.nav_profile:
                Intent intent = new Intent(MainActivity.this, fragment1.class);
                st = "a";
                intent.putExtra("value", st);
                startActivity(intent);
                drawerlayout.closeDrawers();

                break;
            case R.id.nav_about:
                Intent tent = new Intent(MainActivity.this, fragment1.class);
                st = "b";
                tent.putExtra("value", st);
                startActivity(tent);
                drawerlayout.closeDrawers();
                break;
            case R.id.nav_workshop:
                Intent ent = new Intent(MainActivity.this, fragment1.class);
                st = "c";
                ent.putExtra("value", st);
                startActivity(ent);
                drawerlayout.closeDrawers();
                break;
            case R.id.nav_tutor:
                Intent entp = new Intent(MainActivity.this, fragment1.class);
                st = "d";
                entp.putExtra("value", st);
                startActivity(entp);
                drawerlayout.closeDrawers();
                break;
        }

        return true;
    }

    @Override
    public void onBackPressed() {
        if (drawerlayout.isDrawerOpen(GravityCompat.START)) {
            drawerlayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

        @Override
        public boolean onOptionsItemSelected (MenuItem menuitem){
            if (toggle.onOptionsItemSelected(menuitem)) {
                return true;
            }
            return super.onOptionsItemSelected(menuitem);
        }
    }
