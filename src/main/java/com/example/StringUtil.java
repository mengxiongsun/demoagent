package com.example;

import java.util.Arrays;
import java.util.Collection;

/**
 * 字符串工具类：将任意类型对象安全地转为字符串
 */
public class StringUtil {

    private StringUtil() {
        // 工具类禁止实例化
    }

    /**
     * 将任意对象转为字符串
     * null 返回 ""，数组和集合做特殊处理，其余直接调用 toString()
     */
    public static String toString(Object obj) {
        if (obj == null) {
            return "";
        }
        if (obj instanceof Object[]) {
            return Arrays.deepToString((Object[]) obj);
        }
        if (obj instanceof int[]) {
            return Arrays.toString((int[]) obj);
        }
        if (obj instanceof long[]) {
            return Arrays.toString((long[]) obj);
        }
        if (obj instanceof double[]) {
            return Arrays.toString((double[]) obj);
        }
        if (obj instanceof boolean[]) {
            return Arrays.toString((boolean[]) obj);
        }
        if (obj instanceof char[]) {
            return Arrays.toString((char[]) obj);
        }
        if (obj instanceof float[]) {
            return Arrays.toString((float[]) obj);
        }
        if (obj instanceof short[]) {
            return Arrays.toString((short[]) obj);
        }
        if (obj instanceof byte[]) {
            return Arrays.toString((byte[]) obj);
        }
        if (obj instanceof Collection<?>) {
            return obj.toString();
        }
        return obj.toString();
    }

    /**
     * 重载：null 时可指定默认返回值
     */
    public static String toString(Object obj, String defaultValue) {
        if (obj == null) {
            return defaultValue;
        }
        return toString(obj);
    }
}