package com.example.reportcybercrime;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.textfield.TextInputLayout;

public class ReportFormActivity extends AppCompatActivity {

    String chosenSector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report_form);


    }

    @Override
    protected void onResume() {
        super.onResume();

        initiateRoleDropDown();
        initiateCategoryDropDown();
        initiateSuspectTypeDropDown();
        initiateDateHelperText();
        initiateTimeHelperText ();

        this.chosenSector = (String) getIntent().getSerializableExtra("chosenSector");
        System.out.println("THE CHOSEN SECTOR"+chosenSector);
        displayCorrectSector(chosenSector);
    }

    private void displayCorrectSector(String chosenSector) {
        TextView finHeaderTextView = findViewById(R.id.financial_details_header_tv);
        androidx.cardview.widget.CardView eduFinCardView = findViewById(R.id.edu_fin_card_view);
        TextView eduHeaderTextView = findViewById(R.id.educational_details_header_tv);
        androidx.cardview.widget.CardView socialMediaCardView = findViewById(R.id.social_media_card_view);
        com.google.android.material.textfield.TextInputLayout suspectUsernameTextView = findViewById(R.id.suspect_username_til);
        com.google.android.material.textfield.TextInputLayout suspectProfileLinkTextView = findViewById(R.id.suspect_profile_til);

        if (chosenSector.equals("FINANCE")) {
            ((ViewGroup)eduHeaderTextView.getParent()).removeView(eduHeaderTextView);
            ((ViewGroup)socialMediaCardView.getParent()).removeView(socialMediaCardView);
            ((ViewGroup)suspectUsernameTextView.getParent()).removeView(suspectUsernameTextView);
            ((ViewGroup)suspectProfileLinkTextView.getParent()).removeView(suspectProfileLinkTextView);
        } else if (chosenSector.equals("EDUCATION")) {

            ((ViewGroup)finHeaderTextView.getParent()).removeView(finHeaderTextView);
            ((ViewGroup)socialMediaCardView.getParent()).removeView(socialMediaCardView);
            ((ViewGroup)suspectUsernameTextView.getParent()).removeView(suspectUsernameTextView);
            ((ViewGroup)suspectProfileLinkTextView.getParent()).removeView(suspectProfileLinkTextView);
        } else if (chosenSector.equals("SOCIAL_MEDIA")) {
            ((ViewGroup)eduFinCardView.getParent()).removeView(eduFinCardView);
        }
    }


    public void goBack(View view) {
        Intent intent = new Intent(this, SelectSectorsActivity.class);
        startActivity(intent);
    }

    //On Resume
    private void initiateRoleDropDown(){
        String[] roleItems = new String[] {"Victim", "Witness"};
        ArrayAdapter<String> adapter = new ArrayAdapter(ReportFormActivity.this, R.layout.list_item, roleItems);

        AutoCompleteTextView roleDropdown = findViewById(R.id.role_text_view);
        roleDropdown.setAdapter(adapter);
        roleDropdown.setInputType(InputType.TYPE_NULL);
    }

    private void initiateCategoryDropDown(){
        String[] categoryItems = new String[] {"Phishing", "Malware", "Cyber Bullying", "Cyber Stalking", "Hacking", "Online Scam", "Social Engineering", "Ransomware", "Online Child Abuse and Exploitation", "Identity Theft", "DDoS attack"};
        ArrayAdapter<String> adapter = new ArrayAdapter(ReportFormActivity.this, R.layout.list_item, categoryItems);

        AutoCompleteTextView categoryDropdown = findViewById(R.id.category_text_view);
        categoryDropdown.setAdapter(adapter);
        categoryDropdown.setInputType(InputType.TYPE_NULL);
    }

    private void initiateSuspectTypeDropDown() {
        String[] typeItems = new String[] {"Individual", "Group"};
        ArrayAdapter<String> adapter = new ArrayAdapter(ReportFormActivity.this, R.layout.list_item, typeItems);

        AutoCompleteTextView typeDropdown = findViewById(R.id.suspect_type_text_view);
        typeDropdown.setAdapter(adapter);
        typeDropdown.setInputType(InputType.TYPE_NULL);

    }

    private void initiateDateHelperText () {
        final TextInputLayout textInputLayout = findViewById(R.id.date_til);
        final EditText editText = findViewById(R.id.date_edit_text);

        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                //When Clicked
                if(hasFocus)
                    textInputLayout.setHelperText("Format: DD-MM-YYYY");
                //When not clicked
                else
                    textInputLayout.setHelperTextEnabled(false);
            }
        });
    }

    private void initiateTimeHelperText () {
        final TextInputLayout textInputLayout = findViewById(R.id.time_til);
        final EditText editText = findViewById(R.id.time_edit_text);

        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                //When Clicked
                if(hasFocus)
                    textInputLayout.setHelperText("Format: HH:MM");
                    //When not clicked
                else
                    textInputLayout.setHelperText("*Optional");
            }
        });
    }


    public void submitBtnClicked(View view) {
        Intent intent = new Intent(this, ConfirmationActivity.class);
        startActivity(intent);
    }
}