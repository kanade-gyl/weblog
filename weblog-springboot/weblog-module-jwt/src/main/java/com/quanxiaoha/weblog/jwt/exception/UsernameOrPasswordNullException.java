package com.quanxiaoha.weblog.jwt.exception;

import org.springframework.security.core.AuthenticationException;

/**
 * @author : Kanade
 * @date : 2024-11-28 15:00
 * @description: 校验用户名、密码是否为空，为空则抛出异常
 */
public class UsernameOrPasswordNullException extends AuthenticationException {
    public UsernameOrPasswordNullException(String msg,Throwable cause) {
        super(msg,cause);
    }

    public UsernameOrPasswordNullException(String msg) {
        super(msg);
    }
}
