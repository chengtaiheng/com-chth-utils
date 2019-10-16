package com.chth.type.conversion;

/**
 * @author: 程泰恒
 */
public class ToIntegerUtil {

    /**
     * String类型转换为Integer类型
     *
     * @param string String参数
     * @return Integer
     */
    public static Integer stringToInteger(String string) {
        return Integer.valueOf(string);
    }

    /**
     * double类型四舍五入转变成Integer类型
     *
     * @param param Double类型参数
     * @return Integer
     */
    public static Integer doubleRoundToInteger(Double param) {
        return (int) Math.round(param);
    }

    /**
     * double触摸地板（变为小的整数）再转换成Integer类型
     *
     * @param param Double类型参数
     * @return Integer类型结果
     */
    public static Integer doubleFloorToInteger(Double param) {
        return (int) Math.floor(param);
    }

    /**
     * Float四舍五入转变成Integer类型
     *
     * @param param Float类型参数
     * @return Integer
     */
    public static Integer floatRoundToInteger(Float param) {
        return (int) Math.round(param);
    }

    /**
     * Float摸地板（变为较小的整数）转变为Integer类型
     *
     * @param param Float类型参数
     * @return Integer
     */
    public static Integer floatFloorToInteger(Float param) {
        return (int) Math.floor(param);
    }

    /**
     * long类型转成Integer
     *
     * @param param Long类型参数
     * @return Integer
     */
    public static Integer longToInteger(Long param) {
        return param.intValue();
    }


}
