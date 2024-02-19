package com.example.myapplication;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class NPK extends AppCompatActivity {


    String [] npk ={"Nitrogen","Phosphorus" ,"Potassium"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_npk);

        ListView npkListView = findViewById(R.id.npkList);
        ArrayAdapter arrayNPKList = new ArrayAdapter<>(this,android.R.layout.simple_list_item_activated_1,npk);
        npkListView.setAdapter(arrayNPKList);
        npkListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if(position==0){
                    Intent nitrogen = new Intent(NPK.this,Nitrogen.class);
                    startActivity(nitrogen);
                }
                else if(position==1){
                    Intent phosphorus = new Intent(NPK.this,Phosphorus.class);
                    startActivity(phosphorus);
                }
                else if(position==2){
                    Intent potassium = new Intent(NPK.this,Potassium.class);
                    startActivity(potassium);
                }

            }
        });




    }
}