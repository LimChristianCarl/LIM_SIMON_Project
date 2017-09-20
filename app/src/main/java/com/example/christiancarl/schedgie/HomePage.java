package com.example.christiancarl.schedgie;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
    }

    public void btn_addNotes(View view){
        Intent intent = new Intent(this, NotesPage.class);
        startActivity(intent);
    }

    public void btn_Schedule(View view){
        Intent intent = new Intent(this, SchedulePage.class);
        startActivity(intent);
    }

    public void btn_addReminder(View view){
        Intent intent = new Intent(this, ReminderPage.class);
        startActivity(intent);
    }

    public void btn_Profile(View view){
        Intent intent = new Intent(this, ProfilePage.class);
        startActivity(intent);
    }
}
