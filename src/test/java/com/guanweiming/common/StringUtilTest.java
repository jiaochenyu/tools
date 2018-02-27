package com.guanweiming.common;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author chezhu.xin
 */
public class StringUtilTest {

    @Test
    public void isBlank() {
        assertTrue(StringUtil.isBlank(""));
        assertTrue(StringUtil.isBlank(null));
        assertTrue(StringUtil.isBlank(" "));
        assertTrue(!StringUtil.isBlank("1"));
    }


    @Test
    public void isEmpty() {
        assertTrue(StringUtil.isEmpty(""));
        assertTrue(StringUtil.isEmpty(null));
        assertTrue(!StringUtil.isEmpty(" "));
        assertTrue(!StringUtil.isEmpty("1"));
    }

    @Test
    public void getExtend() {
        assertEquals(StringUtil.getExtend("abc.mp4"), "mp4");
        assertEquals(StringUtil.getExtend("abc.mp4.mp5"), "mp5");
        assertEquals(StringUtil.getExtend("abc"), "");
    }
}