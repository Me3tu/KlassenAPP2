package com.example.meetu.klassenapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDelegate;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Einstellungen extends AppCompatActivity {

    private Button Logout;
    private TextView ldu;
    private Button dm;

    public Switch Myswitch;
    private DrawerLayout dle;
    private ActionBarDrawerToggle abdte;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        if (AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES) {
            setTheme(R.style.darktheme);
        }

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_einstellungen);
        dle = (DrawerLayout) findViewById(R.id.dls);
        abdte = new ActionBarDrawerToggle(this, dle,R.string.Openm, R.string.Closem );
        abdte.setDrawerIndicatorEnabled(true);
        dle.addDrawerListener(abdte);
        abdte.syncState();




        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        NavigationView nav_viewe = (NavigationView) findViewById(R.id.nav_viewe);

        nav_viewe.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem Item) {
                int id = Item.getItemId();
                if (id == R.id.hause){
                    Intent i = new Intent(Einstellungen.this, HausisActivity.class);
                    startActivity(i);
                }
                else if (id == R.id.arbee){
                    Intent i = new Intent(Einstellungen.this, ArbeitenActivity.class);
                    startActivity(i);

                }

                else if (id == R.id.einstellungene){
                    Intent i = new Intent(Einstellungen.this, MenuActivity.class);
                    startActivity(i);


                }
                else if (id == R.id.spei){
                    Intent i = new Intent(Einstellungen.this, Speiseplan.class);
                    startActivity(i);


                }

                return true;
            }
        });

        Logout = (Button) findViewById(R.id.btnLogout);
        ldu = (TextView) findViewById(R.id.LDU);
        //Myswitch = (Switch) findViewById(R.id.myswitch);//
        if (AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES) {
            Myswitch.setChecked(true);
        }
       // Myswitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
       //     @Override
       //     public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
       //         if (isChecked) {
       //             AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
         //           restartApp();
         //           darkmode();


       //         } else {
        //            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        //            restartApp();
        //        }
       //     }
      //  });


        SharedPreferences dm = getSharedPreferences("Dm", MODE_PRIVATE);
        int yourIntValue = dm.getInt("dmv", 0);

        if (yourIntValue == 1) {
            dm = null;

        }
        SharedPreferences sp = getSharedPreferences("Lo", MODE_PRIVATE);
        int myIntValue = sp.getInt("loginv", 0);


        Logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Einstellungen.this, MainActivity.class);
                startActivity(intent);
                loginstore();


            }});
        DatabaseReference a4 = FirebaseDatabase.getInstance().getReference().child("standardData").child("LDU");

        a4.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String ha = dataSnapshot.getValue(String.class);
                ldu.setText(ha);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        final DatabaseReference LDsU = FirebaseDatabase.getInstance().getReference().child("standardData").child("LDU");


        LDsU.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String meme = dataSnapshot.getValue(String.class);
                ldu.setText(meme);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


    }



    private void darkmode (){
        SharedPreferences sp = getSharedPreferences("Dm", MODE_PRIVATE);


        SharedPreferences.Editor editor = sp.edit();
        editor.putInt( "dmv", 1);
        editor.commit();
        sp = null;

    }

public void restartApp (){
        Intent i = new Intent(getApplicationContext(), Einstellungen.class);
        startActivity(i);
        finish();
}
    private void loginstore (){
        SharedPreferences sp = getSharedPreferences("Lo", MODE_PRIVATE);


        SharedPreferences.Editor editor = sp.edit();
        editor.putInt( "loginv", 0);
        editor.commit();
        sp = null;

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return abdte.onOptionsItemSelected(item) || super.onOptionsItemSelected(item);

    }}


