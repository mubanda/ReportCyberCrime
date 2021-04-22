package com.example.reportcybercrime;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SelectSectorsActivity extends AppCompatActivity {

    String chosenSector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_sector);
    }

    public void goBack(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }



    public void financeBtnClicked(View view){
        chosenSector = "FINANCE";

        Intent intent = new Intent(this, ReportFormActivity.class);
        intent.putExtra("chosenSector", this.chosenSector);
        startActivity(intent);
    }

    public void educationBtnClicked(View view){
        chosenSector = "EDUCATION";

        Intent intent = new Intent(this, ReportFormActivity.class);
        intent.putExtra("chosenSector", this.chosenSector);
        startActivity(intent);
    }

    public void socialMediaBtnClicked(View view){
        this.chosenSector = "SOCIAL_MEDIA";

        Intent intent = new Intent(this, ReportFormActivity.class);
        intent.putExtra("chosenSector", this.chosenSector);
        startActivity(intent);
    }

}