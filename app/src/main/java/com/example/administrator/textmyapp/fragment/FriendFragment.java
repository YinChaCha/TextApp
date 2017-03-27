package com.example.administrator.textmyapp.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.administrator.textmyapp.R;
import com.hyphenate.chat.EMClient;
import com.hyphenate.exceptions.HyphenateException;

import java.util.List;

/**
 * 好友页
 * Created by HP on 2017/3/23.
 */
public class FriendFragment extends Fragment implements View.OnClickListener {
    private View view;
    EditText editText;
    Button button;

    public FriendFragment() throws HyphenateException {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        view = inflater.inflate(R.layout.fragment_friend, container, false);
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        initview();

    }

    private void initview() {
        editText = (EditText) view.findViewById(R.id.activity_edtext_friend);
        button = (Button) view.findViewById(R.id.activity_button_friend);
        button.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.activity_button_friend:

                break;
        }
    }
}