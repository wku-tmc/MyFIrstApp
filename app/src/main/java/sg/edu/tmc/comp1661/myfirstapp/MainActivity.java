package sg.edu.tmc.comp1661.myfirstapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //get the UI handles
        Button buttonAdd = (Button) findViewById(R.id.buttonAdd);
        Button buttonView = (Button) findViewById(R.id.buttonView);

        //will go to the Add New Event screen
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentAddNewEvent = new Intent(getApplicationContext(), ActivityAddNewEvent.class);
                startActivity(intentAddNewEvent);
            }
        });


        //will go to the View All Events screen
        buttonView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentViewAllEvents = new Intent(getApplicationContext(), ActivityViewAllEvents.class);
                startActivity(intentViewAllEvents);
            }
        });

    }

}
