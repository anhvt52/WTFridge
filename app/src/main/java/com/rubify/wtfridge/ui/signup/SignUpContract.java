package com.rubify.wtfridge.ui.signup;

import com.rubify.wtfridge.base.MVPPresenter;
import com.rubify.wtfridge.base.MVPView;

/**
 * Created by alan on 12/14/16.
 */

public interface SignUpContract {

    interface SignUpView extends MVPView {
        void showLogin();
        void doSignUp();

    }

    interface SignUpPresenter extends MVPPresenter<SignUpView> {
        void doSignUp();
    }

}
