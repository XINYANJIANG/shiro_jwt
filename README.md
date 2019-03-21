@[TOC](shiro + spring boot  + jwt 基础使用)
***
# shiro简介

Apache Shiro是一个强大且易用的**Java安全框架**,执行身份验证、授权、密码和会话管理。使用Shiro的易于理解的**API**,您可以快速、轻松地获得任何应用程序,从最小的移动应用程序到最大的网络和企业应用程序。

# shiro框架结构
## 架构图
![shiro框架结构](https://img-blog.csdnimg.cn/20190321221429481.png)
### shiro 四大基石
 1. **Authentication** 身份认证/登录，主要用来验证用户是不是拥有相应的身份；
 2. **Authorization**  验证当前用户是否具备相应的角色或者权限；
 3. **Session Manager**  web应用中一般是用web容器对session进行管理，shiro也提供一套session管理的方式；
 4.  **Cryptography** 用户信息的加密处理；
 ### shiro的其他扩充功能
 1. **Web Support** Web支持，可以非常容易的集成到Web环境；
 2. **Caching** 缓存功能，可用于一些用户信息的缓存，不必每次读取读库；
 3. **Concurrency** shiro支持多线程应用的并发验证，即如在一个线程中开启另一个线程，能把权限自动传播过去；
 4. **Testing** 提供测试支持；
 5. **Run As** 允许用户假定其他用户的身份（如果允许）的功能，有时在管理方案中很有用；
 6. **Remember Me** 记住用户在会话中的身份，因此他们只需要在必要时登录；

## 工程结构
![在这里插入图片描述](https://img-blog.csdnimg.cn/20190321223319961.png)
## pom.xml配置
```xml
<!--shiro spring -->
<dependency>
	<groupId>org.apache.shiro</groupId>
	<artifactId>shiro-spring</artifactId>
	<version>1.4.0</version>
</dependency>
```
---
#  json web token (JWT) 简介
JSON Web Token（JWT）是一个开放标准（RFC 7519），它定义了一种紧凑且独立的方式，用于在各方之间作为JSON对象安全地传输信息。此信息可以通过数字签名进行验证和信任。JWT可以使用秘密（使用HMAC算法）或使用RSA或ECDSA的公钥/私钥对进行签名。
## 为什么使用JWT
随着技术的发展，分布式web应用的普及, 通过session来管理成本越来越高，而JWT提供用户信息存储并对信息进行加密、提高JWT时效性。
## pom.xml配置
```xml
<dependency>
     <groupId>com.auth0</groupId>
     <artifactId>java-jwt</artifactId>
     <version>3.2.0</version>
</dependency>
<dependency>
     <groupId>io.jsonwebtoken</groupId>
     <artifactId>jjwt</artifactId>
     <version>0.7.0</version>
</dependency>
   ```
***
