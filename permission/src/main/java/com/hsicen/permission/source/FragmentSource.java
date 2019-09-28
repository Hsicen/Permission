package com.hsicen.permission.source;

import android.app.Fragment;
import android.content.Context;
import android.content.Intent;

/**
 * <p>作者：Hsicen  2019/9/28 21:41
 * <p>邮箱：codinghuang@163.com
 * <p>功能：
 * <p>描述：
 */
public class FragmentSource extends Source {

    private Fragment mFragment;

    public FragmentSource(Fragment fragment) {
        this.mFragment = fragment;
    }

    @Override
    public Context getContext() {
        return mFragment.getActivity();
    }

    @Override
    public void startActivity(Intent intent) {
        mFragment.startActivity(intent);
    }
}
