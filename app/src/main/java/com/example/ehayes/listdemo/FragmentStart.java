package com.example.ehayes.listdemo;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by ehayes on 1/15/2015.
 */
public class FragmentStart extends Fragment {

    Button button;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_start,container,false);

        button = (Button) v.findViewById(R.id.buttonGo);

        return v;
    }
}
