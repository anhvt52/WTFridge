package com.rubify.wtfridge.ui.main;

import android.content.Context;

import com.rubify.wtfridge.R;
import com.rubify.wtfridge.base.BaseFragment;

import butterknife.OnClick;

public class MyInventoryFragment extends BaseFragment {

    InventoryCalback calback;
    @Override
    public int getLayoutId() {
        return R.layout.fragment_my_inventory;
    }

    @OnClick(R.id.fab)
    public void onFabClicked() {
        calback.onFabClicked();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        calback = (InventoryCalback) context;
    }

    @Override
    public void onDetach() {
        super.onDetach();
        calback = null;
    }

    public interface InventoryCalback {
        void onFabClicked();
    }
}
