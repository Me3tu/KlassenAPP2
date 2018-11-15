package com.example.meetu.klassenapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDelegate;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.crashlytics.android.Crashlytics;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import io.fabric.sdk.android.Fabric;

public class MainActivity extends AppCompatActivity {

private EditText Name;
private  EditText Passwort;
private Button Login;

int loginvalue ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        if (AppCompatDelegate.getDefaultNightMode()==AppCompatDelegate.MODE_NIGHT_YES){
            setTheme(R.style.darktheme);
        }
        super.onCreate(savedInstanceState);
        Fabric.with(this, new Crashlytics());
        setContentView(R.layout.activity_main);



        Name = (EditText) findViewById(R.id.etBenutzer);
        Passwort = (EditText) findViewById(R.id.etPasswort);
        Login = (Button) findViewById(R.id.btnLogin);



        SharedPreferences sp = getSharedPreferences("Lo", MODE_PRIVATE);
        int myIntValue = sp.getInt("loginv", 0);

if (myIntValue == 1){
    sp = null;
    Intent intent = new Intent(MainActivity.this, MenuActivity.class);
    startActivity(intent);
}


        // SharedPreferences.Editor sp = getSharedPreferences("Lo", Activity.MODE_PRIVATE);



Login.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        validate(Name.getText().toString(), Passwort.getText().toString());

    }
});

        SharedPreferences dm = getSharedPreferences("Dm", MODE_PRIVATE);
        int YourIntValue = dm.getInt("dmv", 0);

        if (YourIntValue == 1){
            dm = null;
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
            restartApp();

        }


    }
    private void loginstore (){
        SharedPreferences sp = getSharedPreferences("Lo", MODE_PRIVATE);


        SharedPreferences.Editor editor = sp.edit();
        editor.putInt( "loginv", 1);
        editor.commit();
        sp = null;

    }


    public void restartApp(){
        Intent i = new Intent(getApplicationContext(), Einstellungen.class);
        startActivity(i);
        finish();
    }


    private void validate(String username, String userpasswort) {

        DatabaseReference r1 = FirebaseDatabase.getInstance().getReference().child("rules").child("editor").child("1");
        DatabaseReference r2 = FirebaseDatabase.getInstance().getReference().child("rules").child("editor").child("2");
        DatabaseReference r3 = FirebaseDatabase.getInstance().getReference().child("rules").child("editor").child("3");
        DatabaseReference r4 = FirebaseDatabase.getInstance().getReference().child("rules").child("editor").child("4");
        DatabaseReference r5 = FirebaseDatabase.getInstance().getReference().child("rules").child("editor").child("5");
        DatabaseReference r6 = FirebaseDatabase.getInstance().getReference().child("rules").child("editor").child("6");
        DatabaseReference r7 = FirebaseDatabase.getInstance().getReference().child("rules").child("editor").child("7");
        DatabaseReference r8 = FirebaseDatabase.getInstance().getReference().child("rules").child("editor").child("8");
        DatabaseReference r9 = FirebaseDatabase.getInstance().getReference().child("rules").child("editor").child("9");
        DatabaseReference r10 = FirebaseDatabase.getInstance().getReference().child("rules").child("editor").child("10");
        DatabaseReference r11 = FirebaseDatabase.getInstance().getReference().child("rules").child("editor").child("11");
        DatabaseReference r12 = FirebaseDatabase.getInstance().getReference().child("rules").child("editor").child("12");
        DatabaseReference r13 = FirebaseDatabase.getInstance().getReference().child("rules").child("editor").child("13");
        DatabaseReference r14 = FirebaseDatabase.getInstance().getReference().child("rules").child("editor").child("14");
        DatabaseReference r15 = FirebaseDatabase.getInstance().getReference().child("rules").child("editor").child("15");
        DatabaseReference r16 = FirebaseDatabase.getInstance().getReference().child("rules").child("editor").child("16");
        DatabaseReference r17 = FirebaseDatabase.getInstance().getReference().child("rules").child("editor").child("17");
        DatabaseReference r18 = FirebaseDatabase.getInstance().getReference().child("rules").child("editor").child("18");
        DatabaseReference r19 = FirebaseDatabase.getInstance().getReference().child("rules").child("editor").child("19");
        DatabaseReference r20 = FirebaseDatabase.getInstance().getReference().child("rules").child("editor").child("20");
        DatabaseReference r21 = FirebaseDatabase.getInstance().getReference().child("rules").child("editor").child("21");
        DatabaseReference r22 = FirebaseDatabase.getInstance().getReference().child("rules").child("editor").child("22");
        DatabaseReference r23 = FirebaseDatabase.getInstance().getReference().child("rules").child("editor").child("23");
        DatabaseReference r24 = FirebaseDatabase.getInstance().getReference().child("rules").child("editor").child("24");
        DatabaseReference r25 = FirebaseDatabase.getInstance().getReference().child("rules").child("editor").child("25");
        DatabaseReference r26 = FirebaseDatabase.getInstance().getReference().child("rules").child("editor").child("26");

        if ((username.equals("1")) && (userpasswort.equals("1"))) {


            Intent intent = new Intent(MainActivity.this, MenuActivity.class);
            startActivity(intent);


        }


        if ((username.equals("meetu")) && (userpasswort.equals("meetu2005"))) {
            if (r5.equals("y")) {
                Intent intent = new Intent(MainActivity.this, MenuE.class);
                startActivity(intent);



            }


                if ((username.equals("SamuelaBlack") && (userpasswort.equals("BDay07102005")))) {
                    Intent intent = new Intent(MainActivity.this, MenuActivity.class);
                    startActivity(intent);
                    loginstore();

                }
                if ((username.equals("Sam") && (userpasswort.equals("tsvhh2015")))) {
                    Intent intent = new Intent(MainActivity.this, MenuActivity.class);
                    startActivity(intent);
                    loginstore();

                }
                if ((username.equals("Leon") && (userpasswort.equals("LiebesLied")))) {
                    Intent intent = new Intent(MainActivity.this, MenuActivity.class);
                    startActivity(intent);
                    loginstore();

                }
                if ((username.equals("Ingi") && (userpasswort.equals("Gzuz4BonezMc")))) {
                    Intent intent = new Intent(MainActivity.this, MenuActivity.class);
                    startActivity(intent);
                    loginstore();

                }
                if ((username.equals("Hanna") && (userpasswort.equals("Hannana15")))) {
                    Intent intent = new Intent(MainActivity.this, MenuActivity.class);
                    startActivity(intent);
                    loginstore();

                }
                if ((username.equals("Marcokm21") && (userpasswort.equals("Olli2015")))) {
                    Intent intent = new Intent(MainActivity.this, MenuActivity.class);
                    startActivity(intent);
                    loginstore();

                } else {


                }
                if ((username.equals("Jasming") && (userpasswort.equals("091224")))) {
                    Intent intent = new Intent(MainActivity.this, MenuActivity.class);
                    startActivity(intent);
                    loginstore();

                } else {


                }
                if ((username.equals("NagelLa213") && (userpasswort.equals("rockig213")))) {
                    Intent intent = new Intent(MainActivity.this, MenuActivity.class);
                    startActivity(intent);
                    loginstore();

                } else {


                }
                if ((username.equals("louisa13") && (userpasswort.equals("1234")))) {
                    Intent intent = new Intent(MainActivity.this, MenuActivity.class);
                    startActivity(intent);
                    loginstore();

                } else {


                }
                if ((username.equals("Ollie2005") && (userpasswort.equals("Ojotter2703")))) {
                    Intent intent = new Intent(MainActivity.this, MenuActivity.class);
                    startActivity(intent);
                    loginstore();

                } else {


                }
                if ((username.equals("jsxbro") && (userpasswort.equals("hasenkamel6")))) {
                    Intent intent = new Intent(MainActivity.this, MenuActivity.class);
                    startActivity(intent);
                    loginstore();

                } else {


                }
                if ((username.equals("Moritz") && (userpasswort.equals("Moritz2005")))) {
                    Intent intent = new Intent(MainActivity.this, MenuActivity.class);
                    startActivity(intent);
                    loginstore();

                } else {


                }
                if ((username.equals("Ismael") && (userpasswort.equals("mckillerelal")))) {
                    Intent intent = new Intent(MainActivity.this, MenuActivity.class);
                    startActivity(intent);
                    loginstore();

                } else {


                }
                if ((username.equals("riyakk") && (userpasswort.equals("happyface")))) {
                    Intent intent = new Intent(MainActivity.this, MenuActivity.class);
                    startActivity(intent);
                    loginstore();

                } else {


                }
                if ((username.equals("lilliLovegood") && (userpasswort.equals("shadow321")))) {
                    Intent intent = new Intent(MainActivity.this, MenuActivity.class);
                    startActivity(intent);
                    loginstore();

                } else {


                }
                if ((username.equals("Nikita") && (userpasswort.equals("lka567")))) {
                    Intent intent = new Intent(MainActivity.this, MenuActivity.class);
                    startActivity(intent);
                    loginstore();

                } else {


                }
                if ((username.equals("xxEloxx") && (userpasswort.equals("dumbledore")))) {
                    Intent intent = new Intent(MainActivity.this, MenuActivity.class);
                    startActivity(intent);
                    loginstore();

                } else {


                }
                if ((username.equals("LetsDanielGHG") && (userpasswort.equals("RelaxoGo")))) {
                    Intent intent = new Intent(MainActivity.this, MenuActivity.class);
                    startActivity(intent);
                    loginstore();

                } else {


                }
                if ((username.equals("JadeSophie") && (userpasswort.equals("brasil2005")))) {
                    Intent intent = new Intent(MainActivity.this, MenuActivity.class);
                    startActivity(intent);
                    loginstore();

                } else {


                }
                if ((username.equals("Anabelle") && (userpasswort.equals("Passion")))) {
                    Intent intent = new Intent(MainActivity.this, MenuActivity.class);
                    startActivity(intent);
                    loginstore();

                } else {


                }
                if ((username.equals("Saya") && (userpasswort.equals("noname101")))) {
                    Intent intent = new Intent(MainActivity.this, MenuActivity.class);
                    startActivity(intent);
                    loginstore();

                } else {


                }
                if ((username.equals("Antonia") && (userpasswort.equals("CharlieA")))) {
                    Intent intent = new Intent(MainActivity.this, MenuActivity.class);
                    startActivity(intent);
                    loginstore();

                } else {


                }
                if ((username.equals("TimW") && (userpasswort.equals("W23")))) {
                    Intent intent = new Intent(MainActivity.this, MenuActivity.class);
                    startActivity(intent);
                    loginstore();

                } else {


                }
                if ((username.equals("adriboy21") && (userpasswort.equals("SLGFortnite")))) {
                    Intent intent = new Intent(MainActivity.this, MenuActivity.class);
                    startActivity(intent);
                    loginstore();

                } else {


                }
                if ((username.equals("lehrer") && (userpasswort.equals("LehrerD")))) {
                    Intent intent = new Intent(MainActivity.this, MenuActivity.class);
                    startActivity(intent);
                    loginstore();


                }
            }}
            private void logUser () {
                // TODO: Use the current user's information
                // You can call any combination of these three methods
                Crashlytics.setUserIdentifier("12345");
                Crashlytics.setUserEmail("user@fabric.io");
                Crashlytics.setUserName("Test User");
            }


    }