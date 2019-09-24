package com.chth.type.conversion;

/**
 * @author: 程泰恒
 */
public class ToIntUtil {

    /**
     * String类型转换为int类型
     *
     * @param string 字符串
     * @return int
     */
    public static int stringToInt(String string) {
        return Integer.valueOf(string);
    }

    /**
     * double类型四舍五入转变成int类型
     *
     * @param param double 类型
     * @return int
     */
    public static int doubleRoundToInt(Double param) {
        return (int) Math.round(param);
    }

    /**
     * double转换成较小类型的整数
     *
     * @param param double
     * @return int类型返回结果
     */
    public static int doubleFloorToInt(Double param) {
        return (int) Math.floor(param);
    }

    /**
     * Float四舍五入转变成int类型
     *
     * @param param float类型
     * @return int
     */
    public static int floatRoundToInt(Float param) {
        return (int) Math.round(param);
    }

    /**
     * Float摸地板（变为较小的整数）转变为int类型
     *
     * @param param Float参数
     * @return int
     */
    public static int floatFloorToInt(Float param) {
        return (int) Math.floor(param);
    }

    /**
     * long类型转成int
     *
     * @param param Long型参数
     * @return int
     */
    public static int longToInt(Long param) {
        return param.intValue();
    }


}
