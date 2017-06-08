package com.guanweiming.common;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @创建时间 2017/6/8
 * @功能描述
 */
public class Const {
    /**
     * 获取对象的空的属性名
     * @param source 要检测的对象
     * @param ignoreProperties 手动指定要忽略的属性
     * @return 空属性的集合
     */
    public static Set<String> getNullPropertyNames(Object source, String... ignoreProperties) {
        if(source==null){
            return null;
        }
        Class clazz = source.getClass();
        Field[] fields = clazz.getDeclaredFields();

        Set<String> emptyNames = new HashSet<String>();

        for(Field field:fields){
            field.setAccessible(true);
            Object value = null;
            try {
                value = field.get(source);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            if(value == null){
                emptyNames.add(field.getName());
            }
            field.setAccessible(false);
        }
        emptyNames.addAll(Arrays.asList(ignoreProperties));
        return emptyNames;
    }
}
