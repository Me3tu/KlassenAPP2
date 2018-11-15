package com.example.meetu.klassenapp;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Woche3Activity extends AppCompatActivity {
    TextView Wo3Mo;
    TextView Wo3Tu;
    TextView Wo3We;
    TextView Wo3Th;
    TextView Wo3Fr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_woche3);

        Wo3Mo = (TextView) findViewById(R.id.tvWo3Mo);
        Wo3Tu = (TextView) findViewById(R.id.tvWo3Tu);
        Wo3We = (TextView) findViewById(R.id.tvWo3We);
        Wo3Th = (TextView) findViewById(R.id.tvWo3Th);
        Wo3Fr = (TextView) findViewById(R.id.tvWo3Fr);
        DatabaseReference Wo3MO = FirebaseDatabase.getInstance().getReference().child("homework").child("Week3").child("Monday");
        DatabaseReference Wo3TU = FirebaseDatabase.getInstance().getReference().child("homework").child("Week3").child("Tuesday");
        DatabaseReference Wo3WE = FirebaseDatabase.getInstance().getReference().child("homework").child("Week3").child("Wednesday");
        DatabaseReference Wo3TH = FirebaseDatabase.getInstance().getReference().child("homework").child("Week3").child("Thursday");
        DatabaseReference Wo3FR = FirebaseDatabase.getInstance().getReference().child("homework").child("Week3").child("Friday");

        Wo3MO.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String MOWo1 = dataSnapshot.getValue(String.class);
                Wo3Mo.setText(MOWo1);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });Wo3TU.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String TUWo1 = dataSnapshot.getValue(String.class);
                Wo3Tu.setText(TUWo1);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });Wo3WE.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String WEWo3 = dataSnapshot.getValue(String.class);
                Wo3We.setText(WEWo3);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });Wo3TH.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String THWo1 = dataSnapshot.getValue(String.class);
                Wo3Th.setText(THWo1);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });Wo3FR.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String FRWo1 = dataSnapshot.getValue(String.class);
                Wo3Fr.setText(FRWo1);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }
}
