package cn.zym.proxy.forceproxy;

/**
 * @ClassName Test
 * @Description TODO    测试强制代理，客户端访问真实对象，并且由客户端获取代理对象。
 * @Author zhengym
 * @Date 2020/4/9 15:29
 * @Version 1.0
 */
public class Test {

    public static void main(String[] args) {
        ConcreteSubject cs = new ConcreteSubject();
        ForceProxy proxy1 = new ForceProxy(cs);
        proxy1.doWork();//直接用new的代理对象访问，无法访问
        Subject proxy2 = cs.getProxy();//必须通过真实对象获取代理对象
        proxy2.doWork();
    }

}
