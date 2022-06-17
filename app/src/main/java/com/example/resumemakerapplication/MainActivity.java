package com.example.resumemakerapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity<positionOfSelectedDataFromSpinner> extends AppCompatActivity {
    Button btnsubmit;
    EditText edtfirstname, edtsecoundname, edtemail, edtphone, edtschool, edtcalification, edtdegree, edtscpassing, edtabout,
            edtdegreeyer, edtexpiriance, edtcompny, edtcompneyadd, edtrefrence;
    String first, secound, imail, phone, school, city, calification, degree, spassing, about, dyer, expiriance, compney, caddress, refrence;
    String gender = "";
    String result = "";
    String hobbi = "";
    CheckBox chec, checcc, chejava, cheandroid, cheksports, chekmovies, chektraveling, chekmusic;
    String[] cityArray = {"surat", "ahmedabad", "vadodara", "rajkot", "bhavnagar", "junagadh", "amreli"};
    Spinner cityspin;
    RadioGroup Radiogroup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inform();
    }


    private void inform() {
        edtfirstname = findViewById(R.id.edtfirstname);
        edtsecoundname = findViewById(R.id.edtsecoundname);
        edtemail = findViewById(R.id.edtemail);
        edtphone = findViewById(R.id.edtphone);
        edtschool = findViewById(R.id.edtschool);
        Radiogroup = findViewById(R.id.Radiogroup);
        cityspin = findViewById(R.id.cityspin);
        edtcalification = findViewById(R.id.edtcalification);
        edtdegree = findViewById(R.id.edtdegree);
        edtscpassing = findViewById(R.id.edtscpassing);
        edtabout = findViewById(R.id.edtabout);
        edtdegreeyer = findViewById(R.id.edtdegreeyer);
        edtexpiriance = findViewById(R.id.edtexpiriance);
        edtcompny = findViewById(R.id.edtcompny);
        edtcompneyadd = findViewById(R.id.edtcompneyadd);
        edtrefrence = findViewById(R.id.edtrefrence);


        chec = findViewById(R.id.chec);
        checcc = findViewById(R.id.checcc);
        chejava = findViewById(R.id.chejava);
        cheandroid = findViewById(R.id.cheandroid);
        cheksports = findViewById(R.id.cheksports);
        chekmovies = findViewById(R.id.chekmovies);
        chektraveling = findViewById(R.id.chektraveling);
        chekmusic = findViewById(R.id.chekmusic);

        btnsubmit = findViewById(R.id.btnsubmit);
        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                result = "";
                hobbi = "";
                first = edtfirstname.getText().toString();
                secound = edtsecoundname.getText().toString();
                imail = edtemail.getText().toString();
                phone = edtphone.getText().toString();
                school = edtschool.getText().toString();
                city = cityspin.getSelectedItem().toString();
                calification = edtcalification.getText().toString();
                degree = edtdegree.getText().toString();
                spassing = edtscpassing.getText().toString();
                about = edtabout.getText().toString();
                dyer = edtdegreeyer.getText().toString();
                expiriance = edtexpiriance.getText().toString();
                compney = edtcompny.getText().toString();
                caddress = edtcompneyadd.getText().toString();
                refrence = edtrefrence.getText().toString();


                if (chec.isChecked()) {
                    result += chec.getText().toString();
                }
                if (checcc.isChecked()) {
                    result += checcc.getText().toString();
                }
                if (chejava.isChecked()) {
                    result += chejava.getText().toString();
                }
                if (cheandroid.isChecked()) {
                    result += cheandroid.getText().toString();
                }
                if (cheksports.isChecked()) {
                    hobbi += cheksports.getText().toString();
                }
                if (chekmovies.isChecked()) {
                    hobbi += chekmovies.getText().toString();
                }
                if (chektraveling.isChecked()) {
                    hobbi += chektraveling.getText().toString();
                }
                if (chekmusic.isChecked()) {
                    hobbi += chekmusic.getText().toString();
                }

                if (first.isEmpty()) {
                    Toast.makeText(MainActivity.this, "please enter firstName", Toast.LENGTH_SHORT).show();
                } else if (secound.isEmpty()) {
                    Toast.makeText(MainActivity.this, "please enter secoundName", Toast.LENGTH_SHORT).show();
                } else if (imail.isEmpty()) {
                    Toast.makeText(MainActivity.this, "please enter imail", Toast.LENGTH_SHORT).show();
                } else if (phone.isEmpty()) {
                    Toast.makeText(MainActivity.this, "please enter phoneNumber", Toast.LENGTH_SHORT).show();
                } else if (phone.length() < 10) {
                    Toast.makeText(MainActivity.this, "pass enter valid number of time 10 ", Toast.LENGTH_SHORT).show();
                } else if (phone.length() > 10) {
                    Toast.makeText(MainActivity.this, "pass enter valid number of time 10 ", Toast.LENGTH_SHORT).show();
                } else if (school.isEmpty()) {
                    Toast.makeText(MainActivity.this, "please enter schoolName", Toast.LENGTH_SHORT).show();
                } else if (calification.isEmpty()) {
                    Toast.makeText(MainActivity.this, "please enter eduction", Toast.LENGTH_SHORT).show();
                } else if (spassing.isEmpty()) {
                    Toast.makeText(MainActivity.this, "please enter school passing yer", Toast.LENGTH_SHORT).show();
                } else if (degree.isEmpty()) {
                    Toast.makeText(MainActivity.this, "please enter degree", Toast.LENGTH_SHORT).show();
                } else if (dyer.isEmpty()) {
                    Toast.makeText(MainActivity.this, "please enter degree yer", Toast.LENGTH_SHORT).show();
                } else if (about.isEmpty()) {
                    Toast.makeText(MainActivity.this, "please enter about", Toast.LENGTH_SHORT).show();
                } else if (expiriance.isEmpty()) {
                    Toast.makeText(MainActivity.this, "please enter expiriance", Toast.LENGTH_SHORT).show();
                } else if (compney.isEmpty()) {
                    Toast.makeText(MainActivity.this, "please enter compney", Toast.LENGTH_SHORT).show();
                } else if (caddress.isEmpty()) {
                    Toast.makeText(MainActivity.this, "please enter compney address", Toast.LENGTH_SHORT).show();
                } else if (city.isEmpty()) {
                    Toast.makeText(MainActivity.this, "please enter city", Toast.LENGTH_SHORT).show();
                } else if (gender.isEmpty()) {
                    Toast.makeText(MainActivity.this, "please enter your gender", Toast.LENGTH_SHORT).show();
                } else if (result.isEmpty()) {
                    Toast.makeText(MainActivity.this, "please enter your skill", Toast.LENGTH_SHORT).show();
                } else if (hobbi.isEmpty()) {
                    Toast.makeText(MainActivity.this, "please enter your hobbi", Toast.LENGTH_SHORT).show();
                } else if (refrence.isEmpty()) {
                    Toast.makeText(MainActivity.this, "please enter your refrence", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "succsc", Toast.LENGTH_SHORT).show();


                    Intent i = new Intent(MainActivity.this, DataShowActivity.class);
                    i.putExtra("first", first);
                    i.putExtra("second", secound);
                    i.putExtra("email", imail);
                    i.putExtra("phone", phone);
                    i.putExtra("school", school);
                    i.putExtra("gender", gender);
                    i.putExtra("chek", result);
                    i.putExtra("city", city);
                    i.putExtra("calification", calification);
                    i.putExtra("degree", degree);
                    i.putExtra("spassing", spassing);
                    i.putExtra("about", about);
                    i.putExtra("dyer", dyer);
                    i.putExtra("expiriance", expiriance);
                    i.putExtra("compney", compney);
                    i.putExtra("caddress", caddress);
                    i.putExtra("hobbi", hobbi);
                    i.putExtra("refrence", refrence);


                    startActivity(i);

                }

            }
        });
        Radiogroup = findViewById(R.id.Radiogroup);
        Radiogroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int i) {
                int id = Radiogroup.getCheckedRadioButtonId();
                if (id != -1) {
                    if (id == R.id.rdmale) {
                        Toast.makeText(MainActivity.this, "you are male", Toast.LENGTH_SHORT).show();
                        gender = "male";
                    } else if (id == R.id.rdfemale) {
                        Toast.makeText(MainActivity.this, "you are female", Toast.LENGTH_SHORT).show();
                        gender = "female";
                    } else if (id == R.id.rdother) {
                        Toast.makeText(MainActivity.this, "you are other", Toast.LENGTH_SHORT).show();
                        gender = "other";
                    }
                }
            }
        });

        cityspin = findViewById(R.id.cityspin);
        ArrayAdapter adapter = new ArrayAdapter(MainActivity.this, R.layout.city_spinn, cityArray);
        cityspin.setAdapter(adapter);


    }
}
