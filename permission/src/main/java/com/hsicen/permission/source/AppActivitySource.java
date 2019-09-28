package com.hsicen.permission.source;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

/**
 * <p>作者：Hsicen  2019/9/28 21:41
 * <p>邮箱：codinghuang@163.com
 * <p>功能：
 * <p>描述：
 */
public class AppActivitySource extends Source {

    private Activity mActivity;

    public AppActivitySource(Activity activity) {
        this.mActivity = activity;
    }

    @Override
    public Context getContext() {
        return mActivity;
    }

    @Override
    public void startActivity(Intent intent) {
        mActivity.startActivity(intent);
    }
}
