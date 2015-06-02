package com.example.sergiu.orders;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    public static String category;

    public void onClickHandler(View v)
    {
        switch (v.getId())
        {
            case R.id.pizzaBtn:
                category="pizza";
                break;
            case R.id.roastBtn:
                category="roast";
                break;
            case R.id.appetizerBtn:
                category="appetizer";
                break;
            case R.id.soupBtn:
                category="soup";
                break;
            case R.id.alcoholicBtn:
                category="alcoholic";
                break;
            case R.id.nalcoholicBtn:
                category="nalcoholic";
                break;
        }
        Intent gameIntent=new Intent(v.getContext(),MenuActivity.class);
        v.getContext().startActivity(gameIntent);

    }

    public static String getCategory()
    {
        return category;
    }
}
