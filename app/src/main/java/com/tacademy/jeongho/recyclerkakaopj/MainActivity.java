package com.tacademy.jeongho.recyclerkakaopj;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    EditText inputView;
    ChattingAdapter mAdapter;
    RadioGroup categoryView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputView = (EditText)findViewById(R.id.editText);
        categoryView = (RadioGroup)findViewById(R.id.radio_group);
        recyclerView = (RecyclerView)findViewById(R.id.view_data);
        layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        mAdapter = new ChattingAdapter();
        recyclerView.setAdapter(mAdapter);

        Button btn = (Button)findViewById(R.id.btn_push);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = categoryView.getCheckedRadioButtonId();
                switch (id){
                    case R.id.radio_receive:
                        ReceiveData rd = new ReceiveData();
                        rd.imageIcon = getResources().getDrawable(R.drawable.beach);
                        rd.message = inputView.getText().toString();
                        mAdapter.add(rd);
                        break;

                    case R.id.radio_send:
                        SendData sd = new SendData();
                        sd.imageIcon = getResources().getDrawable(R.drawable.sample_7);
                        sd.message = inputView.getText().toString();
                        mAdapter.add(sd);
                        break;

                    case R.id.radio_date:
                        DateData dd = new DateData();
                        dd.message = new Date().toString();
                        mAdapter.add(dd);
                        break;

                }

                inputView.setText("");
                recyclerView.smoothScrollToPosition(mAdapter.getItemCount());
            }
        });
    }
}
