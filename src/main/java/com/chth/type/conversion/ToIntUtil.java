package com.chth.type.conversion;

/**
 * @author: 程泰恒
 * @date: 2019/8/6 9:14
 */
public class ToIntUtil {

    /**
     * String类型转换为int类型
     *
     * @param string
     * @return
     */
    public static int stringToInt(String string) {
        return Integer.valueOf(string);
    }

    /**
     * double类型四舍五入转变成int类型
     *
     * @param param
     * @return
     */
    public static int doubleRoundToInt(Double param) {
        return (int) Math.round(param);
    }

    /**
     * double转换成较小类型的整数
     *
     * @param param
     */
    public static int doubleFloorToInt(Double param) {
        return (int) Math.floor(param);
    }

    /**
     * Float四舍五入转变成int类型
     *
     * @param param
     * @return
     */
    public static int floatRoundToInt(Float param) {
        return (int) Math.round(param);
    }

    /**
     * Float摸地板（变为较小的整数）转变为int类型
     *
     * @param param
     * @return
     */
    public static int floatFloorToInt(Float param) {
        return (int) Math.floor(param);
    }

    /**
     * long类型转成int
     *
     * @param param
     * @return
     */
    public static int longToInt(Long param) {
        return param.intValue();
    }


}
