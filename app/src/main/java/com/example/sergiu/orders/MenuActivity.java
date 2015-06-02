package com.example.sergiu.orders;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.Connection;
import java.sql.DriverManager;


public class MenuActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        try {
            Class.forName("org.postgresql.Driver");
            String url="jdbc:postgresql://10.0.2.2:5432/eBank";//+"?sslfactory=org.postgresql.ssl.NonValidatingFactory"+"&ssl=true";
            Connection conn = DriverManager.getConnection(url,"postgres", "asdxsw123");
            Toast.makeText(this,"connection made",Toast.LENGTH_LONG).show();
            //conn.close();
        }
        catch (Exception ex) {
            Toast.makeText(this,ex+"",Toast.LENGTH_LONG).show();
        }
        finally {

        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_menu, menu);
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
