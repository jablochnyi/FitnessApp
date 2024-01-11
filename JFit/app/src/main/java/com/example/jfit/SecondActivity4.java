package com.example.jfit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class SecondActivity4 extends AppCompatActivity {


    int[] newArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second4);


        Toolbar toolbar = findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);


        newArray = new int[]{


                R.id.press1_pose,R.id.press2_pose,R.id.press3_pose,R.id.press4_pose,R.id.press5_pose,R.id.press6_pose,R.id.press7_pose,R.id.press8_pose,R.id.press9_pose,R.id.press10_pose,R.id.press11_pose,R.id.press12_pose,




        };
    }

    public void Imagebuttonclicked(View view) {


        for (int i=0;i< newArray.length;i++){



            if (view.getId() == newArray[i]) {
                int value = i+1;
                Log.i( "FIRST",String.valueOf(value));
                Intent intent = new Intent(SecondActivity4.this,ThirdActivity4.class);
                intent.putExtra("value",String.valueOf(value));
                startActivity(intent);



            }
        }


    }
}