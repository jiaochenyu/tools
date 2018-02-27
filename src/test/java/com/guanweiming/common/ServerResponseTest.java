package com.guanweiming.common;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * @author chezhu.xin
 */
public class ServerResponseTest {

    @Test
    public void createBySuccess() {
        assertTrue(ServerResponse.createBySuccess().isSuccess());
        assertEquals(ServerResponse.createBySuccess().getStatus(), ResponseCode.SUCCESS.getCode());
    }


    @Test
    public void createBySuccessMessage() {
        assertTrue(ServerResponse.createBySuccessMessage("success").isSuccess());
        assertEquals(ServerResponse.createBySuccessMessage("success").getStatus(), ResponseCode.SUCCESS.getCode());
    }


    @Test
    public void createByError() {
        assertTrue(!ServerResponse.createByError().isSuccess());
        assertEquals(ServerResponse.createByError().getStatus(), ResponseCode.ERROR.getCode());
    }

    @Test
    public void createByErrorMessage() {
        assertTrue(!ServerResponse.createByErrorMessage("error").isSuccess());
        assertEquals(ServerResponse.createByErrorMessage("error").getStatus(), ResponseCode.ERROR.getCode());
    }


    @Test
    public void createByNeedLogin() {
        assertTrue(!ServerResponse.createByNeedLogin().isSuccess());
        assertEquals(ServerResponse.createByNeedLogin().getStatus(), ResponseCode.NEED_LOGIN.getCode());
    }

    @Test
    public void createByIllegalArgument() {
        assertTrue(!ServerResponse.createByIllegalArgument().isSuccess());
        assertEquals(ServerResponse.createByIllegalArgument().getStatus(), ResponseCode.ILLEGAL_ARGUMENT.getCode());
    }
}