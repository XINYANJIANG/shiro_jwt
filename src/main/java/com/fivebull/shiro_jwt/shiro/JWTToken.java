package com.fivebull.shiro_jwt.shiro;

import org.apache.shiro.authc.AuthenticationToken;

/**
 * 一个屌丝码农
 * Created by 五头牛.
 */
public class JWTToken implements AuthenticationToken {

    //由JWTUtil
    private String token;

    public JWTToken(String token){
        this.token = token;
    }
    @Override
    public Object getPrincipal() {
        return token;
    }

    @Override
    public Object getCredentials() {
        return token;
    }
}
