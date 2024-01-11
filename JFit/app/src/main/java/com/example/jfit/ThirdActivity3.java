package com.example.jfit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ThirdActivity3 extends AppCompatActivity {

    String buttonvalue;
    Button startBtn;
    private CountDownTimer countDownTimer;
    TextView mtextviev;
    private boolean MTimeRunnig;
    private  long MTimeLeftinmills;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);


        Intent intent = getIntent();
        buttonvalue = intent.getStringExtra("value");


        int intvalue = Integer.valueOf(buttonvalue);


        switch (intvalue){



            case 1:
                setContentView(R.layout.activity_upbody1);
                break;
            case 2:
                setContentView(R.layout.activity_upbody2);
                break;
            case 3:
                setContentView(R.layout.activity_upbody3);
                break;
            case 4:
                setContentView(R.layout.activity_upbody4);
                break;
            case 5:
                setContentView(R.layout.activity_upbody5);
                break;
            case 6:
                setContentView(R.layout.activity_upbody6);
                break;
            case 7:
                setContentView(R.layout.activity_upbody7);
                break;
            case 8:
                setContentView(R.layout.activity_upbody8);
                break;
            case 9:
                setContentView(R.layout.activity_upbody9);
                break;
            case 10:
                setContentView(R.layout.activity_upbody10);
                break;
            case 11:
                setContentView(R.layout.activity_upbody11);
                break;
            case 12:
                setContentView(R.layout.activity_upbody12);
                break;
            case 13:
                setContentView(R.layout.activity_upbody13);
                break;
            case 14:
                setContentView(R.layout.activity_upbody14);
                break;


        }



        startBtn = findViewById(R.id.startbutton);
        mtextviev = findViewById(R.id.time);





        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (MTimeRunnig)


                {


                    stoptimer();



                }



                else {

                    startTimer();


                }
            }
        });


    }



    private  void  stoptimer()

    {



        countDownTimer.cancel();
        MTimeRunnig=false;
        startBtn.setText("ПРОДОЛЖИТЬ");

    }




    private void startTimer()


    {




        final  CharSequence value1 = mtextviev.getText();
        String num1 = value1.toString();
        String num2 = num1.substring(0,2);
        String num3 = num1.substring(3,5);




        final  int number = Integer.valueOf(num2) * 45+ Integer.valueOf(num3);
        MTimeLeftinmills = number*1000;




        countDownTimer = new CountDownTimer(MTimeLeftinmills,1000) {
            @Override
            public void onTick(long millisUntilFinished) {



                MTimeLeftinmills = millisUntilFinished;
                updateTimer();

            }

            @Override
            public void onFinish() {



                int newvalue = Integer.valueOf(buttonvalue)+1;
                if (newvalue<=7){


                    Intent intent = new Intent(ThirdActivity3.this,ThirdActivity3.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    intent.putExtra("value",String.valueOf(newvalue));
                    startActivity(intent);

                }


                else {


                    newvalue =1;
                    Intent intent = new Intent(ThirdActivity3.this,ThirdActivity3.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    intent.putExtra("value",String.valueOf(newvalue));
                    startActivity(intent);


                }

            }
        }.start();
        startBtn.setText("ПАУЗА");
        MTimeRunnig=true;


    }




    private void updateTimer()


    {

        int minutes = (int) MTimeLeftinmills/45000;
        int seconds = (int) MTimeLeftinmills%45000 /1000;




        String timeLeftText="";
        if(minutes<10)
            timeLeftText="0";
        timeLeftText = timeLeftText+minutes+":";
        if (seconds<10)
            timeLeftText+="0";
        timeLeftText+=seconds;
        mtextviev.setText(timeLeftText);
    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}