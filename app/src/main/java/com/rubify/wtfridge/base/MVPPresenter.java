package com.rubify.wtfridge.base;

/**
 * Created by alan on 12/7/16.
 */

public interface MVPPresenter<V extends MVPView> {
    void attachView(V view);
    void detachView();
}
