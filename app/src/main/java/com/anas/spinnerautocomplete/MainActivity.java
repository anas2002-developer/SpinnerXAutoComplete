package com.anas.spinnerautocomplete;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    ArrayList<String> arrUid=new ArrayList<>();

    AutoCompleteTextView autocomplete;
    ArrayList<String> arrSection=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner=findViewById(R.id.spinner);

        arrUid.add("21BCS8965");
        arrUid.add("21BCS8966");
        arrUid.add("21BCS8967");
        arrUid.add("21BCS8968");
        arrUid.add("21BCS8969");
        arrUid.add("21BCS8980");

        ArrayAdapter<String> arrAdapterUid=new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,arrUid);
        spinner.setAdapter(arrAdapterUid);

        //AutoCompeleteTextView

        autocomplete=findViewById(R.id.autoComplete);

        arrSection.add("720");
        arrSection.add("702");
        arrSection.add("740");
        arrSection.add("718");
        arrSection.add("704");
        arrSection.add("710");
        arrSection.add("808");
        arrSection.add("820");
        arrSection.add("801");
        arrSection.add("810");

        ArrayAdapter<String> arrAdapterSection=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,arrSection);
        autocomplete.setAdapter(arrAdapterSection);
        autocomplete.setThreshold(1);
    }
}