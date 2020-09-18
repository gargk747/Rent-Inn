package com.example.rentalbazaar.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rentalbazaar.BiCycle.BiCycle_clickedPreview;
import com.example.rentalbazaar.Model.BiCycleData;
import com.example.rentalbazaar.R;

public class BiCycleAdapter extends RecyclerView.Adapter<BiCycleAdapter.ViewHolder> {

    BiCycleData[] biCycleData;
    Context context;

    public BiCycleAdapter(BiCycleData[] biCycleData, Context context) {
        this.biCycleData = biCycleData;
        this.context = context;
    }

    @NonNull
    @Override
    public BiCycleAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.bicycle_cardview,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull BiCycleAdapter.ViewHolder holder, int position) {
        final BiCycleData biCycleDataList = biCycleData[position];
        holder.byCycleName.setText(biCycleDataList.getByCycleName());
        holder.bycCycleType.setText(biCycleDataList.getByCycleType());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(context, BiCycle_clickedPreview.class);
                intent.putExtra("image",biCycleDataList.getByCycleImage());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return biCycleData.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView byCycleName,bycCycleType;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            byCycleName=itemView.findViewById(R.id.biCycleCard_name);
            bycCycleType=itemView.findViewById(R.id.biCycleCard_type);
        }
    }
}
