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

public class A1Activity extends AppCompatActivity {

     TextView A1Title;
    TextView A1List;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a1);

        A1Title = (TextView) findViewById(R.id.tvA1Title);
        A1List = (TextView) findViewById(R.id.tvA1List);
        DatabaseReference a1 = FirebaseDatabase.getInstance().getReference().child("arbeiten").child("Arbeit1").child("buttonname");
        DatabaseReference a1list = FirebaseDatabase.getInstance().getReference().child("arbeiten").child("Arbeit1").child("beschreibung");

        a1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String A1A = dataSnapshot.getValue(String.class);
                A1Title.setText(A1A);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        a1list.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String A1A = dataSnapshot.getValue(String.class);
                A1List.setText(A1A);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

}}
