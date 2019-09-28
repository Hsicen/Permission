package com.hsicen.permission;

import java.util.List;

/**
 * <p>作者：Hsicen  2019/9/28 21:42
 * <p>邮箱：codinghuang@163.com
 * <p>功能：
 * <p>描述：
 */
public interface Action {

    /**
     * An action.
     *
     * @param permissions the current action under permissions.
     */
    void onAction(List<String> permissions);

}
