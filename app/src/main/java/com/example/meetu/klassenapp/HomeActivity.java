package com.example.meetu.klassenapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    private Button HE;

    private Button HSp;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        HE = (Button) findViewById(R.id.btnHE);
        HSp = (Button) findViewById(R.id.btnHSp2);



        HE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, Einstellungen.class );
                startActivity(intent);

            }
        });

        HSp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, Speiseplan.class );
                startActivity(intent);

            }
        });








    }
}
