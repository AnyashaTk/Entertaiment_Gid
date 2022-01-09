package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       /* EditText textShirota = (EditText) findViewById(R.id.textShirota);
        EditText textDolgota = (EditText) findViewById(R.id.textDolgota);
       */ Button btnMap = (Button) findViewById(R.id.btnMap);

        View.OnClickListener oclbtnMap = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent();
                intent1.setAction(Intent.ACTION_VIEW);
                //intent1.setData(Uri.parse("geo: "+textShirota.getText().toString()+","+textDolgota.getText().toString()));
                // intent1.setData(Uri.parse("geo: "+textShirota.getText().toString()+","+textDolgota.getText().toString()));
               /* Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse(https://www.google.ru/maps));
                startActivity(intent);
                startActivity(intent1);
                */
                Uri gmmIntentUri = Uri.parse("geo:37.7749,-122.4194");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent);
                }
            }
        };
        btnMap.setOnClickListener(oclbtnMap);


    }