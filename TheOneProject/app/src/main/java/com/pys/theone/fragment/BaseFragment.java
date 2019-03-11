package com.pys.theone.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;

/**
 * BaseFragment
 */
public class BaseFragment extends Fragment {
    protected View rootView;
    protected Activity activity;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.activity = activity;
    }

    @SuppressWarnings("unchecked")
    protected <T extends View> T findView(int viewId) {
        return (T) rootView.findViewById(viewId);
    }

}
