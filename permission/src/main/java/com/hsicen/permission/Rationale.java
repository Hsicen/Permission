package com.hsicen.permission;

import android.content.Context;

import java.util.List;

/**
 * <p>作者：Hsicen  2019/9/28 21:48
 * <p>邮箱：codinghuang@163.com
 * <p>功能：
 * <p>描述：Rationale listener
 */
public interface Rationale {

    /**
     * Show rationale of permissions to user.
     *
     * @param context     context.
     * @param permissions show rationale permissions.
     * @param executor    executor.
     */
    void showRationale(Context context, List<String> permissions, RequestExecutor executor);
}