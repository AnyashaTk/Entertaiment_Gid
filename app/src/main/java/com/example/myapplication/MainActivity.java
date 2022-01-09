package com.example.mapapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       /* EditText textShirota = (EditText) findViewById(R.id.textShirota);
        EditText textDolgota = (EditText) findViewById(R.id.textDolgota);
       */
        Button btnMap = (Button) findViewById(R.id.btnMap);
        Button btnMap2 = (Button) findViewById(R.id.btnMap2);
        Button btnMap3 = (Button) findViewById(R.id.btnMap3);
        Button btnMap4 = (Button) findViewById(R.id.btnMap4);
        Button btnMap5 = (Button) findViewById(R.id.btnMap5);

        View.OnClickListener oclbtnMap2 = new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent2 = new Intent();

                intent2.setAction(Intent.ACTION_VIEW);

                intent2.setData(Uri.parse("http://www.vk.com"));

                // Uri gmmIntentUri = Uri.parse("гео:37.7749,-122.4192?q=" + Uri.encode("1-й и Пайк, Сиэтл"));
                // Uri gmmIntentUri = Uri.parse("гео:37.7749,-122.4194");

                intent2.setData(Uri.parse("geo:48.206487, 16.363460"));


                startActivity(intent2);

            }
        };
        btnMap2.setOnClickListener(oclbtnMap2);
        View.OnClickListener oclbtnMap = new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent();

                intent.setAction(Intent.ACTION_VIEW);

                intent.setData(Uri.parse("http://www.vk.com"));

                // Uri gmmIntentUri = Uri.parse("гео:37.7749,-122.4192?q=" + Uri.encode("1-й и Пайк, Сиэтл"));
                // Uri gmmIntentUri = Uri.parse("гео:37.7749,-122.4194");

                intent.setData(Uri.parse("geo:51.507351, -0.127696"));


                startActivity(intent);

            }
        };
        btnMap.setOnClickListener(oclbtnMap);
        View.OnClickListener oclbtnMap3 = new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent3 = new Intent();

                intent3.setAction(Intent.ACTION_VIEW);

                intent3.setData(Uri.parse("http://www.vk.com"));

                // Uri gmmIntentUri = Uri.parse("гео:37.7749,-122.4192?q=" + Uri.encode("1-й и Пайк, Сиэтл"));
                // Uri gmmIntentUri = Uri.parse("гео:37.7749,-122.4194");

                intent3.setData(Uri.parse("geo:50.080345, 14.428974"));


                startActivity(intent3);

            }
        };
        btnMap3.setOnClickListener(oclbtnMap3);

        View.OnClickListener oclbtnMap4 = new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent4 = new Intent();

                intent4.setAction(Intent.ACTION_VIEW);

                intent4.setData(Uri.parse("http://www.vk.com"));

                // Uri gmmIntentUri = Uri.parse("гео:37.7749,-122.4192?q=" + Uri.encode("1-й и Пайк, Сиэтл"));
                // Uri gmmIntentUri = Uri.parse("гео:37.7749,-122.4194");

                intent4.setData(Uri.parse("geo:50.080345, 14.428974"));


                startActivity(intent4);

            }
        };
        btnMap4.setOnClickListener(oclbtnMap4);

        View.OnClickListener oclbtnMap5 = new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent5 = new Intent();

                intent5.setAction(Intent.ACTION_VIEW);

                intent5.setData(Uri.parse("http://www.vk.com"));

                intent5.setData(Uri.parse("geo:52.518621, 13.375142"));

                startActivity(intent5);

            }
        };
        btnMap5.setOnClickListener(oclbtnMap5);
    }
}
