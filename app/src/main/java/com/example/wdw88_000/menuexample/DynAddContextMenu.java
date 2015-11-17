package com.example.wdw88_000.menuexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ContextMenu;

import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import android.widget.AdapterView;
import android.widget.TextView;
import android.widget.Toast;


public class DynAddContextMenu extends AppCompatActivity {
    MenuItem menuItemFile, menuItemEdit, menuItemView;
    int menuItemFileId = 20, menuItemEditId = 30, menuItemViewId = 40;
    int fileOrder = 200, editOrder = 300, viewOrder = 400;

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dyn_add_context_menu);
        textView = (TextView) findViewById(R.id.textView);
        registerForContextMenu(textView);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo){
        super.onCreateContextMenu(menu, v, menuInfo);
        int groupId = 1;
        getMenuInflater().inflate(R.menu.dyn_add_context_menu, menu);
        menuItemFile = menu.add(groupId, menuItemFileId, fileOrder, R.string.file);
        menuItemEdit = menu.add(groupId, menuItemEditId, editOrder, R.string.edit);
        menuItemView = menu.add(groupId, menuItemViewId, viewOrder, R.string.view);

    }
    public boolean onContextItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        AdapterView.AdapterContextMenuInfo menuInfo = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.file) {
            return true;
        }
        else if (id == R.id.edit) {
            Toast.makeText(DynAddContextMenu.this, "you cliked on Edit", Toast.LENGTH_SHORT).show();
        }
        else if (id == R.id.file) {
            Toast.makeText(DynAddContextMenu.this,"you cliked on File", Toast.LENGTH_SHORT).show();

        }
        else if (id ==R.id.view){
            Toast.makeText(DynAddContextMenu.this,"you cliked on View", Toast.LENGTH_SHORT).show();

        }


        return super.onContextItemSelected(item);
    }
}
