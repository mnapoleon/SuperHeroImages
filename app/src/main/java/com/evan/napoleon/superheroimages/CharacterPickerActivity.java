package com.evan.napoleon.superheroimages;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;


public class CharacterPickerActivity extends ActionBarActivity {

    public final static String SET_MESSAGE = "com.evan.napoleon.superheroimages.SETMESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_picker);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_character_picker, menu);
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

    public void dcSelect(View view) {
        ImageButton button = (ImageButton) view;

        String buttonValue;
        if (button.getId() == R.id.dc_button) {
            buttonValue = "dc";
        }
        else if (button.getId() == R.id.marvel_button) {
            buttonValue = "marvel";
        }
        else {
            buttonValue = "";
        }

        Intent intent = new Intent(this, DCLetterActivity.class);
        intent.putExtra(SET_MESSAGE, buttonValue);

        startActivity(intent);
    }
}
