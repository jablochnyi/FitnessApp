package com.example.jfit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class SecondActivity2 extends AppCompatActivity {


    int[] newArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second2);


        Toolbar toolbar = findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);


        newArray = new int[]{


                R.id.legs1_pose,R.id.legs2_pose,R.id.legs3_pose,R.id.legs4_pose,R.id.legs5_pose,R.id.legs6_pose,




        };
    }

    public void Imagebuttonclicked(View view) {


        for (int i=0;i< newArray.length;i++){



            if (view.getId() == newArray[i]) {
                int value = i+1;
                Log.i( "FIRST",String.valueOf(value));
                Intent intent = new Intent(SecondActivity2.this,ThirdActivity2.class);
                intent.putExtra("value",String.valueOf(value));
                startActivity(intent);



            }
        }


    }
}