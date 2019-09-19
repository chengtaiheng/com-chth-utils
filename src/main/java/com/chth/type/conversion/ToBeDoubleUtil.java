package com.chth.type.conversion;

/**
 * @author: 程泰恒
 * @date: 2019/8/6 15:42
 */
public class ToBeDoubleUtil {

    /**
     * 字符串变为Double类型
     * @param param
     * @return
     */
    public static Double stringTodouble(String param){
        return Double.valueOf(param);
    }

    /**
     * Integer或int类型转换成Double类型
     * @param param
     * @return
     */
    public static Double integerTodouble(Integer param) {
        return Double.parseDouble(param.toString());
    }

    /**
     *  Long或者long类型转换成Double类型
     * @param param
     * @return
     */
    public static Double longTodouble(Long  param) {
        return Double.parseDouble(param.toString());
    }

}
