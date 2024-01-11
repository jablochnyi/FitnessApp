package com.example.jfit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class SecondActivity3 extends AppCompatActivity {


    int[] newArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second3);


        Toolbar toolbar = findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);


        newArray = new int[]{


                R.id.upbody1_pose,R.id.upbody2_pose,R.id.upbody3_pose,R.id.upbody4_pose,R.id.upbody5_pose,R.id.upbody6_pose,R.id.upbody7_pose,R.id.upbody8_pose,R.id.upbody9_pose,R.id.upbody10_pose,R.id.upbody11_pose,R.id.upbody12_pose,R.id.upbody13_pose,R.id.upbody14_pose,




        };
    }

    public void Imagebuttonclicked(View view) {


        for (int i=0;i< newArray.length;i++){



            if (view.getId() == newArray[i]) {
                int value = i+1;
                Log.i( "FIRST",String.valueOf(value));
                Intent intent = new Intent(SecondActivity3.this,ThirdActivity3.class);
                intent.putExtra("value",String.valueOf(value));
                startActivity(intent);



            }
        }


    }
}