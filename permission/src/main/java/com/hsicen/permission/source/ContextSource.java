package com.hsicen.permission.source;

import android.content.Context;
import android.content.Intent;

/**
 * <p>作者：Hsicen  2019/9/28 21:41
 * <p>邮箱：codinghuang@163.com
 * <p>功能：
 * <p>描述：
 */
public class ContextSource extends Source {

    private Context mContext;

    public ContextSource(Context context) {
        this.mContext = context;
    }

    @Override
    public Context getContext() {
        return mContext;
    }

    @Override
    public void startActivity(Intent intent) {
        mContext.startActivity(intent);
    }
}
