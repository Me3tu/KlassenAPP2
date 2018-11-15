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

public class Woche2Activity extends AppCompatActivity {

    TextView Wo2Mo;
    TextView Wo2Tu;
    TextView Wo2We;
    TextView Wo2Th;
    TextView Wo2Fr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_woche2);

        Wo2Mo = (TextView) findViewById(R.id.tvWo2Mo);
        Wo2Tu = (TextView) findViewById(R.id.tvWo2Tu);
        Wo2We = (TextView) findViewById(R.id.tvWo2We);
        Wo2Th = (TextView) findViewById(R.id.tvWo2Th);
        Wo2Fr = (TextView) findViewById(R.id.tvWo2Fr);
        DatabaseReference Wo2MO = FirebaseDatabase.getInstance().getReference().child("homework").child("Week2").child("Monday");
        DatabaseReference Wo2TU = FirebaseDatabase.getInstance().getReference().child("homework").child("Week2").child("Tuesday");
        DatabaseReference Wo2WE = FirebaseDatabase.getInstance().getReference().child("homework").child("Week2").child("Wednesday");
        DatabaseReference Wo2TH = FirebaseDatabase.getInstance().getReference().child("homework").child("Week2").child("Thursday");
        DatabaseReference Wo2FR = FirebaseDatabase.getInstance().getReference().child("homework").child("Week2").child("Friday");


        Wo2MO.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String MOWo2 = dataSnapshot.getValue(String.class);
                Wo2Mo.setText(MOWo2);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        Wo2TU.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String TUWo2 = dataSnapshot.getValue(String.class);
                Wo2Tu.setText(TUWo2);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        Wo2WE.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String WEWo2 = dataSnapshot.getValue(String.class);
                Wo2We.setText(WEWo2);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        Wo2TH.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String THWo2 = dataSnapshot.getValue(String.class);
                Wo2Th.setText(THWo2);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        Wo2FR.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String FRWo2 = dataSnapshot.getValue(String.class);
                Wo2Fr.setText(FRWo2);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

    }
}
