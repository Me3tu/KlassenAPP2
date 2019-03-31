package com.example.meetu.klassenapp;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class ArbeitenActivity extends AppCompatActivity {

    TextView A1;
    TextView A2;
    TextView A3;
    TextView A4;
    TextView A5;
    private DrawerLayout dlm;
    private ActionBarDrawerToggle abdtm;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arbeiten);
        dlm = (DrawerLayout) findViewById(R.id.dls);
        abdtm = new ActionBarDrawerToggle(this, dlm,R.string.Openm, R.string.Closem );
        abdtm.setDrawerIndicatorEnabled(true);
        dlm.addDrawerListener(abdtm);
        abdtm.syncState();




        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        NavigationView nav_viewa = (NavigationView) findViewById(R.id.nav_viewa);

        nav_viewa.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem Item) {
                int id = Item.getItemId();
                if (id == R.id.hausm){
                    Intent i = new Intent(ArbeitenActivity.this, HausisActivity.class);
                    startActivity(i);
                }
                else if (id == R.id.arbem){
                    Intent i = new Intent(ArbeitenActivity.this, MenuActivity.class);
                    startActivity(i);

                }
                else if (id == R.id.extrm){
                    Intent i = new Intent(ArbeitenActivity.this, Einstellungen.class);
                    startActivity(i);


                }
                else if (id == R.id.speim){
                    Intent i = new Intent(ArbeitenActivity.this, Speiseplan.class);
                    startActivity(i);


                }

                return true;
            }
        });

        A1 = (Button) findViewById(R.id.tvArbeit1);
        A2 = (Button) findViewById(R.id.tvArbeit2);
        A3 = (Button) findViewById(R.id.tvArbeit3);
        A4 = (Button) findViewById(R.id.tvArbeit4);
        A5 = (Button) findViewById(R.id.tvArbeit5);
        DatabaseReference a1 = FirebaseDatabase.getInstance().getReference().child("arbeiten").child("Arbeit1").child("buttonname");
        DatabaseReference a2 = FirebaseDatabase.getInstance().getReference().child("arbeiten").child("Arbeit2").child("buttonname");
        DatabaseReference a3 = FirebaseDatabase.getInstance().getReference().child("arbeiten").child("Arbeit3").child("buttonname");
        DatabaseReference a4 = FirebaseDatabase.getInstance().getReference().child("arbeiten").child("Arbeit4").child("buttonname");
        DatabaseReference a5 = FirebaseDatabase.getInstance().getReference().child("arbeiten").child("Arbeit5").child("buttonname");



        A1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ArbeitenActivity.this, A1Activity.class);
                startActivity(intent);

            }
        });
        A2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ArbeitenActivity.this, A2Activity.class);
                startActivity(intent);

            }
        });

        A3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ArbeitenActivity.this, A3Activity.class);
                startActivity(intent);

            }
        });

        A4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ArbeitenActivity.this, A4Activity.class);
                startActivity(intent);

            }
        });

        A5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ArbeitenActivity.this, A5Activity.class);
                startActivity(intent);

            }
        });



        a1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String A1A = dataSnapshot.getValue(String.class);
                A1.setText(A1A);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        a2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String A2A = dataSnapshot.getValue(String.class);
                A2.setText(A2A);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        a3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String A3A = dataSnapshot.getValue(String.class);
                A3.setText(A3A);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        a5.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String A5A = dataSnapshot.getValue(String.class);
                A5.setText(A5A);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        a4.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String A4A = dataSnapshot.getValue(String.class);
                A4.setText(A4A);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });


    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return abdtm.onOptionsItemSelected(item) || super.onOptionsItemSelected(item);

    }
}
