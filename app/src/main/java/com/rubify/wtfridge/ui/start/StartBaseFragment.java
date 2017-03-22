package com.rubify.wtfridge.ui.start;

import android.content.Context;

import com.rubify.wtfridge.base.BaseFragment;

/**
 * Created by alan on 2/17/17.
 */

public abstract class StartBaseFragment extends BaseFragment {
    protected FragmentCallback mListener;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof FragmentCallback) {
            mListener = (FragmentCallback) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

}
