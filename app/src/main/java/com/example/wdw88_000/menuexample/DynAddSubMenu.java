package com.example.wdw88_000.menuexample;


import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.Toast;

public class DynAddSubMenu extends AppCompatActivity {
        MenuItem menuItemFile, menuItemEdit, menuItemView;
        int menuItemFileId = 20, menuItemEditId = 30, menuItemViewId = 40;
        int fileOrder = 200, editOrder = 300, viewOrder = 400;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_dyn_menu_add);
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

        public boolean onCreateOptionsMenu(Menu menu) {
            // Inflate the menu; this adds items to the action bar if it is present.
            int groupId = 1;

            getMenuInflater().inflate(R.menu.dyn_add_sub_menu, menu);

            SubMenu sub = menu.addSubMenu(groupId, menuItemFileId, fileOrder, R.string.file);
            sub.add(groupId, menuItemEditId, editOrder, R.string.edit);
            sub.add(groupId, menuItemViewId, viewOrder, R.string.view);
            return true;
        }

        public boolean onOptionsItemSelected(MenuItem item) {
            // Handle action bar item clicks here. The action bar will
            // automatically handle clicks on the Home/Up button, so long
            // as you specify a parent activity in AndroidManifest.xml.
            int id = item.getItemId();

            //noinspection SimplifiableIfStatement
          if (id == menuItemEditId) {
                Toast.makeText(DynAddSubMenu.this,"you cliked on Edit", Toast.LENGTH_SHORT).show();
            }
            else if (id == menuItemFileId) {
                Toast.makeText(DynAddSubMenu.this,"you cliked on File", Toast.LENGTH_SHORT).show();

            }
            else if (id ==menuItemViewId){
                Toast.makeText(DynAddSubMenu.this,"you cliked on View", Toast.LENGTH_SHORT).show();

            }


            return super.onOptionsItemSelected(item);
        }
    }

