package com.rubify.wtfridge.ui.start;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.rubify.wtfridge.R;
import com.rubify.wtfridge.base.BaseFragment;

import butterknife.BindView;


public class IntroFragment extends BaseFragment {

    public static final String BACKGROUND_ID = "background_id";
    public static final String TEXT1_ID = "text1_id";
    public static final String TEXT2_ID = "text2_id";

    private int backgroundId, text1Id, text2Id;

    @BindView(R.id.imageView)
    ImageView imgView;

    @BindView(R.id.textView)
    TextView textView1;

    @BindView(R.id.textView2)
    TextView textView2;

    public IntroFragment() {
        // Required empty public constructor
    }

    public static IntroFragment newInstance(int backgroundId, int text1Id, int text2Id) {
        IntroFragment fragment = new IntroFragment();
        Bundle args = new Bundle();
        args.putInt(BACKGROUND_ID, backgroundId);
        args.putInt(TEXT1_ID, text1Id);
        args.putInt(TEXT2_ID, text2Id);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            Bundle args = getArguments();
            backgroundId = args.getInt(BACKGROUND_ID);
            text1Id = args.getInt(TEXT1_ID);
            text2Id = args.getInt(TEXT2_ID);
        }
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        textView1.setText(text1Id);
        textView2.setText(text2Id);
        imgView.setImageResource(backgroundId);
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_intro;
    }
}
