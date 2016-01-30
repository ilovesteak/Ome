package com.example.michellenguyen.ome;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by michellenguyen on 1/29/16.
 */
public class OMeMaker extends MainActivity{
    // Initializing variables
    EditText inputName;
    EditText inputDebt;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ome_screen);

        inputName = (EditText) findViewById(R.id.name);
        inputDebt = (EditText) findViewById(R.id.debt);
        Button btnSubmit = (Button) findViewById(R.id.button5);

        //Listening to button event
        btnSubmit.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {
                //Starting a new Intent
                Intent nextScreen = new Intent(getApplicationContext(), MainActivity.class);

                //Sending data to another Activity
                nextScreen.putExtra("name", inputName.getText().toString());
                nextScreen.putExtra("debt", inputDebt.getText().toString());

                Log.e("n", inputName.getText()+"."+ inputDebt.getText());

                startActivity(nextScreen);

            }
        });
    }
}