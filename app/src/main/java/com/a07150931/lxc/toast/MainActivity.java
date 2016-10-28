package com.a07150931.lxc.toast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

 // TOAST 直接输出文字 ；
    public void b1(View v){
        Toast.makeText(this,"郁闷",Toast.LENGTH_LONG).show();
    }

// TOAST 输出 view 内容 ;
    public void b2(View v){
    //获取布局,
        LayoutInflater lf = getLayoutInflater();
        View vroot = lf.inflate(R.layout.toastroot,null);
        LinearLayout ll = (LinearLayout) vroot.findViewById(R.id.clayout);
        lf.inflate(R.layout.toastinfo,ll);
        Toast toast = new Toast(this);
        toast.setView(vroot);
        toast.show();
    }
// TOAST 输出自定义 view ;
    public void b3(View v){
        Toast toast = Toast.makeText(this,"我是小黄人-图文显示",Toast.LENGTH_LONG);
        LinearLayout ll = new LinearLayout(this);
        ll.setOrientation(LinearLayout.VERTICAL);
        ImageView mImage = new ImageView(this);
        mImage.setImageResource(R.drawable.yellowman);
        View toastView = toast.getView();
        ll.addView(mImage);
        ll.addView(toastView);
        toast.setView(ll);
        toast.show();
    }

}
