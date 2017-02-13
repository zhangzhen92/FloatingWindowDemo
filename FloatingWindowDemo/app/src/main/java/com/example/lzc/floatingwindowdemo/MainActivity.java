package com.example.lzc.floatingwindowdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.lzc.floatingwindowdemo.service.FloatingService;

/**
 * 类描述：测试类
 * 创建人：zz
 * 创建时间：2017/2/13 11:29
 */
public class MainActivity extends Activity {

    private Button buttonStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    /**
     * 初始化UI
     */
    private void initView() {
        buttonStart = ((Button) findViewById(R.id.button_start));
        buttonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, FloatingService.class);
                startService(intent);
                finish();
            }
        });
    }
}
