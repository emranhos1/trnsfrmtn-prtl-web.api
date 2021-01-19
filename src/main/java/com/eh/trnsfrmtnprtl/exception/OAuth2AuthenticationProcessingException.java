package com.eh.trnsfrmtnprtl.exception;

import org.springframework.security.core.AuthenticationException;
/**
 * @author   Md. Emran Hossain <emranhos1@gmail.com>
 * @version  1.0.00 EH
 * @since    1.0.00 EH
 */
public class OAuth2AuthenticationProcessingException extends AuthenticationException {
    private static final long serialVersionUID = 4229343960731648019L;

    public OAuth2AuthenticationProcessingException(String msg, Throwable t) {
        super(msg, t);
    }

    public OAuth2AuthenticationProcessingException(String msg) {
        super(msg);
    }
}
