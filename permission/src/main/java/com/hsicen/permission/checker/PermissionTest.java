
package com.hsicen.permission.checker;

import android.database.Cursor;

/**
 * <p>作者：Hsicen  2019/9/28 21:38
 * <p>邮箱：codinghuang@163.com
 * <p>功能：
 * <p>描述：权限测试
 */
interface PermissionTest {

    boolean test() throws Throwable;

    class CursorTest {
        public static void read(Cursor cursor) {
            int count = cursor.getCount();
            if (count > 0) {
                cursor.moveToFirst();
                int type = cursor.getType(0);
                switch (type) {
                    case Cursor.FIELD_TYPE_BLOB:
                    case Cursor.FIELD_TYPE_NULL: {
                        break;
                    }
                    case Cursor.FIELD_TYPE_INTEGER:
                    case Cursor.FIELD_TYPE_FLOAT:
                    case Cursor.FIELD_TYPE_STRING:
                    default: {
                        cursor.getString(0);
                        break;
                    }
                }
            }
        }
    }
}