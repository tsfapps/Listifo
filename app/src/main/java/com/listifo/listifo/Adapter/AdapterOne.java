package com.listifo.listifo.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.listifo.listifo.Model.IconModel;
import com.listifo.listifo.R;

import java.util.List;

public class AdapterOne extends RecyclerView.Adapter<AdapterOne.MyViewholder> {


    private Context context;
    private List<IconModel> IconModels;

    public AdapterOne(Context context, List<IconModel> IconModels) {
        this.context = context;
        this.IconModels = IconModels;
    }

    @NonNull
    @Override
    public AdapterOne.MyViewholder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.model_icon, viewGroup, false);
        return new MyViewholder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull AdapterOne.MyViewholder myViewholder, int i) {

        IconModel im = IconModels.get(i);

        myViewholder.name.setText(im.getName());


    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MyViewholder extends RecyclerView.ViewHolder{
        private TextView name;
        private ImageView image;


        public MyViewholder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.tv_rec_icon);
            image = itemView.findViewById(R.id.iv_rec_icon);
        }
    }
}
