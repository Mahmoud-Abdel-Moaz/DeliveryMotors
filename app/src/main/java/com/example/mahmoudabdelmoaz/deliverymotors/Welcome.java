package com.example.mahmoudabdelmoaz.deliverymotors;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;

import com.felipecsl.gifimageview.library.GifImageView;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;

public class Welcome extends AppCompatActivity {

    private GifImageView gifImageView;
    //private ProgressBar progressBar;

    private static int SPLASH_TIME_OUT=5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        /*
        gifImageView=findViewById(R.id.gifImageView);
        //progressBar=findViewById(R.id.progressBar);
        //progressBar.setVisibility(progressBar.VISIBLE);

        //Set GifImage resource
        try {
            InputStream inputStream=getAssets().open("bicyle.gif");
            byte[] bytes= IOUtils.toByteArray(inputStream);
            gifImageView.setBytes(bytes);
            gifImageView.startAnimation();
        }catch (IOException e){

        }*/
        //Wait for 3 seconds and start Activity Main
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent homeIntent=new Intent(Welcome.this,StartActivity.class);
                startActivity(homeIntent);
                finish();
            }
        },SPLASH_TIME_OUT);
    }
}
