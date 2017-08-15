# DateTimeDifference

You can calculate the difference in time in miliseconds using this method and get the outputs in seconds, minutes, hours, days, months and years. 

* Simple to use

```
long currentTime = System.currentTimeMillis();
long previousTime = (System.currentTimeMillis() - 864000000); //10 days ago

Log.d("DateTime: ", "Difference With Second: " + AppUtility.DateTimeDifference(currentTime, previousTime, AppUtility.TimeDifference.SECOND));
Log.d("DateTime: ", "Difference With Minute: " + AppUtility.DateTimeDifference(currentTime, previousTime, AppUtility.TimeDifference.MINUTE));
```

* You can compare the example below

```
if(AppUtility.DateTimeDifference(currentTime, previousTime, AppUtility.TimeDifference.MINUTE) > 100){
    Log.d("DateTime: ", "There are more than 100 minutes difference between two dates.");
}else{
    Log.d("DateTime: ", "There are no more than 100 minutes difference between two dates.");
}
```




