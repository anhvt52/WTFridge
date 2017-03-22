package com.rubify.wtfridge.ui.start;

import com.rubify.wtfridge.base.BasePresenter;

/**
 * Created by alan on 12/12/16.
 */

public class StartPresenterImp extends BasePresenter<StartContract.StartView> implements StartContract.StartPresenter {

    @Override
    public void onStartButtonClicked() {
        getView().start();
    }
}
