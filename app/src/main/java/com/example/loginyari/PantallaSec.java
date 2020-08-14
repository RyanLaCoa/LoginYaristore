package com.example.loginyari;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class PantallaSec extends AppCompatActivity {

    ListView ListView;
    @Override
    protected void Oncreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pantallasec);
        ListView listView = (ListView) findViewById(R.id.listview);
        final ArrayList<String> arrayList—new ArrayList<>();
        arrayList.add("Camisas");
        arrayList.add("Vestidos");
        arrayList.add("Pantalones");
        arrayList.add("Medias");
        arrayList.add("Boxers");
        arrayList.add("Blusas");
        ArrayAdapter arrayAdapter—new ArrayAdapter( context: this,android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick (AdapterView<?> adapterView, View view, int 1, long 1) {
                Toast.makeText( PantallaSec.this, text:"Productos":"+i+"+arrayList.get(i).toString().Toast.LENGTH_SHORT).show();

            }
        }


    }
}
