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

import org.w3c.dom.Text;

public class HabM extends AppCompatActivity {


    TextView HaBM;
    TextView habmd;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hab_m);
        HaBM = (TextView) findViewById(R.id.habm);
        habmd = (TextView) findViewById(R.id.habmd);

        final DatabaseReference HABM = FirebaseDatabase.getInstance().getReference().child("homework").child("bismorgen").child("hausaufgaben");
        DatabaseReference Habmd = FirebaseDatabase.getInstance().getReference().child("homework").child("bismorgen").child("updatetime");

        HABM.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String MOWo1 = dataSnapshot.getValue(String.class);
                HaBM.setText(MOWo1);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

       Habmd.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String TUWo1 = dataSnapshot.getValue(String.class);
                habmd.setText("Updatetime:  " + TUWo1);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });






    }
}
