package com.example.christiancarl.schedgie;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class NotesPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes_page);
    }

    public void btn_Home(View view){
        Intent intent = new Intent(this, HomePage.class);
        startActivity(intent);
        finish();
    }

    public void btn_Schedule(View view){
        Intent intent = new Intent(this, SchedulePage.class);
        startActivity(intent);
        finish();
    }

    public void btn_Notes(View view){
        Intent intent = new Intent(this, NotesPage.class);
        startActivity(intent);
        finish();
    }

    public void btn_Profile(View view){
        Intent intent = new Intent(this, ProfilePage.class);
        startActivity(intent);
        finish();
    }
}
