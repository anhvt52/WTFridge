package com.rubify.wtfridge.ui.signup;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.rubify.wtfridge.R;
import com.rubify.wtfridge.ui.start.StartBaseFragment;

import butterknife.OnClick;

public class SignUpFragment extends StartBaseFragment implements SignUpContract.SignUpView {

    SignUpContract.SignUpPresenter presenter = new SignUpPresenterImp();
    public SignUpFragment() {
        // Required empty public constructor
    }

    @OnClick(R.id.login_here)
    public void onCreateBtnClicked() {
        showLogin();
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_sign_up;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        presenter.attachView(this);

    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    @Override
    public void showLogin() {
        mListener.showSignInFragment();
    }

    @Override
    public void doSignUp() {

    }
}
