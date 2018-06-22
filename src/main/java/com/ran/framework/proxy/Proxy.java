package com.ran.framework.proxy;

/**
 * 代理接口
 * Created By nature on 2018/6/21
 */
public interface Proxy {
    /**
     * 执行链式代理
     * @param proxyChain
     * @return
     * @throws Throwable
     */
    Object doProxy(ProxyChain proxyChain) throws Throwable;
}
