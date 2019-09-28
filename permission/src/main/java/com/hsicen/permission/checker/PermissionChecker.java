
package com.hsicen.permission.checker;

import android.content.Context;

import androidx.annotation.NonNull;

import java.util.List;

/**
 * <p>作者：Hsicen  2019/9/28 21:38
 * <p>邮箱：codinghuang@163.com
 * <p>功能：
 * <p>描述：权限测试
 */
public interface PermissionChecker {

    /**
     * Check if the calling context has a set of permissions.
     *
     * @param context     {@link Context}.
     * @param permissions one or more permissions.
     * @return true, other wise is false.
     */
    boolean hasPermission(@NonNull Context context, @NonNull String... permissions);

    /**
     * Check if the calling context has a set of permissions.
     *
     * @param context     {@link Context}.
     * @param permissions one or more permissions.
     * @return true, other wise is false.
     */
    boolean hasPermission(@NonNull Context context, @NonNull List<String> permissions);

}