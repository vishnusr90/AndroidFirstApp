package com.android.btdt.myappportfolio;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void displayToast(View v){

        if(v.getId() == R.id.spotify){
            Toast.makeText(this, "This button will launch my spotify app!", Toast.LENGTH_SHORT).show();
        }

        if(v.getId() == R.id.scores){
            Toast.makeText(this, "This button will launch my score app!", Toast.LENGTH_SHORT).show();
        }

        if(v.getId() == R.id.library){
            Toast.makeText(this, "This button will launch my library app!", Toast.LENGTH_SHORT).show();
        }

        if(v.getId() == R.id.build){
            Toast.makeText(this, "This button will launch my build it bigger app!", Toast.LENGTH_LONG).show();
        }

        if(v.getId() == R.id.bacon){
            Toast.makeText(this, "This button will launch my bacon app!", Toast.LENGTH_SHORT).show();
        }

        if(v.getId() == R.id.capstone){
            Toast.makeText(this, "This button will launch my capstone app!", Toast.LENGTH_SHORT).show();
        }

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
}
