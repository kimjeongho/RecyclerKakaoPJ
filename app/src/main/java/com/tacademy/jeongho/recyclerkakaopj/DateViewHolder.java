package com.tacademy.jeongho.recyclerkakaopj;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Tacademy on 2016-01-23.
 */
public class DateViewHolder extends RecyclerView.ViewHolder {

    TextView titleView;
    DateData data;
    public DateViewHolder(View itemView) {
        super(itemView);
        titleView = (TextView)itemView.findViewById(R.id.text_date);
    }

    public void setMyData(DateData data){
        this.data = data;
        titleView.setText(data.message);
    }


}
