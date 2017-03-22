package com.rubify.wtfridge.ui.signin;


import android.content.Context;
import android.support.v4.app.Fragment;

import com.rubify.wtfridge.R;
import com.rubify.wtfridge.base.BaseFragment;
import com.rubify.wtfridge.ui.start.FragmentCallback;
import com.rubify.wtfridge.ui.start.StartBaseFragment;

import butterknife.OnClick;

/**
 * A simple {@link Fragment} subclass.
 */
public class SignInFragment extends StartBaseFragment implements SignInContract.SignInView{

    public SignInFragment() {
        // Required empty public constructor
    }



    @OnClick(R.id.createAccount)
    public void onCreateAccount() {
        mListener.showSignUpFragment();
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_sign_in;
    }

    @OnClick(R.id.loginBtn)
    public void onLogin() {
        mListener.showMainScreen();
    }
}
