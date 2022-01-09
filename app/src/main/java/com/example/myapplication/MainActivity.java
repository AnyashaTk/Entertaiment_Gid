package com.example.myapplication;

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

        View.OnClickListener oclbtnMap = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent();
                Intent intent2 = new Intent();
                Intent intent3 = new Intent();
                Intent intent4 = new Intent();
                Intent intent5 = new Intent();

                intent1.setAction(Intent.ACTION_VIEW);
                intent2.setAction(Intent.ACTION_VIEW);
                intent3.setAction(Intent.ACTION_VIEW);
                intent4.setAction(Intent.ACTION_VIEW);
                intent5.setAction(Intent.ACTION_VIEW);
                intent1.setData(Uri.parse("http://www.vk.com"));
                intent2.setData(Uri.parse("http://www.vk.com"));
                intent3.setData(Uri.parse("http://www.vk.com"));
                intent4.setData(Uri.parse("http://www.vk.com"));
                intent5.setData(Uri.parse("http://www.vk.com"));
                // Uri gmmIntentUri = Uri.parse("гео:37.7749,-122.4192?q=" + Uri.encode("1-й и Пайк, Сиэтл"));
                // Uri gmmIntentUri = Uri.parse("гео:37.7749,-122.4194");
                intent1.setData(Uri.parse("geo:51.507351, -0.127696"));
                intent2.setData(Uri.parse("geo:48.206487, 16.363460"));
                intent3.setData(Uri.parse("geo:50.080345, 14.428974"));
                intent4.setData(Uri.parse("geo:55.753220, 37.622513"));
                intent5.setData(Uri.parse("geo:52.518621, 13.375142"));

                startActivity(intent1);
                startActivity(intent2);
                startActivity(intent3);
                startActivity(intent4);
                startActivity(intent5);
            }
        };
        btnMap.setOnClickListener(oclbtnMap);
        btnMap2.setOnClickListener(oclbtnMap);
        btnMap3.setOnClickListener(oclbtnMap);
        btnMap4.setOnClickListener(oclbtnMap);
        btnMap5.setOnClickListener(oclbtnMap);
    }
}