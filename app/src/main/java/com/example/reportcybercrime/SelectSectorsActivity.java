package com.example.reportcybercrime;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SelectSectorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_sector);
    }

    public void displayFinanceActivity(View view){
        Intent intent = new Intent(this, ReportFormActivity.class);
        startActivity(intent);

    }

    public void displayEducationActivity(View view){
        Intent intent = new Intent(this, ReportFormActivity.class);
        startActivity(intent);
    }

    public void displaySocialMediaActivity(View view){
        Intent intent = new Intent(this, ReportFormActivity.class);
        startActivity(intent);
    }

    public void goBack(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}