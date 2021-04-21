package com.example.reportcybercrime;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ReportFormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report_form);
    }

    public void goBack(View view) {
        Intent intent = new Intent(this, SelectSectorsActivity.class);
        startActivity(intent);
    }
}