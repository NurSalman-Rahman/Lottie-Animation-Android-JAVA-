package com.example.lottie;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {

    LottieAnimationView lottieAnimationView;
   // Button btn_show_loading;
  //  Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);






        intFunction();
        IntLisener();



    }

    private void IntLisener() {

        // 1. Instantiate an <code><a href="/reference/android/app/AlertDialog.Builder.html">AlertDialog.Builder</a></code> with its constructor
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

// 2. Chain together various setter methods to set the dialog characteristics

        View  view  = LayoutInflater.from(this).inflate(R.layout.custom_dialog,null);


        builder.setView(view);

        AlertDialog dialog = builder.create();


   /*     builder.setMessage(R.string.dialog_message)
                .setTitle(R.string.dialog_title);*/





       dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                dialog.dismiss();

            }
        },5000);
        dialog.show();





/*        btn_show_loading.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                lottieAnimationView.setVisibility(View.VISIBLE);

               // lottieAnimationView.pauseAnimation();

            }
        });*/








    }

    private void intFunction() {

      //
         lottieAnimationView = findViewById(R.id.Car_id);
       // lottieAnimationView.setVisibility(View.INVISIBLE);
      //  btn_show_loading = findViewById(R.id.show_loading);


    }
}