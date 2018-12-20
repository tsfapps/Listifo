package com.listifo.listifo.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.listifo.listifo.Model.ModelTrading;
import com.listifo.listifo.R;

import java.util.List;

public class AdapterTrade extends RecyclerView.Adapter<AdapterTrade.MyViewholderThree> {

    private Context context;
    private List<ModelTrading> modelTradingList;

    public AdapterTrade(Context context, List<ModelTrading> modelTradingList) {
        this.context = context;
        this.modelTradingList = modelTradingList;
    }

    @NonNull
    @Override
    public AdapterTrade.MyViewholderThree onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.model_trading, viewGroup, false);

        return new MyViewholderThree(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterTrade.MyViewholderThree myViewholderThree, int i) {
        ModelTrading mt = modelTradingList.get(i);
        myViewholderThree.textView.setText(mt.getName());
        Glide.with(context).load(mt.getImage()).into(myViewholderThree.imageView);

    }

    @Override
    public int getItemCount() {
        return modelTradingList.size();
    }

    public class MyViewholderThree extends RecyclerView.ViewHolder {
        private TextView textView;
        private ImageView imageView;


        public MyViewholderThree(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.iv_rec_tr);
            textView = itemView.findViewById(R.id.tv_rec_tr);
        }
    }

}
