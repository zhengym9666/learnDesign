package cn.zym.proxy.dynamicproxy;

import cn.zym.proxy.Proxy;

/**
 * @ClassName Test
 * @Description TODO    测试动态代理，使用一个handler调用代理方法，Proxy.newProxyInstance返回代理实例，即可为多个类进行代理。
 * @Author zhengym
 * @Date 2020/4/9 18:24
 * @Version 1.0
 */
public class Test {

    public static void main(String[] args) {
        //创建真实对象
        Subject subject = new ConcreteSubject();
        //创建自定义handler
        MyInvocationHandler invocationHandler = new MyInvocationHandler(subject);
        //生成代理对象
        Subject proxy = DynamicProxy.newProxyInstance(subject.getClass().getClassLoader(),subject.getClass().getInterfaces(),invocationHandler);
        //执行代理方法
        proxy.doWork();
    }

}
