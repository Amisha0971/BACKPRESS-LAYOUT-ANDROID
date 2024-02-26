package com.example.backpresslayoutapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private int intLayout =1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonGoToSecondLayout(View view){
        intLayout = 2;
        setContentView(R.layout.second_layout);

    }

    public void buttonGoToMainLayout(View view){
        intLayout = 1;
        setContentView(R.layout.activity_main);

    }

    public void onBackPressed(){
        if (intLayout ==2){
            intLayout = 1;
            setContentView(R.layout.activity_main);
        }
        else{
            super.onBackPressed();
        }
    }
}