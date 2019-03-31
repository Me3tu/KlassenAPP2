package com.example.meetu.klassenapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MenuActivity extends AppCompatActivity {

    private FloatingActionButton Hausis;
    private FloatingActionButton Arbeiten;
    private FloatingActionButton Einstellungen;
    private TextView News;
    private TextView NewsL;
    private DrawerLayout dl;
    private ActionBarDrawerToggle abdt;








    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);


        News = (TextView) findViewById(R.id.tvNews);
        NewsL = (TextView) findViewById(R.id.tvLehrer);
        dl = (DrawerLayout) findViewById(R.id.dls);
        abdt = new ActionBarDrawerToggle(this, dl,R.string.Open, R.string.Close );
        abdt.setDrawerIndicatorEnabled(true);
        dl.addDrawerListener(abdt);
        abdt.syncState();


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        NavigationView nav_view = (NavigationView) findViewById(R.id.nav_view);

        nav_view.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem Item) {
                int id = Item.getItemId();
                if (id == R.id.haus){
                    Intent i = new Intent(MenuActivity.this, HausisActivity.class);
                    startActivity(i);
                }
                else if (id == R.id.arbe){
                    Intent i = new Intent(MenuActivity.this, ArbeitenActivity.class);
                    startActivity(i);

                }
                else if (id == R.id.extr){
                    Intent i = new Intent(MenuActivity.this, Einstellungen.class);
                    startActivity(i);


                }
                else if (id == R.id.spei){
                    Intent i = new Intent(MenuActivity.this, Speiseplan.class);
                    startActivity(i);


                }

                return true;
            }
        });




        DatabaseReference news = FirebaseDatabase.getInstance().getReference().child("news").child("news1");
        DatabaseReference newsL = FirebaseDatabase.getInstance().getReference().child("news").child("newsL");

        news.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String newsjuhu = dataSnapshot.getValue(String.class);
                News.setText(newsjuhu);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        newsL.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String newsjuhuhu = dataSnapshot.getValue(String.class);
                NewsL.setText(newsjuhuhu);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });







    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return abdt.onOptionsItemSelected(item) || super.onOptionsItemSelected(item);

    }


}
