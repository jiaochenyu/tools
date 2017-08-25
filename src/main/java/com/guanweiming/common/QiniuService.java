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

        public String getAccessKey() {
            return accessKey;
        }

        public void setAccessKey(String accessKey) {
            this.accessKey = accessKey;
        }

        public String getSecretKey() {
            return secretKey;
        }

        public void setSecretKey(String secretKey) {
            this.secretKey = secretKey;
        }

        public String getBucket() {
            return bucket;
        }

        public void setBucket(String bucket) {
            this.bucket = bucket;
        }
    }

    public String uptoken(){
        return Auth.create(accessKey, secretKey).uploadToken(bucket);
    }

}
