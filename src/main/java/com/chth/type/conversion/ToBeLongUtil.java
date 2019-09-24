package com.chth.type.conversion;

/**
 * @author: 程泰恒
 */
public class ToBeLongUtil {

    /**
     * String类型转换为Long类型
     *
     * @param string String类型参数
     * @return Long
     */
    public static Long stringTolong(String string) {
        return Long.valueOf(string);
    }

    /**
     * double类型四舍五入转变成Long类型
     *
     * @param param Double类型参数
     * @return Long
     */
    public static Long doubleRoundTolong(Double param) {
        return Math.round(param);
    }

    /**
     * double转换成较小的整数
     *
     * @param param Double类型参数
     * @return  Long类型返回结果
     */
    public static Long doubleFloorTolong(Double param) {
        return  (long)Math.floor(param);
    }

    /**
     * Float四舍五入转变成Long类型
     *
     * @param param Float类型参数
     * @return Long
     */
    public static long floatRoundTolong(Float param) {
        return (long) Math.round(param);
    }

    /**
     * Float摸地板（变为较小的整数）转变为Long类型
     *
     * @param param Float类型参数
     * @return Long
     */
    public static Long floatFloorTolong(Float param) {
        return (long) Math.floor(param);
    }




}
