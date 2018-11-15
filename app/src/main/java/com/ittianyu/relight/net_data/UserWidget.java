package com.ittianyu.relight.net_data;

import android.arch.lifecycle.Lifecycle;
import android.content.Context;
import android.view.View;
import android.widget.TextView;

import com.ittianyu.relight.R;
import com.ittianyu.relight.common.bean.UserBean;
import com.ittianyu.relight.widget.native_.AndroidWidget;

public class UserWidget extends AndroidWidget<View> {
    private TextView tvId;
    private TextView tvName;
    private UserBean user;

    public UserWidget(Context context, Lifecycle lifecycle) {
        super(context, lifecycle);
    }

    @Override
    public View createView(Context context) {
        return View.inflate(context, R.layout.activity_user, null);
    }

    @Override
    public void initView(View view) {
        tvId = view.findViewById(R.id.tv_id);
        tvName = view.findViewById(R.id.tv_name);
    }

    @Override
    public void updateView(View view) {
        if (user == null) {
            return;
        }
        tvId.setText(String.valueOf(user.getId()));
        tvName.setText(user.getName());
    }

    public void setOnClickListener(View.OnClickListener listener) {
        view.setOnClickListener(listener);
    }

    public void setUser(UserBean user) {
        this.user = user;
    }

}