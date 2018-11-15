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

public class A3Activity extends AppCompatActivity {
    TextView A3Title;
    TextView A3List;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a3);
        A3Title = (TextView) findViewById(R.id.tvA3Title);
        A3List = (TextView) findViewById(R.id.tvA3List);
        DatabaseReference a3 = FirebaseDatabase.getInstance().getReference().child("arbeiten").child("Arbeit3").child("buttonname");
        DatabaseReference a3list = FirebaseDatabase.getInstance().getReference().child("arbeiten").child("Arbeit3").child("beschreibung");

        a3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String A1A = dataSnapshot.getValue(String.class);
                A3Title.setText(A1A);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        a3list.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String A1A = dataSnapshot.getValue(String.class);
                A3List.setText(A1A);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }
}
