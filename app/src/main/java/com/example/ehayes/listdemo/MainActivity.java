package com.example.ehayes.listdemo;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;


public class MainActivity extends Activity implements FragmentText.Communicator {

    FragmentManager manager;
    FragmentTransaction transaction;
    FragmentDescription description;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       manager = getFragmentManager();
        transaction = manager.beginTransaction();
        FragmentText fragmentText = new FragmentText();
        transaction.add(R.id.fragmentContainer,fragmentText).commit();
    }

    @Override
    public void getData(int i) {
        manager = getFragmentManager();
        description = new FragmentDescription();


        description.changeData(i);
    }
}

