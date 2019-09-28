package com.hsicen.permission.source;

import android.content.Context;
import android.content.Intent;

import androidx.fragment.app.Fragment;

/**
 * <p>作者：Hsicen  2019/9/28 21:42
 * <p>邮箱：codinghuang@163.com
 * <p>功能：
 * <p>描述：
 */
public class SupportFragmentSource extends Source {

    private Fragment mFragment;

    public SupportFragmentSource(Fragment fragment) {
        this.mFragment = fragment;
    }

    @Override
    public Context getContext() {
        return mFragment.getContext();
    }

    @Override
    public void startActivity(Intent intent) {
        mFragment.startActivity(intent);
    }
}
