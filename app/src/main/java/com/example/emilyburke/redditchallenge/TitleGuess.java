package com.example.emilyburke.redditchallenge;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import RedditCon.Post;
import RedditCon.PostsHolder;

public class TitleGuess extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title_guess);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        PostsHolder p = new PostsHolder("AskReddit");       //Testing post puller with AskReddit subreddit. Getting errors.
        list = p.fetchPosts();
        PostTitle = list.get(0).title;
        // getSupportActionBar().setDisplayHomeAsUpEnabled(true); getting errors
    }

    List<Post> list=new ArrayList<Post>();
    String PostTitle;

    public void GoToStartPage(View view){
        Intent intent= new Intent(this,StartPage.class);
        startActivity(intent);
    }

    public void CorrectAnswer (View v) {
               new CountDownTimer(10000,1000) {
                   @Override
                   public void onTick(long millisUntilFinished) {
                       ImageView ivC=(ImageView) findViewById(R.id.CorrectImage1); //errors told me this has to be within the public void
                       ivC.setVisibility(View.VISIBLE);
                       TextView score=(TextView) findViewById(R.id.Score1);
                        score.setText("10"); //make add on
                   }

                   //below makes the "you are correct image disappear after 10 seconds
                   @Override
                   public void onFinish(){
                       ImageView ivC=(ImageView) findViewById(R.id.CorrectImage1);
                       ivC.setVisibility(View.INVISIBLE);
                   }
               }.start();
    }

    public void WrongAnswer (View v) {
        new CountDownTimer(10000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                ImageView ivW=(ImageView) findViewById(R.id.WrongImage1); //errors told me this has to be within the public void
                ivW.setVisibility(View.VISIBLE);
            }

            //below makes the "you are correct image disappear after 10 seconds
            @Override
            public void onFinish(){
                ImageView ivW=(ImageView) findViewById(R.id.WrongImage1);
                ivW.setVisibility(View.INVISIBLE);
            }
        }.start();
    }

}
