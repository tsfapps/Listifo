package com.listifo.listifo.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;

public class AdapterThree extends RecyclerView.Adapter<AdapterThree.MyViewholderThree> {

    private Context context;


    @NonNull
    @Override
    public AdapterThree.MyViewholderThree onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterThree.MyViewholderThree myViewholderThree, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MyViewholderThree extends RecyclerView.ViewHolder{


        public MyViewholderThree(@NonNull View itemView) {
            super(itemView);
        }
    }

}
