package com.example.meetu.klassenapp;


import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.widget.ScrollView;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


public class Woche1Activity extends AppCompatActivity  {

    TextView Wo1Mo;
    TextView Wo1Tu;
    TextView Wo1We;
    TextView Wo1Th;
    TextView Wo1Fr;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_woche1);


        Wo1Mo = (TextView) findViewById(R.id.tvWo1Mo);
        Wo1Tu = (TextView) findViewById(R.id.tvWo1Tu);
        Wo1We = (TextView) findViewById(R.id.tvWo1We);
        Wo1Th = (TextView) findViewById(R.id.tvWo1Th);
        Wo1Fr = (TextView) findViewById(R.id.tvWo1fr);
        DatabaseReference Wo1MO = FirebaseDatabase.getInstance().getReference().child("homework").child("Week1").child("Monday");
        DatabaseReference Wo1TU = FirebaseDatabase.getInstance().getReference().child("homework").child("Week1").child("Tuesday");
        DatabaseReference Wo1WE = FirebaseDatabase.getInstance().getReference().child("homework").child("Week1").child("Wednesday");
        DatabaseReference Wo1TH = FirebaseDatabase.getInstance().getReference().child("homework").child("Week1").child("Thursday");
        DatabaseReference Wo1FR = FirebaseDatabase.getInstance().getReference().child("homework").child("Week1").child("Friday");

        Wo1MO.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String MOWo1 = dataSnapshot.getValue(String.class);
                Wo1Mo.setText(MOWo1);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        Wo1TU.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String TUWo1 = dataSnapshot.getValue(String.class);
                Wo1Tu.setText(TUWo1);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        Wo1WE.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String WEWo1 = dataSnapshot.getValue(String.class);
                Wo1We.setText(WEWo1);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        Wo1TH.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String THWo1 = dataSnapshot.getValue(String.class);
                Wo1Th.setText(THWo1);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        Wo1FR.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String FRWo1 = dataSnapshot.getValue(String.class);
                Wo1Fr.setText(FRWo1);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });


    }
}


