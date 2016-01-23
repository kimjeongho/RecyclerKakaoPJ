package com.tacademy.jeongho.recyclerkakaopj;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Tacademy on 2016-01-23.
 */
public class SendViewHolder extends RecyclerView.ViewHolder {
    TextView titleView;
    ImageView iconView;
    SendData data;
    public SendViewHolder(View itemView) {
        super(itemView);
        titleView = (TextView)itemView.findViewById(R.id.text_send);
        iconView = (ImageView)itemView.findViewById(R.id.image_send);
    }

    public void setMyData(SendData data){
        this.data = data;
        titleView.setText(data.message);
        iconView.setImageDrawable(data.imageIcon);
    }
}
