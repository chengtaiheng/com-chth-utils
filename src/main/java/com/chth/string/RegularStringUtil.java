package com.chth.string;

import com.chth.util.CharacterType;

/**
 * @author: 程泰恒
 */

public class RegularStringUtil {

    /**
     * 字符串通过字符类型集合获取相对应的字符
     *
     * @param string 字符串
     * @param args   字符类型
     * @return 结果字符串
     */
    public static String getStringByCharacterTypes(String string, CharacterType... args) {
        String regex = getRegexByCharacterTypes(args).replace("[", "[^");
        return string.replaceAll(regex, "");
    }

    /**
     * 字符串通过正则表达式获取相反字符
     *
     * @param string 字符串
     * @param args   字符类型
     * @return 结果字符串
     */
    public static String getStringByRegexOpposite(String string, CharacterType... args) {
        String regex = getRegexByCharacterTypes(args);
        return string.replaceAll(regex, "");
    }

    /**
     * 根据字符类型获取相应字符类型的正则字符串
     *
     * @param args 字符类型
     * @return String
     */
    public static String getRegexByCharacterTypes(CharacterType... args) {
        String regularExpressionStart = "[";
        String regulartExpressionEnd = "]";

        for (CharacterType arg : args) {
            regularExpressionStart += getRegexNodeByCharacterType(arg);
        }
        return regularExpressionStart += regulartExpressionEnd;
    }

    /**
     * 通过相应的字符类型获得相对应的正则表达式节点
     *
     * @param characterType 字符类型
     * @return String
     */
    private static String getRegexNodeByCharacterType(CharacterType characterType) {

        switch (characterType) {
            case 中文:
                return "\\u4e00-\\u9fa5";
            case 数字:
                return "\\d";
            case 小写字母:
                return "//a-z";
            case 大写字母:
                return "//A-Z";
            case 大小写字母:
                return "//a-zA-Z";
            default:
                return "";
        }
    }


}

