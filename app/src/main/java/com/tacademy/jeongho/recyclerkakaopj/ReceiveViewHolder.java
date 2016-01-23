package com.tacademy.jeongho.recyclerkakaopj;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Tacademy on 2016-01-23.
 */
public class ReceiveViewHolder extends RecyclerView.ViewHolder {
    TextView titleView;
    ImageView iconView;
    ReceiveData data;        //??

    public ReceiveViewHolder(View itemView) {
        super(itemView);
        titleView = (TextView)itemView.findViewById(R.id.text_receive);
        iconView = (ImageView)itemView.findViewById(R.id.image_receive);
    }

    public void setMyData(ReceiveData data){
        this.data = data;           //??
        titleView.setText(data.message);
        iconView.setImageDrawable(data.imageIcon);
    }
}
