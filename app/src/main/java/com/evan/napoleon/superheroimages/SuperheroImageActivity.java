package com.evan.napoleon.superheroimages;

import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;


public class SuperheroImageActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_superhero_image);

        Intent intent = getIntent();
        String message = intent.getStringExtra(DCLetterActivity.EXTRA_MESSAGE);

        ImageView imageView = (ImageView)this.findViewById(R.id.superhero_image_placeholder);
        

        if (message.equals("A")) {
            imageView.setImageResource(R.drawable.aquaman);
        }
        else if (message.equals("B")) {
            imageView.setImageResource(R.drawable.batman);
        }
        else if (message.equals("F")) {
            imageView.setImageResource(R.drawable.flash);
        }
        else if (message.equals("G")) {
            imageView.setImageResource(R.drawable.green_lantern);
        }
        else if (message.equals("M")) {
            imageView.setImageResource(R.drawable.martian_manhunter);
        }
        else if (message.equals("S")) {
            imageView.setImageResource(R.drawable.superman);
        }
        else {
            imageView.setImageResource(R.drawable.joker1);
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_superhero_image, menu);
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
