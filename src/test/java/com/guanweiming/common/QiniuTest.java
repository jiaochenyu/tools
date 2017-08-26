package com.guanweiming.common;

import org.junit.Test;

/**
 * @author https://github.com/zziaguan/
 */

public class QiniuTest {
    @Test
    public void test(){
        QiniuService service=new MyQiniu();
        System.out.println(service.uptoken());
    }

    class MyQiniu extends QiniuService{

        QiniuData init() {
            String accessKey = "3LKtRSyD26qE2b49zDMljLMOPthqQT4dg1qLP5DA";
            String secretKey = "u5mxMAVvySYZwI8vtSkbaoEGvwYo4Ae7r_tibd3u";
            String bucket = "guide";
            return new QiniuData(accessKey,secretKey,bucket);
        }
    }
}
