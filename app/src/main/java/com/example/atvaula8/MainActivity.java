package com.example.atvaula8;


import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;


import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_aplication, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.new_item:
                AlertDialog alertDialogMenu = new AlertDialog.Builder(this)
                        .setTitle("Alert")
                        .setMessage("You are selected a new menu!")
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        }).create();
                alertDialogMenu.show();
                break;

            case R.id.open_item:
                AlertDialog alertDialogOpenItem = new AlertDialog.Builder(this)
                        .setTitle("Alert")
                        .setMessage("You are selected open menu!")
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        }).create();
                alertDialogOpenItem.show();
                break;

            case R.id.save_item:
                break;
            case R.id.save_as:
                AlertDialog alertDialogSaveAs = new AlertDialog.Builder(this)
                        .setTitle("Alert")
                        .setMessage("You are selected Save As!")
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        }).create();
                alertDialogSaveAs.show();
                break;

            case R.id.save_copy:
                AlertDialog alertDialogSaveCopy = new AlertDialog.Builder(this)
                        .setTitle("Alert")
                        .setMessage("You are selected save Copy!")
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        }).create();
                alertDialogSaveCopy.show();

                break;
        }
        return super.onOptionsItemSelected(item);
    }
}