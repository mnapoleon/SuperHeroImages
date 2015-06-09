package com.evan.napoleon.superheroimages;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import com.evan.napoleon.superheroimages.utils.SuperheroUrlUtils;
import com.loopj.android.image.SmartImageView;

import java.io.IOException;
import java.io.InputStream;


public class SuperheroImageActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_superhero_image);

        Intent intent = getIntent();
        String message = intent.getStringExtra(DCLetterActivity.EXTRA_MESSAGE);

        InputStream inputstream;

        ImageView imageView = (ImageView)this.findViewById(R.id.superhero_image_placeholder);
        //SmartImageView imageView = (SmartImageView)this.findViewById(R.id.superhero_image_placeholder);
        //imageView.setImageUrl(SuperheroUrlUtils.getUrlForLetter(message));

        if (message.equals("A")) {
            try {
                inputstream = getApplicationContext().getAssets().open("dc/aquaman.jpg");
                Drawable drawable = Drawable.createFromStream(inputstream, null);
                imageView.setImageDrawable(drawable);
            }
            catch (Exception e) {

            }
        }
        else if (message.equals("B")) {
            try {
                inputstream = getApplicationContext().getAssets().open("dc/batman.jpg");
                Drawable drawable = Drawable.createFromStream(inputstream, null);
                imageView.setImageDrawable(drawable);
            }
            catch (Exception e) {

            }
        }
        else if (message.equals("F")) {
            try {
                inputstream = getApplicationContext().getAssets().open("dc/flash.jpg");
                Drawable drawable = Drawable.createFromStream(inputstream, null);
                imageView.setImageDrawable(drawable);
            }
            catch (Exception e) {

            }
        }
        else if (message.equals("G")) {
            try {
                inputstream = getApplicationContext().getAssets().open("dc/green_lantern.jpg");
                Drawable drawable = Drawable.createFromStream(inputstream, null);
                imageView.setImageDrawable(drawable);
            }
            catch (Exception e) {

            }
        }
        else if (message.equals("M")) {
            try {
                inputstream = getApplicationContext().getAssets().open("dc/martian_manhunter.jpg");
                Drawable drawable = Drawable.createFromStream(inputstream, null);
                imageView.setImageDrawable(drawable);
            }
            catch (Exception e) {

            }
        }
        else if (message.equals("S")) {
            try {
                inputstream = getApplicationContext().getAssets().open("dc/superman.jpg");
                Drawable drawable = Drawable.createFromStream(inputstream, null);
                imageView.setImageDrawable(drawable);
            }
            catch (Exception e) {

            }
        }
        else {
            try {
                inputstream = getApplicationContext().getAssets().open("dc/joker1.jpg");
                Drawable drawable = Drawable.createFromStream(inputstream, null);
                imageView.setImageDrawable(drawable);
            }
            catch (Exception e) {

            }
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
