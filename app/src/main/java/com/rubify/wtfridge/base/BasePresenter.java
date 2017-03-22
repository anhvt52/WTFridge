package com.rubify.wtfridge.base;

import java.lang.ref.WeakReference;

/**
 * Created by alan on 12/8/16.
 */

public class BasePresenter<V extends MVPView> implements MVPPresenter<V> {
    private WeakReference<V> viewRef;

    @Override
    public void attachView(V view) {
        viewRef = new WeakReference<V>(view);
    }

    @Override
    public void detachView() {
        if (viewRef != null) {
            viewRef.clear();
            viewRef = null;
        }
    }

    public V getView() {
        return viewRef == null ? null : viewRef.get();
    }
}
