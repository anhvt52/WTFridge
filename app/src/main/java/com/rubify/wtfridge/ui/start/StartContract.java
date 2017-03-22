package com.rubify.wtfridge.ui.start;

import com.rubify.wtfridge.base.MVPPresenter;
import com.rubify.wtfridge.base.MVPView;

/**
 * Created by alan on 12/12/16.
 */

public interface StartContract {
    interface StartView  extends MVPView {
        void start();
    }

    interface StartPresenter extends MVPPresenter<StartView> {
        void onStartButtonClicked();
    }

}
