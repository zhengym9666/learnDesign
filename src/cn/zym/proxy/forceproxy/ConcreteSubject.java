package cn.zym.proxy.forceproxy;

/**
 * @ClassName ConcreteSubject
 * @Description TODO    强制代理，真实对象类，代理对象由真实对象来构造指定
 * @Author zhengym
 * @Date 2020/4/9 15:22
 * @Version 1.0
 */
public class ConcreteSubject implements Subject {

    private Subject proxy = null;

    public Subject getProxy() {
        proxy =  new ForceProxy(this);
        return proxy;
    }

    @Override
    public void doWork() {
        if (proxy==null) {
            System.out.println("请使用指定的代理访问");
        }
        System.out.println("真实对象的动作...");
    }
}
