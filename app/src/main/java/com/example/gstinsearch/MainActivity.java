package com.example.gstinsearch;

import androidx.appcompat.app.AppCompatActivity;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.gstinsearch.Data.APIData;

public class MainActivity extends AppCompatActivity {

    private ImageView camScan;
    private EditText etGST;
    private TextView tvHome;
    private ProgressBar progressBar;
    private static String GSTIN;
    private boolean isValid;
    private Model model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar = findViewById(R.id.pbLoading);
        progressBar.setVisibility(View.GONE);
        etGST = findViewById(R.id.etGST);
        tvHome = findViewById(R.id.homeText);
        camScan = findViewById(R.id.cam_scan);

        tvHome.setVisibility(View.VISIBLE);
        camScan.setVisibility(View.VISIBLE);

        etGST.setOnEditorActionListener(new TextView.OnEditorActionListener() {

            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {

                if(actionId == EditorInfo.IME_ACTION_SEARCH) {

                    String rawNum = etGST.getText().toString();
                    isValid = GSTINValidator.isValidGSTNo(rawNum);

                    if(isValid) {

                        GSTIN = rawNum;
                        progressBar.setVisibility(View.VISIBLE);
                        tvHome.setVisibility(View.INVISIBLE);
                        camScan.setVisibility(View.INVISIBLE);
                        retrieveDetails();

                    } else {

                        etGST.setError("Invalid GSTIN Number");

                    }

                    return true;

                }

                return false;

            }
        });

        camScan.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, CamScanner.class));

            }
        });

    }

    private void retrieveDetails() {

        Call<APIData> apiData = CallAPI.getService().getData(GSTIN);
        apiData.enqueue(new Callback<APIData>() {
            @Override
            public void onResponse(Call<APIData> call, Response<APIData> response) {

                if(response.isSuccessful()) {

                    APIData data = response.body();
                    String name = data.getData().getLgnm();
                    String busiName = data.getData().getTradeNam();
                    String location = data.getData().getPradr().getAddr().getLoc();
                    String gstin = data.getData().getGstin();
                    String PAN = gstin.substring(2, 12);
                    String stateCode = gstin.substring(0, 2);
                    String status = data.getData().getSts();
                    String regType = data.getData().getDty();
                    String comStatus = data.getData().getCtj();

                    model = new Model(gstin, name, busiName, location, PAN, stateCode, status, regType, comStatus);

                    progressBar.setVisibility(View.GONE);
                    tvHome.setVisibility(View.VISIBLE);
                    camScan.setVisibility(View.VISIBLE);

                    Intent intent = new Intent(MainActivity.this, UserData.class);
                    intent.putExtra("model", model);
                    startActivity(intent);

                    Toast.makeText(MainActivity.this, "Success", Toast.LENGTH_SHORT).show();

                } else {

                    String message = "An error occured! Try Again";
                    Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();

                }

            }

            @Override
            public void onFailure(Call<APIData> call, Throwable t) {

                String message = t.getLocalizedMessage();
                Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();

            }
        });

    }


}