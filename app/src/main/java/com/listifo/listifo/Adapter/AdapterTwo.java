package com.listifo.listifo.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class AdapterTwo extends RecyclerView.Adapter<AdapterTwo.MyViewholderTwo> {

    private Context context;

    @NonNull
    @Override
    public AdapterTwo.MyViewholderTwo onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterTwo.MyViewholderTwo myViewholderTwo, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MyViewholderTwo extends RecyclerView.ViewHolder{

        public MyViewholderTwo(@NonNull View itemView) {
            super(itemView);
        }
    }



}
