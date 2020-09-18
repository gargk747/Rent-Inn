package com.example.rentalbazaar.BiCycle;

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

import com.example.rentalbazaar.Adapter.BiCycleAdapter;
import com.example.rentalbazaar.Model.BiCycleData;
import com.example.rentalbazaar.R;

public class BiCycleFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.fragment_bi_cycle, container, false);

        final RecyclerView recyclerView=v.findViewById(R.id.bicycle_recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        final BiCycleData[] biCycleData = new BiCycleData[]{
                new BiCycleData("Honda","Geared",R.drawable.demo_cycle),
                new BiCycleData("Maruti","Geared",R.drawable.demo_cycle),
                new BiCycleData("Hero","Non-Geared",R.drawable.demo_cycle),
                new BiCycleData("Avon","Non-Geared",R.drawable.demo_cycle),
                new BiCycleData("Classic","Non-Geared",R.drawable.demo_cycle),
                new BiCycleData("Mercedez","Geared",R.drawable.demo_cycle),
                new BiCycleData("Tata","Geared",R.drawable.demo_cycle),
                new BiCycleData("Micro","Non-Geared",R.drawable.demo_cycle),
        };

        Spinner spinner=v.findViewById(R.id.bicycle_spinner);
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(getContext(),R.array.BiCycleSpinner,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                String text=parent.getItemAtPosition(position).toString();
                BiCycleData[] biCycleDataArrayList =null;
                BiCycleAdapter biCycleAdapter = null;

                if(text.equals("All")){

                    biCycleAdapter =new BiCycleAdapter(biCycleData,getContext());

                }else if(text.equals("Geared")){
//                    int i=0;
//                    for (ByCycleData byCycleData1 : byCycleData){
//                        if(byCycleData1.getByCycleType().equals(text)){
//                            byCycleDataArrayList=new ByCycleData[]{byCycleData1};
//                            i++;
//                        }
//                    }
                    biCycleDataArrayList =new BiCycleData[]{
                            new BiCycleData("Honda","Geared",R.drawable.demo_cycle),
                            new BiCycleData("Maruti","Geared",R.drawable.demo_cycle),
                            new BiCycleData("Mercedez","Geared",R.drawable.demo_cycle),
                            new BiCycleData("Tata","Geared",R.drawable.demo_cycle)
                    };
                    biCycleAdapter =new BiCycleAdapter(biCycleDataArrayList,getContext());

                }else if(text.equals("Non-Geared")){
                    biCycleDataArrayList =new BiCycleData[]{
                            new BiCycleData("Hero","Non-Geared",R.drawable.demo_cycle),
                            new BiCycleData("Avon","Non-Geared",R.drawable.demo_cycle),
                            new BiCycleData("Classic","Non-Geared",R.drawable.demo_cycle),
                            new BiCycleData("Micro","Non-Geared",R.drawable.demo_cycle)
                    };
                    biCycleAdapter =new BiCycleAdapter(biCycleDataArrayList,getContext());
                }

                recyclerView.setAdapter(biCycleAdapter);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    return v;
    }
}