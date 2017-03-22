package com.rubify.wtfridge.ui.start;

import android.content.Intent;
import android.os.Bundle;


import com.rubify.wtfridge.R;
import com.rubify.wtfridge.base.BaseActivity;
import com.rubify.wtfridge.ui.main.MainActivity;
import com.rubify.wtfridge.ui.signin.SignInFragment;
import com.rubify.wtfridge.ui.signup.SignUpFragment;


public class StartActivity extends BaseActivity implements FragmentCallback{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportFragmentManager().beginTransaction().replace(R.id.container, StartFragment.getInstance()).commit();
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_intro;
    }

    @Override
    public void showSignUpFragment() {
        addFragment(R.id.container, new SignUpFragment(), SignUpFragment.class.getName());
    }

    @Override
    public void showSignInFragment() {
        replaceFragment(R.id.container, new SignInFragment());
    }

    @Override
    public void showMainScreen() {
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }
}
