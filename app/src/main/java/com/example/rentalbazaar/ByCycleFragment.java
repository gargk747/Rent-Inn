package com.example.rentalbazaar;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.rentalbazaar.Adapter.ByCycleAdapter;
import com.example.rentalbazaar.Model.ByCycleData;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ByCycleFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.fragment_by_cycle, container, false);

        final RecyclerView recyclerView=v.findViewById(R.id.bycycle_recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        final ByCycleData[] byCycleData= new ByCycleData[]{
                new ByCycleData("Honda","Geared"),
                new ByCycleData("Maruti","Geared"),
                new ByCycleData("Hero","Non-Geared"),
                new ByCycleData("Avon","Non-Geared"),
                new ByCycleData("Classic","Non-Geared"),
                new ByCycleData("Mercedez","Geared"),
                new ByCycleData("Tata","Geared"),
                new ByCycleData("Micro","Non-Geared"),
        };

        Spinner spinner=v.findViewById(R.id.bycycle_spinner);
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(getContext(),R.array.ByCycleSpinner,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                String text=parent.getItemAtPosition(position).toString();
                ByCycleData[] byCycleDataArrayList =null;
                ByCycleAdapter byCycleAdapter = null;

                if(text.equals("All")){

                    byCycleAdapter=new ByCycleAdapter(byCycleData,getContext());

                }else if(text.equals("Geared")){
//                    int i=0;
//                    for (ByCycleData byCycleData1 : byCycleData){
//                        if(byCycleData1.getByCycleType().equals(text)){
//                            byCycleDataArrayList=new ByCycleData[]{byCycleData1};
//                            i++;
//                        }
//                    }
                    byCycleDataArrayList=new ByCycleData[]{
                            new ByCycleData("Honda","Geared"),
                            new ByCycleData("Maruti","Geared"),
                            new ByCycleData("Mercedez","Geared"),
                            new ByCycleData("Tata","Geared")
                    };
                    byCycleAdapter=new ByCycleAdapter(byCycleDataArrayList,getContext());

                }else if(text.equals("Non-Geared")){
                    byCycleDataArrayList=new ByCycleData[]{
                            new ByCycleData("Hero","Non-Geared"),
                            new ByCycleData("Avon","Non-Geared"),
                            new ByCycleData("Classic","Non-Geared"),
                            new ByCycleData("Micro","Non-Geared")
                    };
                    byCycleAdapter=new ByCycleAdapter(byCycleDataArrayList,getContext());
                }

                recyclerView.setAdapter(byCycleAdapter);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    return v;
    }
}