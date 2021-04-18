package com.example.gstinsearch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

public class UserData extends AppCompatActivity {

    private Model model;
    private EditText etGST;
    private TextView tvTradeName, tvLegalName, tvLocation, tvStatus, tvRegType, tvCompliance;
    private ProgressBar progressBar;
    private String gstin, tradeName, legalName, location, status, regType, compliance;
    private boolean isValid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_data);

        etGST = findViewById(R.id.etGST1);
        tvCompliance = findViewById(R.id.compliance);
        tvTradeName = findViewById(R.id.tradeName);
        tvLegalName = findViewById(R.id.legalName);
        tvLocation = findViewById(R.id.location);
        tvStatus = findViewById(R.id.status);
        tvRegType = findViewById(R.id.regType);

        model = (Model) getIntent().getSerializableExtra("model");
        gstin = model.getGstin();
        tradeName = model.getBusinessName();
        legalName = model.getLegalName();
        location = model.getLocation();
        status = model.getStatus();
        regType = model.getRegType();
        compliance = model.getComplianceStatus();

        etGST.setText(gstin);
        tvTradeName.setText("Trade Name: \n" + tradeName);
        tvLegalName.setText("Legal Name: \n" + legalName);
        tvLocation.setText("Location: \n" + location);
        tvStatus.setText("Status: \n" + status);
        tvRegType.setText("Registration Type: \n" + regType);
        tvCompliance.setText("Compliance Status: \n" + compliance);

        etGST.setOnEditorActionListener(new TextView.OnEditorActionListener() {

            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {

                if(actionId == EditorInfo.IME_ACTION_SEARCH) {

                    finish();

                }
                return false;

            }
        });

    }
}