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

public class A5Activity extends AppCompatActivity {
    TextView A5Title;
    TextView A5List;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a5);
        A5Title = (TextView) findViewById(R.id.tvA5Title);
        A5List = (TextView) findViewById(R.id.tvA5List);
        DatabaseReference a5 = FirebaseDatabase.getInstance().getReference().child("arbeiten").child("Arbeit5").child("buttonname");
        DatabaseReference a5list = FirebaseDatabase.getInstance().getReference().child("arbeiten").child("Arbeit5").child("beschreibung");

        a5.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String A1A = dataSnapshot.getValue(String.class);
                A5Title.setText(A1A);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        a5list.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String A1A = dataSnapshot.getValue(String.class);
                A5List.setText(A1A);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }
}
