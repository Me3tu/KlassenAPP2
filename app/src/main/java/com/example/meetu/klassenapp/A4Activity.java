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

public class A4Activity extends AppCompatActivity {
    TextView A4Title;
    TextView A4List;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a4);
        A4Title = (TextView) findViewById(R.id.tvA4Title);
        A4List = (TextView) findViewById(R.id.tvA4List);
        DatabaseReference a4 = FirebaseDatabase.getInstance().getReference().child("arbeiten").child("Arbeit5").child("buttonname");
        DatabaseReference a4list = FirebaseDatabase.getInstance().getReference().child("arbeiten").child("Arbeit5").child("beschreibung");

        a4.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String A1A = dataSnapshot.getValue(String.class);
                A4Title.setText(A1A);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        a4list.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String A1A = dataSnapshot.getValue(String.class);
                A4List.setText(A1A);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }
}
