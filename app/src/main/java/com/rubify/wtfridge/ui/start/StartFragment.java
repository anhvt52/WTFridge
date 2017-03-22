package com.rubify.wtfridge.ui.start;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.Button;

import com.rubify.wtfridge.R;
import com.rubify.wtfridge.base.BaseFragment;

import butterknife.BindView;
import butterknife.OnClick;


public class StartFragment extends StartBaseFragment implements StartContract.StartView{


    public StartFragment() {
        // Required empty public constructor
    }

    public static StartFragment getInstance() {
        return new StartFragment();
    }
    @Override
    public int getLayoutId() {
        return R.layout.fragment_start;
    }

    @BindView(R.id.viewPager)
    ViewPager viewPager;

    @BindView(R.id.loginFbButton)
    Button startButton;

    @BindView(R.id.tabLayout)
    TabLayout tabLayout;

    StartContract.StartPresenter presenter;

    @OnClick(R.id.login_txt)
    public void onClickLogin() {
        mListener.showSignInFragment();
    }

    @OnClick(R.id.signup_txt)
    public void onClickSignUp() {
        mListener.showSignUpFragment();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        IntroFragmentAdapter adapter = new IntroFragmentAdapter(getChildFragmentManager());
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager, true);
        presenter = new StartPresenterImp();
        presenter.attachView(this);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        presenter.detachView();
    }


    @Override
    public void start() {

    }

    public static class IntroFragmentAdapter extends FragmentPagerAdapter {

        public IntroFragmentAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return IntroFragment.newInstance(R.drawable.splash_bg, R.string.intro_text_title1, R.string.intro_text1);
                case 1:
                    return IntroFragment.newInstance(R.drawable.background_2, R.string.intro_text_title1, R.string.intro_text1);
                default:
                    return IntroFragment.newInstance(R.drawable.background_3, R.string.intro_text_title1, R.string.intro_text1);
            }

        }

        @Override
        public int getCount() {
            return 3;
        }
    }
}
