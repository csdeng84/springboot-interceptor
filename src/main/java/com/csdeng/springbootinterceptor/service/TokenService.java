package com.csdeng.springbootinterceptor.service;

import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

@Service
public class TokenService implements ITokenService {
    @Override
    public String createToken() {
        return null;
    }

    @Override
    public boolean checkToken(HttpServletRequest request) throws Exception {
        return false;
    }
}
