package com.example.android.appportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void movie (View v) {
        Toast.makeText(MainActivity.this, "this button will launch my moive app  project",
                Toast.LENGTH_LONG).show();
    }
    public void hawk (View view){
        Toast.makeText(MainActivity.this,  "this button will launch my stock hawk project",
                Toast.LENGTH_LONG).show();

    }
    public void bigger (View view){
        Toast.makeText(MainActivity.this,  "this button will launch my Build It Bigger project",
                Toast.LENGTH_LONG).show();

    }
    public void material (View view){
        Toast.makeText(MainActivity.this,  "this button will launch my Material  project",
                Toast.LENGTH_LONG).show();
    }
    public void go (View view){
        Toast.makeText(MainActivity.this,  "this button will launch my Go Ubiquitous  project",
                Toast.LENGTH_LONG).show();
    }
    public void gapstone (View view){
        Toast.makeText(MainActivity.this, "this button will launch my Gapstone  project",
                Toast.LENGTH_LONG).show();
    }
}
