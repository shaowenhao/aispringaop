package com.siemens;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * <p>Create Time: 2022年02月25日 14:23          </p>
 **/
public class MyInvocationHandler implements InvocationHandler {

 //接受委托对象
    private Object object = null;
 //返回代理对象
    public Object bind(Object obj){
       //接收委托对象
        this.object = obj;
       //返回代理对象 因为代理对象要具备委托对象的所有功能(通过接口描述)
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(),obj.getClass().getInterfaces(),this);
    }


    //解耦合 把业务代码 和 日志代码拆分
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println( method.getName()+ "method parameters:" + Arrays.toString(args));
        //调用的还是委托对象的方法
        Object result = method.invoke(this.object, args);
        System.out.println( method.getName() + "result was:" + result);
        return result;
    }
}
