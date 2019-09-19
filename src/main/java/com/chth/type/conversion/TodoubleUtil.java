package com.chth.type.conversion;

import java.lang.reflect.Parameter;

/**
 * @author: 程泰恒
 * @date: 2019/8/6 15:42
 */

public class TodoubleUtil {

    /**
     * 字符串变为double类型
     * @param param
     * @return
     */
    public static double stringTodouble(String param){
        return Double.valueOf(param);
    }

    /**
     * Integer或int类型转换成double类型
     * @param param
     * @return
     */
    public static double integerTodouble(Integer param) {
        return param;
    }

    /**
     *  Long或者long类型转换成double类型
     * @param param
     * @return
     */
    public static double longTodouble(Long  param) {
        return  param;
    }
}
