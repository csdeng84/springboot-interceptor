package com.csdeng.springbootinterceptor.service;

import javax.servlet.http.HttpServletRequest;

public interface ITokenService {
    /**
     * 创建token
     * @return
     */
    public String createToken();

    /**
     * 检验token
     * @param request
     * @return
     */
    public boolean checkToken(HttpServletRequest request) throws Exception;
}
