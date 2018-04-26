package com.grant.rxandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.grant.rxandroid.LoginView;
import com.grant.rxandroid.TotailRxAndroid.ui.login.LoginActivity;

public class MainActivity extends AppCompatActivity {

    private TextView mTextView;

    private TextView mTotailRxandroid;
    private LoginPresenter loginPresenter = new LoginPresenter(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView = (TextView) findViewById(R.id.text_one);

        mTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               loginPresenter.login("13476264163","q654321");
               loginPresenter.listban();
            }
        });
        loginPresenter.onCreate();
        loginPresenter.attachView(loginView);
        mTotailRxandroid = (TextView) findViewById(R.id.totail_rxandroid);
        mTotailRxandroid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }

    private LoginView loginView = new LoginView() {
        @Override
        public void onSuccess(LoginEntity loginEntity) {

            Log.e("ssss","sss"+"成功");
        }

        @Override
        public void onError(String result) {
            Toast.makeText(MainActivity.this,result, Toast.LENGTH_SHORT).show();
        }
    };
}
