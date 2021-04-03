package com.example.reportcybercrime;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displaySignInActivity(View view){
        Intent intent = new Intent(this, SignInActivity.class);
        startActivity(intent);
    }

    public void displayReportFormsActivity(View view){
        Intent intent = new Intent(this, ReportFormsActivity.class);
        startActivity(intent);
    }

    public void displayMainMenuActivity(View view){
        Intent intent = new Intent(this, MainMenuActivity.class);
        startActivity(intent);
    }

    public void displaySettingsActivity(View view){
        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);
    }

    public void displayReportListActivity(View view){
        Intent intent = new Intent(this, ReportListActivity.class);
        startActivity(intent);
    }


}