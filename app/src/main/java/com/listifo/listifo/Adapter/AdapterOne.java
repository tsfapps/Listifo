package com.listifo.listifo.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

public class AdapterOne extends RecyclerView.Adapter<AdapterOne.MyViewholder> {


    private Context context;

    @NonNull
    @Override
    public AdapterOne.MyViewholder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterOne.MyViewholder myViewholder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MyViewholder extends RecyclerView.ViewHolder{


        public MyViewholder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
