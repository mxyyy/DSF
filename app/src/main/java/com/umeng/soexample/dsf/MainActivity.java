package com.umeng.soexample.dsf;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.abner.ming.MingUtils;
import com.abner.ming.ResultListener;
import com.abner.ming.UmengBean;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mlogin;
    private Button mshare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mlogin = findViewById(R.id.login);
        mshare = findViewById(R.id.share);

       mlogin.setOnClickListener(this);
       mshare.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.login:
                MingUtils.login(MainActivity.this, 0, new ResultListener() {
                    @Override
                    public void success(UmengBean umengBean) {

                    }
                });

                break;
            case R.id.share:
                MingUtils.shared(MainActivity.this,0,"","","","");
                break;


        }
    }
}
