package com.guanweiming.common;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author chezhu.xin
 */
public class QiniuResponseTest {

    @Test
    public void createBySuccess() {
        QiniuResponse response = QiniuResponse.createBySuccess("demo");
        assertTrue(response.isSuccess());
    }

    @Test
    public void createByError() {
        QiniuResponse response = QiniuResponse.createByError();
        assertTrue(!response.isSuccess());
    }
}