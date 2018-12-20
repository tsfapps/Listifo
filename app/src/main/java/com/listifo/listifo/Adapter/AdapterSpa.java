package com.listifo.listifo.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.ActivityChooserView;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.listifo.listifo.Model.ModelSpa;
import com.listifo.listifo.R;

import java.util.List;

public class AdapterSpa extends RecyclerView.Adapter<AdapterSpa.MyViewholderTwo> {

    private Context context;
    private List<ModelSpa> modelSpaList;


    public AdapterSpa(Context context, List<ModelSpa> modelSpaList) {
        this.context = context;
        this.modelSpaList = modelSpaList;
    }

    @NonNull
    @Override
    public AdapterSpa.MyViewholderTwo onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.model_spa,viewGroup,false);
        return new MyViewholderTwo(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterSpa.MyViewholderTwo myViewholderTwo, int i) {
        ModelSpa spa = modelSpaList.get(i);
        myViewholderTwo.name.setText(spa.getName());
        Glide.with(context).load(spa.getImage()).into(myViewholderTwo.imageView);
    }

    @Override
    public int getItemCount() {
        return modelSpaList.size();
    }

    public class MyViewholderTwo extends RecyclerView.ViewHolder{
        TextView name;
        ImageView imageView;


        public MyViewholderTwo(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.tv_rec_spa);
            imageView = itemView.findViewById(R.id.iv_rec_spa);
        }
    }



}
