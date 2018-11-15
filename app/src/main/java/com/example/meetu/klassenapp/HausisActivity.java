package com.example.meetu.klassenapp;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class HausisActivity extends AppCompatActivity {

    private TextView Woche1;
    private TextView Woche2;
    private TextView Woche3;
    private TextView Woche4;
    private Button Habm;
    private DrawerLayout dlm;
    private ActionBarDrawerToggle abdtm;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hausis);

        Woche1 = (TextView) findViewById(R.id.textView2);
        Woche2 = (TextView) findViewById(R.id.textView3);
        Woche3 = (TextView) findViewById(R.id.textView4);
        Woche4 = (TextView) findViewById(R.id.textView);
        Habm = (Button) findViewById(R.id.HABM);
        dlm = (DrawerLayout) findViewById(R.id.dls);
        abdtm = new ActionBarDrawerToggle(this, dlm,R.string.Openm, R.string.Closem );
        abdtm.setDrawerIndicatorEnabled(true);
        dlm.addDrawerListener(abdtm);
        abdtm.syncState();




        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        NavigationView nav_viewm = (NavigationView) findViewById(R.id.nav_viewm);

        nav_viewm.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem Item) {
                int id = Item.getItemId();
                if (id == R.id.hausm){
                    Intent i = new Intent(HausisActivity.this, MenuActivity.class);
                    startActivity(i);
                }
                else if (id == R.id.arbem){
                    Intent i = new Intent(HausisActivity.this, ArbeitenActivity.class);
                    startActivity(i);

                }
                else if (id == R.id.extrm){
                    Intent i = new Intent(HausisActivity.this, Einstellungen.class);
                    startActivity(i);


                }
                else if (id == R.id.spei){
                    Intent i = new Intent(HausisActivity.this, Speiseplan.class);
                    startActivity(i);


                }
                return true;
            }
        });



        Habm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HausisActivity.this, HabM.class);
                startActivity(intent);
            }
        });

        Woche1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HausisActivity.this, Woche1Activity.class);
                startActivity(intent);
            }
        });
        Woche2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HausisActivity.this, Woche2Activity.class);
                startActivity(intent);
    }
}); Woche3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HausisActivity.this, Woche3Activity.class);
                startActivity(intent);
            }
        });
        Woche4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HausisActivity.this, Woche4Activity.class);
                startActivity(intent);
            }
        });




    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return abdtm.onOptionsItemSelected(item) || super.onOptionsItemSelected(item);

    }
}
