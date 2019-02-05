package com.example.testp2;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

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

    public void toastMe(View view){
        //Toast myToast = Toast.makeText(this, message, duration);
        Toast myToast = Toast.makeText(this, "Impossible to lauch this button for now", Toast.LENGTH_SHORT);
        myToast.show();
    }

    public void countMe(View view){
        //Get the text View
        TextView showCOuntTextView = (TextView) findViewById(R.id.textView);

        //Get the value of the text view
        String countString = showCOuntTextView.getText().toString();

        //Convert the value to a number and increment it
        Integer count = Integer.parseInt(countString);
        count++;

        //Display the value in the text view
        showCOuntTextView.setText(count.toString());
    }

    public void unCountMe(View view){
        //Get the text View
        TextView showCOuntTextView = (TextView) findViewById(R.id.textView);

        //Get the value of the text view
        String countString = showCOuntTextView.getText().toString();

        //Convert the value to a number and increment it
        Integer count = Integer.parseInt(countString);
        count--;

        //Display the value in the text view
        showCOuntTextView.setText(count.toString());
    }

    public void countToZ(View view){
        //Get the text View
        TextView showCOuntTextView = (TextView) findViewById(R.id.textView);

        //Get the value of the text view
        String countString = showCOuntTextView.getText().toString();

        //Convert the value to a number and increment it
        Integer count = Integer.parseInt(countString);
        count = 0;

        //Display the value in the text view
        showCOuntTextView.setText(count.toString());
    }

    public void logIn(View view){
        Intent intent = new Intent(this, SecondActivity.class);

        startActivity(intent);
    }
}
