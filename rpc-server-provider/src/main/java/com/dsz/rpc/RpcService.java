package com.dsz.rpc;

import org.springframework.stereotype.Component;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Component
 * @see GpRpcServer#setApplicationContext(org.springframework.context.ApplicationContext)
 */
@Component
@Target(ElementType.TYPE) //类/接口
@Retention(RetentionPolicy.RUNTIME)
public @interface RpcService {

    Class<?> value(); //拿到服务的接口

    /**
     * 版本号
     */
    String version() default "";

}
