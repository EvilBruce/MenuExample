package com.example.wdw88_000.menuexample;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class StaticSubMenu extends AppCompatActivity {

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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.sub_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.file) {
            Toast.makeText(StaticSubMenu.this,"you cliked on File", Toast.LENGTH_SHORT).show();
        }
        else if (id == R.id.open) {
            Toast.makeText(StaticSubMenu.this,"you cliked on Open", Toast.LENGTH_SHORT).show();
        }
        else if (id == R.id.view) {
            Toast.makeText(StaticSubMenu.this,"you cliked on View", Toast.LENGTH_SHORT).show();

        }
        else if (id == R.id.edit) {
            Toast.makeText(StaticSubMenu.this,"you cliked on Edit", Toast.LENGTH_SHORT).show();

        }
        else if (id == R.id.save) {
            Toast.makeText(StaticSubMenu.this, "you cliked on Save", Toast.LENGTH_SHORT).show();

        }


        return super.onOptionsItemSelected(item);
    }
}
