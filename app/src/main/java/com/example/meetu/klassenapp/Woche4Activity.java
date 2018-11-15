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

public class Woche4Activity extends AppCompatActivity {
    TextView Wo4Mo;
    TextView Wo4Tu;
    TextView Wo4We;
    TextView Wo4Th;
    TextView Wo4Fr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_woche4);
        Wo4Mo = (TextView) findViewById(R.id.tvWo4Mo);
        Wo4Tu = (TextView) findViewById(R.id.tvWo4Tu);
        Wo4We = (TextView) findViewById(R.id.tvWo4We);
        Wo4Th = (TextView) findViewById(R.id.tvWo4Th);
        Wo4Fr = (TextView) findViewById(R.id.tvWo4Fr);
        DatabaseReference Wo4MO = FirebaseDatabase.getInstance().getReference().child("homework").child("Week4").child("Monday");
        DatabaseReference Wo4TU = FirebaseDatabase.getInstance().getReference().child("homework").child("Week4").child("Tuesday");
        DatabaseReference Wo4WE = FirebaseDatabase.getInstance().getReference().child("homework").child("Week4").child("Wednesday");
        DatabaseReference Wo4TH = FirebaseDatabase.getInstance().getReference().child("homework").child("Week4").child("Thursday");
        DatabaseReference Wo4FR = FirebaseDatabase.getInstance().getReference().child("homework").child("Week4").child("Friday");

        Wo4MO.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String MOWo1 = dataSnapshot.getValue(String.class);
                Wo4Mo.setText(MOWo1);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });Wo4TU.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String TUWo1 = dataSnapshot.getValue(String.class);
                Wo4Tu.setText(TUWo1);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });Wo4WE.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String WEWo3 = dataSnapshot.getValue(String.class);
                Wo4We.setText(WEWo3);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });Wo4TH.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String THWo1 = dataSnapshot.getValue(String.class);
                Wo4Th.setText(THWo1);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });Wo4FR.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String FRWo1 = dataSnapshot.getValue(String.class);
                Wo4Fr.setText(FRWo1);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }
}
