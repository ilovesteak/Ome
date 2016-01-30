package com.example.michellenguyen.ome;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import android.content.Intent;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

import java.util.ArrayList;
import java.util.Random;


public class MainActivity extends AppCompatActivity {
    ListView listView;
    String[] values;
    //ArrayList<Payment> values;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        Button oMe = (Button) findViewById(R.id.button2);
        Button oYou = (Button) findViewById(R.id.button3);
        listView = (ListView)findViewById(R.id.list);

        //Defined Array values to show ListView
        //setValue();
        values = new String[]{"txt1", "txt2", "txt3", "txt4"};


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id){
            //ListView Clicked item index
            int itemPosition = position;

            //ListView Clicked item value
            String itemValue = (String)listView.getItemAtPosition(position);

            //Show Alert
            Toast.makeText(getApplicationContext(),"Position :" + itemPosition + " ListItem : "
                    + itemValue, Toast.LENGTH_LONG).show();
            }
        });

        oMe.setOnClickListener(new View.OnClickListener() {

            /** Called when the user clicks the Make O-Me button **/
            public void onClick(View view) {
                //Do something in response to the button
                Intent intent = new Intent(getApplicationContext(), OMeMaker.class);
                startActivity(intent);
            }
        });

        oYou.setOnClickListener(new View.OnClickListener() {

            /** Called when user clicks Make O-You button **/
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), OYouMaker.class);
                startActivity(intent);
            }
        });

    }

    /*
    public void setValue(){
        values = new String[5];
        for(int i = 0; i < values.length; i++){
            values[i] = "value" + i;
        }
    }
    */

    public void addPayment(Payment newPayment){

    }
/*
    public void submitOMe(View view){

        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);
    }
*/
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
