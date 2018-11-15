package com.example.meetu.klassenapp;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ScrollView;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Speiseplan extends AppCompatActivity {

    private TextView SDa;
    private TextView SMo;
    private TextView STu;
    private TextView SWe;
    private TextView STh;
    private TextView SFr;
    private DrawerLayout dla;
    private ActionBarDrawerToggle abdta;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speiseplan);
        dla = (DrawerLayout) findViewById(R.id.dls);
        abdta = new ActionBarDrawerToggle(this, dla,R.string.Openm, R.string.Closem );
        abdta.setDrawerIndicatorEnabled(true);
        dla.addDrawerListener(abdta);
        abdta.syncState();




        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        NavigationView nav_viewa = (NavigationView) findViewById(R.id.nav_views);

        nav_viewa.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem Item) {
                int id = Item.getItemId();
                if (id == R.id.hauss){
                    Intent i = new Intent(Speiseplan.this, HausisActivity.class);
                    startActivity(i);
                }
                else if (id == R.id.arbes){
                    Intent i = new Intent(Speiseplan.this, ArbeitenActivity.class);
                    startActivity(i);

                }
                else if (id == R.id.mens){
                    Intent i = new Intent(Speiseplan.this, Einstellungen.class);
                    startActivity(i);


                }
                else if (id == R.id.einstellungens){
                    Intent i = new Intent(Speiseplan.this, MenuActivity.class);
                    startActivity(i);


                }
                return true;
            }
        });

        SDa = ( TextView) findViewById(R.id.tvSDa);
        SMo = ( TextView) findViewById(R.id.tvSMo);
        STu = ( TextView) findViewById(R.id.tvSTu);
        SWe = ( TextView) findViewById(R.id.tvSWe);
        STh = ( TextView) findViewById(R.id.tvSTh);
        SFr = ( TextView) findViewById(R.id.tvSFr);
        final DatabaseReference SDA = FirebaseDatabase.getInstance().getReference().child("Speiseplan").child("Datum");
        final DatabaseReference SMO = FirebaseDatabase.getInstance().getReference().child("Speiseplan").child("monday");
        DatabaseReference STU = FirebaseDatabase.getInstance().getReference().child("Speiseplan").child("Tuesday");
        DatabaseReference SWE = FirebaseDatabase.getInstance().getReference().child("Speiseplan").child("Wednesday");
        DatabaseReference STH = FirebaseDatabase.getInstance().getReference().child("Speiseplan").child("Thursday");
        DatabaseReference SFR = FirebaseDatabase.getInstance().getReference().child("Speiseplan").child("Friday");

        SDA.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String datum = dataSnapshot.getValue(String.class);
                SDa.setText(datum);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        SMO.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String monday = dataSnapshot.getValue(String.class);
                SMo.setText(monday);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        STU.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String datum = dataSnapshot.getValue(String.class);
                STu.setText(datum);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        SWE.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String datum = dataSnapshot.getValue(String.class);
                SWe.setText(datum);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        STH.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String datum = dataSnapshot.getValue(String.class);
                STh.setText(datum);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        SFR.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String datum = dataSnapshot.getValue(String.class);
                SFr.setText(datum);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return abdta.onOptionsItemSelected(item) || super.onOptionsItemSelected(item);

    }
}
