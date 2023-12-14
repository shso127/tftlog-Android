package com.example.tftlog;


import static java.sql.DriverManager.println;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class Fragment1 extends Fragment {

    Context context;
    OnTabItemSelectedListener listener;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        this.context = context;

        if(context instanceof OnTabItemSelectedListener) {
            listener = (OnTabItemSelectedListener) context;
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment1, container, false);




        initUI(rootView);

        return rootView;
    }

    private void initUI(ViewGroup rootView) {

        TextView searchInput = rootView.findViewById(R.id.searchInput);
        Button searchButton = rootView.findViewById(R.id.searchButton);
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String searchText = searchInput.getText().toString();
                println("hi");
                if (listener != null) {
                    listener.onTabSelected(2);
                }
            }
        });

    }
}