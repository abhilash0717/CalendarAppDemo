package com.example.calendarappdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.CalendarView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CalendarView calendar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        calendar = findViewById(R.id.calendarView);

   calendar.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
       @Override
       public void onSelectedDayChange( CalendarView view, int year, int month, int dayOfMonth) {

           Intent intent = new Intent(MainActivity.this,AddingTaskActivity.class);
           startActivity(intent);
       }
   });

    }


}
