package com.example.wdw88_000.menuexample;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;
import android.widget.Toast;

public class StaticContextMenu extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_static_context_menu);
        textView = (TextView) findViewById(R.id.textView);
        registerForContextMenu(textView);
    }

    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.context_menu, menu);
    }

    public boolean onContextItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        AdapterView.AdapterContextMenuInfo menuInfo = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
         if (id == R.id.edit) {
            Toast.makeText(StaticContextMenu.this, "you cliked on Edit", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.file) {
            Toast.makeText(StaticContextMenu.this, "you cliked on File", Toast.LENGTH_SHORT).show();

        } else if (id == R.id.view) {
            Toast.makeText(StaticContextMenu.this, "you cliked on View", Toast.LENGTH_SHORT).show();
        }
        return super.onContextItemSelected(item);
    }
}