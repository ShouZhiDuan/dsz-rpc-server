package com.dsz.rpc;

/**
 * 服务端service
 */
public interface IHelloService {

    String sayHello(double money);

    /**
     * 保存用户
     * @param user
     * @return
     */
    String saveUser(User user);

}
