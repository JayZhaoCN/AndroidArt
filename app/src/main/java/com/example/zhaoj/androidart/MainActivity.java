package com.example.zhaoj.androidart;

import android.content.ComponentName;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.test_tv).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                //通过设置Action隐式打开Activity
                //intent.setAction("SHARE_ACTION");

                //使用setComponent的方式打开Activity（显式）
                //intent.setComponent(new ComponentName("com.xiaomi.hm.health", "com.xiaomi.hm.health.device.PairCCBActivity"));

                //如果Intent中没有指定action，则匹配失败
                //intent.setAction("SHARE_ACTION");
                //intent.setData(Uri.parse("asdasdasd://www.tapd.cn/"));
                intent.setAction("SHARE3_ACTION");
                intent.setDataAndType(Uri.parse("content://abc"), "text/plain");

                startActivity(intent);
            }
        });
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        LogUtilKt.i("onSaveInstanceState");
        outState.putString("test_key", "LALALA");

    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        LogUtilKt.i("onRestoreInstanceState: " + savedInstanceState.getString("test_key"));
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        LogUtilKt.i("onConfigurationChanged");
    }
}
