package com.chth.collect;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * @author: 程泰恒
 */
public class ListUtil {

    //list变为以逗号分隔的的String
    public static String getStringCommaSeparated(List<Object> list){
        List<String> list1 = (List) list;
        return list1.stream().collect(Collectors.joining(","));
    }
}
