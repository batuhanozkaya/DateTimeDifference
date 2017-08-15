package com.batuhan15.datetimedifference;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void printToLog(View view){
        long currentTime = System.currentTimeMillis();
        long previousTime = (System.currentTimeMillis() - 864000000); //10 days ago

        Log.d("DateTime: ", "Difference With Second: " + AppUtility.DateTimeDifference(currentTime, previousTime, AppUtility.TimeDifference.SECOND));
        Log.d("DateTime: ", "Difference With Minute: " + AppUtility.DateTimeDifference(currentTime, previousTime, AppUtility.TimeDifference.MINUTE));
        Log.d("DateTime: ", "Difference With Hour: " + AppUtility.DateTimeDifference(currentTime, previousTime, AppUtility.TimeDifference.HOUR));
        Log.d("DateTime: ", "Difference With Day: " + AppUtility.DateTimeDifference(currentTime, previousTime, AppUtility.TimeDifference.DAY));
        Log.d("DateTime: ", "Difference With Month: " + AppUtility.DateTimeDifference(currentTime, previousTime, AppUtility.TimeDifference.MONTH));
        Log.d("DateTime: ", "Difference With Year: " + AppUtility.DateTimeDifference(currentTime, previousTime, AppUtility.TimeDifference.YEAR));

        if(AppUtility.DateTimeDifference(currentTime, previousTime, AppUtility.TimeDifference.MINUTE) > 100){
            Log.d("DateTime: ", "There are more than 100 minutes difference between two dates.");
        }else{
            Log.d("DateTime: ", "There are no more than 100 minutes difference between two dates.");
        }
    }
}
