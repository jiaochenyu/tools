package com.guanweiming.common;

import org.apache.commons.lang3.ClassUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.junit.Test;

/**
 * @author zziaguan
 */

public class NumberUtilsTest {
    @Test
    public void NumberUtils(){
        /*判断字符串是否是数字*/
//        System.out.println(NumberUtils.isNumber("2.34"));
//        System.out.println(NumberUtils.isNumber("a2.34"));
//        System.out.println(NumberUtils.isNumber("21312312"));
//        System.out.println(NumberUtils.isNumber("%^&"));
        /*判断字符串是否全为数字*/
//        System.out.println(NumberUtils.isDigits("123.456"));
//        System.out.println(NumberUtils.isDigits("123456"));

        System.out.println(NumberUtils.min(new int[]{5,9,7}));
        System.out.println(NumberUtils.max(new int[]{5,9,7}));
    }
}
