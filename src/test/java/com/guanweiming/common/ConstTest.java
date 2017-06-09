package com.guanweiming.common;

import org.junit.Test;

/**
 * @author zziaguan
 */
public class ConstTest {



    @Test
    public void getNullPropertyNamesTest(){
        System.out.println(Const.getNullPropertyNames(new Object(),"id","username"));
        System.out.println(Const.getNullPropertyNames(new Object(),null));
        System.out.println(Const.getNullPropertyNames(null,"id","username"));
        System.out.println(Const.getNullPropertyNames(null,null));
    }

}
