package com.dsz.rpc;

import java.io.Serializable;

/**
 *
 */
public class RpcRequest implements Serializable {

    //被调用类
    private String className;
    //被执行的方法
    private String methodName;
    //参数值数组
    private Object[] parameters;
    //参数类型
    private Class<?>[] paramTypes;
    //版本号
    private String version;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Class<?>[] getParamTypes() {
        return paramTypes;
    }

    public void setParamTypes(Class<?>[] paramTypes) {
        this.paramTypes = paramTypes;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public Object[] getParameters() {
        return parameters;
    }

    public void setParameters(Object[] parameters) {
        this.parameters = parameters;
    }
}
