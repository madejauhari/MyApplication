package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button btnBukaSatu, btnBukaDua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        btnBukaSatu = (Button) findViewById(R.id.btnBukaSatu);
        btnBukaDua = (Button) findViewById(R.id.btnBukaDua);

        btnBukaSatu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BukaActsatu = new Intent(getApplicationContext(), SatuActivity.class);
                startActivity(BukaActsatu);
            }
        });

        btnBukaDua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BukaDua();
            }
        });


    }
    public void BukaDua(){
        Intent BukaActDua = new Intent(getApplicationContext(), DuaActivity.class);
        startActivity(BukaActDua);

    }

}