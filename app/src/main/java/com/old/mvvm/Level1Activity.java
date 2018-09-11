package com.old.mvvm;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.old.mvvm.R;
import com.old.mvvm.databinding.ActivityLevelOneBinding;

public class Level1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_one_);
        UserBean user = new UserBean(66,"小明");
        ActivityLevelOneBinding ac = DataBindingUtil.setContentView(this, R.layout.activity_level_one_);
        ac.setUser(user);
    }
}
