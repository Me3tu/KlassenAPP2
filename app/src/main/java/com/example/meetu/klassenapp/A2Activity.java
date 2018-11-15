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

public class A2Activity extends AppCompatActivity {

    TextView A2Title;
    TextView A2List;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a2);


        A2Title = (TextView) findViewById(R.id.tvA2Title);
        A2List = (TextView) findViewById(R.id.tvA2List);
        DatabaseReference a2 = FirebaseDatabase.getInstance().getReference().child("arbeiten").child("Arbeit2").child("buttonname");
        DatabaseReference a2list = FirebaseDatabase.getInstance().getReference().child("arbeiten").child("Arbeit2").child("beschreibung");

        a2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String A1A = dataSnapshot.getValue(String.class);
                A2Title.setText(A1A);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        a2list.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String A1A = dataSnapshot.getValue(String.class);
                A2List.setText(A1A);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }
}
