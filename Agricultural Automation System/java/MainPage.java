package com.example.myapplication;



import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainPage extends AppCompatActivity {

    String [] dashlist ={"The Weather","Water Flow Sensor","PH Sensor","NPK Soil Sensor","4 × 1 Soil Sensor"};
    String [] controllist ={"The Irrigation","Fertilizer Dispenser" ,"Pest Control"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        ListView dashboardListView = findViewById(R.id.dashboardList);
        ArrayAdapter arrayDashList = new ArrayAdapter<>(this,android.R.layout.simple_list_item_activated_1,dashlist);
        dashboardListView.setAdapter(arrayDashList);
        dashboardListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if(position==0){
                    Intent weather = new Intent(MainPage.this,Weather.class);
                    startActivity(weather);
                }
                else if(position==1){
                    Intent waterFlow = new Intent(MainPage.this,WaterFlow.class);
                    startActivity(waterFlow);
                }
                else if(position==2){
                    Intent ph = new Intent(MainPage.this,PH.class);
                    startActivity(ph);
                }
                else if(position==3){
                    Intent npk = new Intent(MainPage.this,NPK.class);
                    startActivity(npk);
                }
                else if(position==4){
                    Intent soil4 = new Intent(MainPage.this,Soil4.class);
                    startActivity(soil4);
                }
            }
        });

        ListView controlListView = findViewById(R.id.controlList);
        ArrayAdapter arrayControlList = new ArrayAdapter<>(this,android.R.layout.simple_list_item_activated_1,controllist);
        controlListView.setAdapter(arrayControlList);
        controlListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if(position==0){
                    Intent irrigation = new Intent(MainPage.this,Irrigation.class);
                    startActivity(irrigation);
                }
                else if(position==1){
                    Intent fertilizer = new Intent(MainPage.this,Fertilizer.class);
                    startActivity(fertilizer);
                }
                else if(position==2){
                    Intent pestControl = new Intent(MainPage.this,PestControl.class);
                    startActivity(pestControl);
                }
            }
        });




    }
}