package com.example.emilyburke.redditchallenge;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

public class TitleGuess extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title_guess);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // getSupportActionBar().setDisplayHomeAsUpEnabled(true); getting errors
    }

    public void GoToStartPage(View view){
        Intent intent= new Intent(this,StartPage.class);
        startActivity(intent);
    }

    public void CorrectAnswer (View v) {
        ImageView iv=(ImageView) findViewById(R.id.CorrectImage1);
                iv.setVisibility(View.VISIBLE);
    }

}
