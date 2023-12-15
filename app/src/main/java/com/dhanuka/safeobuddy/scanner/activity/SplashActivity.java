package com.dhanuka.safeobuddy.scanner.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


import com.codersworld.configs.Tags;
import com.codersworld.configs.urls.vehicletrack.membocool;
import com.dhanuka.safeobuddy.R;
import com.google.gson.Gson;

import java.util.ArrayList;


public class SplashActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        String SB_LOGIN_API = membocool.getLoginApiLink();
        String SB_GET_ALL_V3_LOCKS = membocool.getAllV3LocksLink();
        String SB_UPDATE_LOCK_DATA = membocool.getupdateLockDataLink();
        String SB_UPDATE_LOCK_NAME = membocool.getupdateLockNameLink();
        String SB_DELETE_LOCK  = membocool.getDeleteLockLink();
        Log.e("SB_LOGIN_API",SB_LOGIN_API);
        Log.e("SB_GET_ALL_V3_LOCKS",SB_GET_ALL_V3_LOCKS);
        Log.e("SB_UPDATE_LOCK_DATA",SB_UPDATE_LOCK_DATA);
        Log.e("SB_UPDATE_LOCK_NAME",SB_UPDATE_LOCK_NAME);
        Log.e("SB_DELETE_LOCK",SB_DELETE_LOCK);


     }

    public void onScan(View v) {
      //  mSafeLock.authUser("tester", "123456", "1.0", "Safe SDL demo");
    }


}
