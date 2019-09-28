package com.hsicen.permission;

import androidx.annotation.NonNull;

/**
 * <p>作者：Hsicen  2019/9/28 21:49
 * <p>邮箱：codinghuang@163.com
 * <p>功能：
 * <p>描述：Permission request.
 */
public interface Request {

    /**
     * One or more permissions.
     */
    @NonNull
    Request permission(String... permissions);

    /**
     * One or more permission groups.
     */
    @NonNull
    Request permission(String[]... groups);

    /**
     * Set request rationale.
     */
    @NonNull
    Request rationale(Rationale listener);

    /**
     * Action to be taken when all permissions are granted.
     */
    @NonNull
    Request onGranted(Action granted);

    /**
     * Action to be taken when all permissions are denied.
     */
    @NonNull
    Request onDenied(Action denied);

    /**
     * Request permission.
     */
    void start();

}