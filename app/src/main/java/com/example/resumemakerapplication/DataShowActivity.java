package com.example.resumemakerapplication;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.preference.DialogPreference;
import android.preference.Preference;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class DataShowActivity extends AppCompatActivity {

    String first, email, second, phone, school, gender, result, city, calification, degree, spassing, about, dyer, expiriance, compney, caddress, hobii, refrence;
    TextView nametxt, emailtxt, secondtxt, phonetxt, schooltxt, gendertxt, chektxt, spintxt, calificationtxt, degreetxt, schoolpassingtxt,
            abouttxt, dyertxt, expiriancetxt, compneytxt, compneyaddtxt, hobbitxt, refrencetxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_show);
        show();
    }


    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(DataShowActivity.this);
        builder.setTitle("exit");
        builder.setMessage("are you suore go to previous activity?");

        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent i = new Intent(DataShowActivity.this, MainActivity.class);
                startActivity(i);
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(DataShowActivity.this, "you click no button", Toast.LENGTH_SHORT).show();
            }
        });
        AlertDialog d = builder.create();
        d.setCancelable(false);
        d.show();
    }


    private void show() {
        nametxt = findViewById(R.id.nametxt);
        emailtxt = findViewById(R.id.emailtxt);
        secondtxt = findViewById(R.id.secondtxt);
        phonetxt = findViewById(R.id.phonetxt);
        schooltxt = findViewById(R.id.schooltxt);
        gendertxt = findViewById(R.id.gendertxt);
        chektxt = findViewById(R.id.chektxt);
        spintxt = findViewById(R.id.spintxt);
        calificationtxt = findViewById(R.id.calificationtxt);
        degreetxt = findViewById(R.id.degreetxt);
        schoolpassingtxt = findViewById(R.id.schoolpassingtxt);
        abouttxt = findViewById(R.id.abouttxt);
        dyertxt = findViewById(R.id.dyertxt);
        expiriancetxt = findViewById(R.id.expiriancetxt);
        compneytxt = findViewById(R.id.compneytxt);
        compneyaddtxt = findViewById(R.id.compneyaddtxt);
        hobbitxt = findViewById(R.id.hobbitxt);
        refrencetxt = findViewById(R.id.refrencetxt);


        if (getIntent() != null) {
            first = getIntent().getStringExtra("first");
            email = getIntent().getStringExtra("email");
            second = getIntent().getStringExtra("second");
            phone = getIntent().getStringExtra("phone");
            school = getIntent().getStringExtra("school");
            result = getIntent().getStringExtra("chek");
            gender = getIntent().getStringExtra("gender");
            city = getIntent().getStringExtra("city");
            calification = getIntent().getStringExtra("calification");
            degree = getIntent().getStringExtra("degree");
            spassing = getIntent().getStringExtra("spassing");
            about = getIntent().getStringExtra("about");
            dyer = getIntent().getStringExtra("dyer");
            expiriance = getIntent().getStringExtra("expiriance");
            compney = getIntent().getStringExtra("compney");
            caddress = getIntent().getStringExtra("caddress");
            hobii = getIntent().getStringExtra("hobbi");
            refrence = getIntent().getStringExtra("refrence");


            nametxt.setText(first);
            emailtxt.setText(email);
            secondtxt.setText(second);
            phonetxt.setText(phone);
            schooltxt.setText(school);
            chektxt.setText(result);
            gendertxt.setText(gender);
            spintxt.setText(city);
            calificationtxt.setText(calification);
            degreetxt.setText(degree);
            schoolpassingtxt.setText(spassing);
            abouttxt.setText(about);
            dyertxt.setText(dyer);
            expiriancetxt.setText(expiriance);
            compneytxt.setText(compney);
            compneyaddtxt.setText(caddress);
            hobbitxt.setText(hobii);
            refrencetxt.setText(refrence);


        }


    }

}