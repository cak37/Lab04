package com.example.cak37.lab04c;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

/* Lab 4
 *
 * @author: Carol Schott
 * @version: 1.0 (September 2016)
 */

// Main class
public class Lab04 extends AppCompatActivity {

    // Override onCreate method
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab04);
    }

    // Override onCreateOptionsMenu method
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.optionmenu, menu);
        return true;
    }

    // Override onOptionsItemSelected method
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {

            // Go to other activity if selected
            case R.id.goToAbout:
                startActivity(new Intent(Lab04.this, lab04about.class));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}