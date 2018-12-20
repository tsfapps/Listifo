package com.listifo.listifo.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.ActivityChooserView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.listifo.listifo.Model.ModelRepair;
import com.listifo.listifo.R;

import java.util.List;

public class AdapterRepair extends RecyclerView.Adapter<AdapterRepair.MyViewHolder> {

    private Context context;
    private List<ModelRepair> modelRepairList;


    public AdapterRepair(Context context, List<ModelRepair> modelRepairList) {
        this.context = context;
        this.modelRepairList = modelRepairList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.model_repair,viewGroup,false);
        return new MyViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {

        ModelRepair mp = modelRepairList.get(i);
        myViewHolder.textView.setText(mp.getName());
        Glide.with(context).load(mp.getImage()).into(myViewHolder.imageView);
    }

    @Override
    public int getItemCount() {
        return modelRepairList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        private ImageView imageView;
        private TextView textView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            textView = itemView.findViewById(R.id.tv_rec_rep);
            imageView = itemView.findViewById(R.id.iv_rec_rep);

        }
    }
}
