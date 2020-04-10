package cn.zym.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @ClassName MyInvocationHandler
 * @Description TODO    自定义handler类，动态生成代理对象时需要使用，代理对象执行方法其实就是调用了invoke
 * @Author zhengym
 * @Date 2020/4/9 18:20
 * @Version 1.0
 */
public class MyInvocationHandler implements InvocationHandler {

    private Object target = null;

    public MyInvocationHandler(Object _object) {
        this.target = _object;
    }

    //代理对象执行方法时调用该方法
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("执行前...");
       Object result = method.invoke(this.target,args);
        System.out.println("执行后...");
       return result;
    }
}
