package com.guanweiming.common;

import com.qiniu.util.Auth;

/**
 * @author https://github.com/zziaguan/
 */
public abstract class QiniuService {
    private final String accessKey;
    private final String secretKey;
    private final String bucket;

    abstract QiniuData init();

    public QiniuService() {
        QiniuData data = init();
        this.accessKey = data.accessKey;
        this.secretKey = data.secretKey;
        this.bucket = data.bucket;
    }

    public class QiniuData {
        String accessKey;
        String secretKey;
        String bucket;

        public QiniuData(String accessKey, String secretKey, String bucket) {
            this.accessKey = accessKey;
            this.secretKey = secretKey;
            this.bucket = bucket;
        }
    }

    public String uptoken(){
        return Auth.create(accessKey, secretKey).uploadToken(bucket);
    }

}
