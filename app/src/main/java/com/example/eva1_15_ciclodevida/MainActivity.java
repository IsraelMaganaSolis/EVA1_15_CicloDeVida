package com.example.eva1_15_ciclodevida;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {//1
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "onCreate",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {//Intermediario
        super.onRestart();
        Toast.makeText(this, "onRestart",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {//2
        super.onStart();
        Toast.makeText(this, "onStart",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {//3
        super.onResume();
        Toast.makeText(this, "onResume",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {//4
        super.onPause();
        Toast.makeText(this, "onPause",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {//5
        super.onStop();
        Toast.makeText(this, "onStop",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {//6
        super.onDestroy();
        Toast.makeText(this, "onDestroid",Toast.LENGTH_SHORT).show();
    }
}