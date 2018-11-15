package com.example.meetu.klassenapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.TabHost;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private TextView mTextMessage;
    private TextView mtextMessage;
    private TextView mtextmessage;
    private TextView Message;
    private TextView Message2;
    private  TextView Message3;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(R.string.Hausaufgaben);
                    mTextMessage.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            Intent intent = new Intent(Main2Activity.this, HausisActivity.class);
                            startActivity(intent);

                        }
                    });
                    return true;
                case R.id.navigation_dashboard:
                    mtextMessage.setText(R.string.title_dashboard);
                    mtextMessage.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            Intent intent = new Intent(Main2Activity.this, ArbeitenActivity.class);
                            startActivity(intent);

                        }
                    });
                    return true;
                case R.id.navigation_notifications:
                    mtextmessage.setText(R.string.title_notifications);
                    mtextmessage.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            Intent intent = new Intent(Main2Activity.this, HomeActivity.class);
                            startActivity(intent);

                        }
                    });
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.navigation) ;




        mTextMessage = (TextView) findViewById(R.id.message);
        mtextMessage = (TextView) findViewById(R.id.message);
        Message = (TextView) findViewById(R.id.message3);
        Message2 = (TextView) findViewById(R.id.message2);
        Message3 = (TextView) findViewById(R.id.message) ;

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);


        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        Message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(Main2Activity.this, HausisActivity.class);
                startActivity(intent);

            }
        });

        Message2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main2Activity.this, ArbeitenActivity.class);
                startActivity(intent);


            }
        });

        Message3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main2Activity.this, HomeActivity.class);
                startActivity(intent);


            }
        });






       };




    }


