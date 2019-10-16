package com.chth.string;

import java.util.Objects;

/**
 * @author: 程泰恒
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

    /**
     * 将一段字符串中的一段字符串用另外一段字符串替换
     *
     * @param source 源字符串
     * @param replace 替换字符串
     * @param startIndex 起始替换下标
     * @param endIndex 结束替换下标(不包含)
     * @return 返回结果
     */
    public static String replace(String source,String replace,int startIndex,int endIndex){

        if(!Objects.isNull(source)){
            return new StringBuilder(source).replace(startIndex, endIndex, replace).toString();
        }

        return "";
    }
}
