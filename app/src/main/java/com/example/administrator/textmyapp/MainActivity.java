package com.example.administrator.textmyapp;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.administrator.textmyapp.fragment.FriendFragment;
import com.example.administrator.textmyapp.fragment.MessageFragment;
import com.example.administrator.textmyapp.fragment.SettingFragment;

/**
 * 主页面
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button messge_btn, friend_btn, setting_btn;
    FriendFragment friendFragment;  //好友页
    MessageFragment messageFragment;  //消息页
    SettingFragment settingFragment;  //设置页
    FragmentManager fragmentManaget;  //管理者
    FragmentTransaction fragmentTransaction;  //事物

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    /**
     * 初始化fragment
     */
    private void init() {
        friendFragment = new FriendFragment();
        messageFragment = new MessageFragment();
        settingFragment = new SettingFragment();
        fragmentManaget = getSupportFragmentManager();

        messge_btn = (Button) findViewById(R.id.messge_btn);
        friend_btn = (Button) findViewById(R.id.friend_btn);
        setting_btn = (Button) findViewById(R.id.setting_btn);
        messge_btn.setOnClickListener(this);
        friend_btn.setOnClickListener(this);
        setting_btn.setOnClickListener(this);
    }

    /**
     * 切换fragment
     *
     * @param v
     */
    @Override
    public void onClick(View v) {
        fragmentTransaction = fragmentManaget.beginTransaction();
        switch (v.getId()) {
            case R.id.messge_btn:
                fragmentTransaction.replace(R.id.frame_layout, messageFragment);
                break;
            case R.id.friend_btn:
                fragmentTransaction.replace(R.id.frame_layout, friendFragment);
                break;
            case R.id.setting_btn:
                fragmentTransaction.replace(R.id.frame_layout, settingFragment);
                break;
        }
        fragmentTransaction.commit();
    }
}
