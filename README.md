# 说明
经常写小程序后台，这里把小程序通用的代码集成到这里。便于统一管理。
> 环境说明：SpringBoot 1.5.6.RELEASE+jdk1.8
# 包含组件：
* 通用的结果返回封装
* 七牛云生成upToken
* 跨域Filter
# 在maven中配置repository
```xml
<!--私有仓库-->
<repository>
    <id>maven-repo</id>
    <url>https://raw.github.com/zziaguan/maven/master</url>
</repository>
```
# 在dependencies中添加依赖
```xml
<dependency>
    <groupId>com.guanweiming.common</groupId>
    <artifactId>tools</artifactId>
    <version>0.0.2</version>
</dependency>
```
