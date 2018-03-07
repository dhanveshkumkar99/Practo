package com.sourcekode.practo.practo;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {

    Animation zoomin,zoomout;
    ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        imageView = (ImageView)findViewById(R.id.imageView);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();


      Thread tsplash = new Thread(new Runnable() {
          @Override
          public void run() {
              try {
                  Thread.sleep(1000);

                  Intent i = new Intent(SplashActivity.this,DrawerNavigationActivity.class);
                  startActivity(i);
                  finish();
              } catch (InterruptedException e) {
                  e.printStackTrace();
              }
          }
      });

      tsplash.start();

    }
}
