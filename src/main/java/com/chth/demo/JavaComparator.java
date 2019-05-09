package com.chth.demo;

import lombok.*;

import java.util.Comparator;
import java.util.LinkedList;

/**
 * @author: 程泰恒
 * @date: 2019/3/13 16:22
 */
public class JavaComparator {
    public static final Comparator<JavaComparator.JavaComparatorEntity> JAVA_COMPARATOR_ENTITY_COMPARATOR = (o1, o2) -> {
        if ((o1 == null || o2 == null) || (o1.count.equals(o2.count))) {
            return 0;
        }
        return (int) (o2.count - o1.count);
    };

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    @ToString
    static class JavaComparatorEntity {
        private String name;
        private Long count;
    }

    public static void main(String[] args) {

        //两个对象比较
        JavaComparatorEntity javaComparatorEntity = new JavaComparatorEntity("name1", 56L);
        JavaComparatorEntity javaComparatorEntity1 = new JavaComparatorEntity("name2", 35L);

        int compare = JAVA_COMPARATOR_ENTITY_COMPARATOR.compare(javaComparatorEntity, javaComparatorEntity1);
        if (compare == 0) {
            System.out.println("first=" + javaComparatorEntity.count);
            System.out.println("second=" + javaComparatorEntity1.count);
            System.out.println("两个对象相等");
        }
        if (compare < 0) {
            System.out.println("first=" + javaComparatorEntity.count);
            System.out.println("second=" + javaComparatorEntity1.count);
            System.out.println("第一个对象大于第二个对象");
        }

        if (compare > 0) {
            System.out.println("first=" + javaComparatorEntity.count);
            System.out.println("second=" + javaComparatorEntity1.count);
            System.out.println("第一个对象小于第二个对象");
        }

        //集合排序
        JavaComparatorEntity javaComparatorEntity2 = new JavaComparatorEntity("name3", 100L);

        LinkedList<JavaComparatorEntity> list = new LinkedList<>();
        list.add(javaComparatorEntity);
        list.add(javaComparatorEntity1);
        list.add(javaComparatorEntity2);

        System.out.println("排序前");
        for (JavaComparatorEntity comparatorEntity : list) {
            System.out.println("javaComparatorEntity=" + comparatorEntity);
        }

        list.sort(JAVA_COMPARATOR_ENTITY_COMPARATOR);

        System.out.println("排序后");
        for (JavaComparatorEntity comparatorEntity : list) {
            System.out.println("javaComparator=" + comparatorEntity);
        }

    }
}
