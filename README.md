# 在maven中配置repository
```xml
<!--私有仓库-->
<repository>
    <id>maven-repo</id>
    <url>https://github.com/zziaguan/maven</url>
</repository>
```
# 在dependencies中添加依赖
```xml
<dependency>
    <groupId>com.guanweiming</groupId>
    <artifactId>tools</artifactId>
    <version>LATEST</version>
</dependency>
```
