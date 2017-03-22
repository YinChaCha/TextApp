package com.example.administrator.textmyapp.act;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.example.administrator.textmyapp.MainActivity;
import com.example.administrator.textmyapp.R;
import com.hyphenate.chat.EMClient;

/**
 * Created by Administrator on 2017/3/22.
 */

public class StartActivity extends Activity {
    private int sleep = 2000;
    private Context context = StartActivity.this;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        start();


    }

    private void start() {
        new Thread(new Runnable() {
            @Override
            public void run() {

                if (EMClient.getInstance().isLoggedInBefore()) {
                    EMClient.getInstance().chatManager().loadAllConversations();
                    EMClient.getInstance().groupManager().loadAllGroups();
                    if (sleep == 2000) {
                        try {
                            Thread.sleep(sleep);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    Intent intent = new Intent(context, MainActivity.class);
                    startActivity(intent);
                } else {
                    try {
                        Thread.sleep(sleep);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    Intent intent1 = new Intent(context, LoginActivity.class);
                    startActivity(intent1);
                }

            }
        }).start();
    }
}
