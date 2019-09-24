package com.chth.type.conversion;

import java.lang.reflect.Parameter;

/**
 * @author: 程泰恒
 */

public class TodoubleUtil {

    /**
     * 字符串变为double类型
     * @param param String类型参数
     * @return Long
     */
    public static double stringTodouble(String param){
        return Double.valueOf(param);
    }

    /**
     * Integer或int类型转换成double类型
     * @param param Integer类型参数
     * @return double
     */
    public static double integerTodouble(Integer param) {
        return param;
    }

    /**
     *  Long或者long类型转换成double类型
     * @param param Long类型参数
     * @return double
     */
    public static double longTodouble(Long  param) {
        return  param;
    }
}
