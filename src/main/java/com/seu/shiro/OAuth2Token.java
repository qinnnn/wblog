package com.seu.shiro;

import org.apache.shiro.authc.AuthenticationToken;

/**
 * token
 *
 * @author qinnnn
 * @date 2018-09-04 15:00:55
 */
public class OAuth2Token implements AuthenticationToken {
    private String token;

    public OAuth2Token(String token) {
        this.token = token;
    }

    @Override
    public String getPrincipal() {
        return token;
    }

    @Override
    public Object getCredentials() {
        return token;
    }

}
