package com.example.rentalbazaar.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rentalbazaar.Model.ByCycleData;
import com.example.rentalbazaar.R;

public class ByCycleAdapter extends RecyclerView.Adapter<ByCycleAdapter.ViewHolder> {

    ByCycleData[] byCycleData;
    Context context;

    public ByCycleAdapter(ByCycleData[] byCycleData, Context context) {
        this.byCycleData = byCycleData;
        this.context = context;
    }

    @NonNull
    @Override
    public ByCycleAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.bycycle_cardview,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ByCycleAdapter.ViewHolder holder, int position) {
        final ByCycleData byCycleDataList=byCycleData[position];
        holder.byCycleName.setText(byCycleDataList.getByCycleName());
        holder.bycCycleType.setText(byCycleDataList.getByCycleType());
    }

    @Override
    public int getItemCount() {
        return byCycleData.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView byCycleName,bycCycleType;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            byCycleName=itemView.findViewById(R.id.byCycleCard_name);
            bycCycleType=itemView.findViewById(R.id.byCycleCard_type);
        }
    }
}
