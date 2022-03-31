package com.example.raspisaniepar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Holder>{

    Context context;

    List<Para> paras;

    public Adapter(Context context, List<Para> paras) {

        this.context = context;
        this.paras = paras;

    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return new Holder(LayoutInflater.from(context).inflate(R.layout.para_view, parent, false));

    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {

        holder.denView.setText(paras.get(position).getDen());
        holder.firstParaView.setText(paras.get(position).getFirstPara());
        holder.secondParaView.setText(paras.get(position).getSecondPara());
        holder.thirdParaView.setText(paras.get(position).getThirdPara());
        holder.fourthParaView.setText(paras.get(position).getFourthPara());
        holder.fifthParaView.setText(paras.get(position).getFifthPara());

    }

    @Override
    public int getItemCount() {
        return paras.size();
    }
}
