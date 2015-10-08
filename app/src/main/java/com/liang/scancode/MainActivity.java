package com.liang.scancode;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import butterknife.ButterKnife;
import butterknife.OnClick;
import com.liang.scancode.utils.Constant;


public class MainActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        int mode = getIntent().getIntExtra(Constant.REQUEST_SCAN_MODE, Constant.REQUEST_SCAN_MODE_ALL_MODE);


    }

    /**
     * 按钮监听事件，这里我使用Butterknife，不喜欢的也可以直接写监听
     * @param view
     */
    @OnClick({R.id.create_code,R.id.scan_2code,R.id.scan_bar_code,R.id.scan_code})
    public void clickListener(View view){
        Intent intent;
        switch (view.getId()){
            case  R.id.create_code: //生成码
                intent=new Intent(this,CreateCodeActivity.class);
                startActivity(intent);
                break;
            case  R.id.scan_2code: //扫描二维码
                intent=new Intent(this,CommonScanActivity.class);
                intent.putExtra(Constant.REQUEST_SCAN_MODE,Constant.REQUEST_SCAN_MODE_QRCODE_MODE);
                startActivity(intent);
                break;
            case  R.id.scan_bar_code://扫描条形码
                intent=new Intent(this,CommonScanActivity.class);
                intent.putExtra(Constant.REQUEST_SCAN_MODE,Constant.REQUEST_SCAN_MODE_BARCODE_MODE);
                startActivity(intent);
                break;
            case  R.id.scan_code://扫描条形码或者二维码
                intent=new Intent(this,CommonScanActivity.class);
                intent.putExtra(Constant.REQUEST_SCAN_MODE,Constant.REQUEST_SCAN_MODE_ALL_MODE);
                startActivity(intent);
                break;
        }
    }
}
