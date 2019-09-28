package com.hsicen.permission.checker;

import android.os.Environment;

import java.io.File;

/**
 * <p>作者：Hsicen  2019/9/28 21:40
 * <p>邮箱：codinghuang@163.com
 * <p>功能：
 * <p>描述：
 */
class StorageReadTest implements PermissionTest {

    StorageReadTest() {
    }

    @Override
    public boolean test() throws Throwable {
        File directory = Environment.getExternalStorageDirectory();
        if (directory.exists() && directory.canRead()) {
            long modified = directory.lastModified();
            String[] pathList = directory.list();
            return modified > 0 && pathList != null;
        }
        return false;
    }
}