package com.hsicen.permission;

/**
 * <p>作者：Hsicen  2019/9/28 21:49
 * <p>邮箱：codinghuang@163.com
 * <p>功能：
 * <p>描述：Request executor
 */
public interface RequestExecutor {

    /**
     * Go request permission.
     */
    void execute();

    /**
     * Cancel the operation.
     */
    void cancel();

}
