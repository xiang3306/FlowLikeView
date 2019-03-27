package com.example.flowlikeview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView mStop;
    private TextView mStart;
    private FlowLikeView mFlow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mStart=findViewById(R.id.start);
        mStop=findViewById(R.id.stop);
        mFlow=findViewById(R.id.flow);
        mStop.setOnClickListener(this);
        mStart.setOnClickListener(this);
        List<Integer> resid = new ArrayList<>();
        resid.add(R.drawable.heart);
        resid.add(R.drawable.music);
        resid.add(R.drawable.start);
        mFlow.initParams(resid);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.stop:
                mFlow.stop();
                break;
            case R.id.start:
                mFlow.start();
                break;
        }
    }
}
