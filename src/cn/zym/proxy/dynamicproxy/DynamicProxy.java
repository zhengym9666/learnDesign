package cn.zym.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @ClassName DynamicProxy
 * @Description TODO    动态代理类，动态生成代理实例
 * @Author zhengym
 * @Date 2020/4/9 18:25
 * @Version 1.0
 */
public class DynamicProxy {

    public static <T> T newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler handler) {
        if (true) {
            new Advice().exec();
        }
        //执行目标并返回结果
        return (T) Proxy.newProxyInstance(loader,interfaces,handler);
    }

}
