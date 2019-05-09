package com.chth.string;

/**
 * @author: 程泰恒
 * @date: 2019/5/9 11:37
 */

public class CommonUtil {

    /**
     * 判断一个字符串是否包含另外一个字符串
     *
     * @param var1 源字符串
     * @param var2 要判断的字符串
     * @return true:包含 false:不包含
     */
    public static Boolean ifContainsString(String var1, String var2) {

        Boolean contains = true;

        if (var1.indexOf(var2) == -1) {
            contains = false;
        }

        return contains;

    }
}
