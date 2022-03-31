package com.example.raspisaniepar;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Holder extends RecyclerView.ViewHolder {
    TextView denView, firstParaView, secondParaView, thirdParaView, fourthParaView, fifthParaView;

    public Holder(@NonNull View paraView) {
        super(paraView);
        denView = paraView.findViewById(R.id.den);
        firstParaView = paraView.findViewById(R.id.firstPara);
        secondParaView = paraView.findViewById(R.id.secondPara);
        thirdParaView = paraView.findViewById(R.id.thirdPara);
        fourthParaView = paraView.findViewById(R.id.fourthPara);
        fifthParaView = paraView.findViewById(R.id.fifthPara);
    }
}
