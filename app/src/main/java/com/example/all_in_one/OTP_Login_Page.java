package com.example.all_in_one;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.hbb20.CountryCodePicker;

public class OTP_Login_Page extends AppCompatActivity {
    CountryCodePicker countryCodePicker;
    TextView heading;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp_login_page);
    }
}