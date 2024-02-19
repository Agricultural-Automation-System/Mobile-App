package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Soil4 extends AppCompatActivity {

    String [] soil4 ={"soil EC","Soil Moisture Contents" ,"Salinity","Soil Temperature"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soil4);

        ListView soil4ListView = findViewById(R.id.soil4List);
        ArrayAdapter arrayNPKList = new ArrayAdapter<>(this,android.R.layout.simple_list_item_activated_1,soil4);
        soil4ListView.setAdapter(arrayNPKList);
        soil4ListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if(position==0){
                    Intent soilEC = new Intent(Soil4.this,SoilEC.class);
                    startActivity(soilEC);
                }
                else if(position==1){
                    Intent soilMoistureContents = new Intent(Soil4.this,SoilMoistureContents.class);
                    startActivity(soilMoistureContents);
                }
                else if(position==2){
                    Intent salinity = new Intent(Soil4.this,Salinity.class);
                    startActivity(salinity);
                }
                else if(position==3){
                    Intent soilTemperature = new Intent(Soil4.this,SoilTemperature.class);
                    startActivity(soilTemperature);
                }

            }
        });
    }
}