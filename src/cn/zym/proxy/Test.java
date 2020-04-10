package cn.zym.proxy;

/**
 * @ClassName Test
 * @Description TODO    测试代理模式
 * @Author zhengym
 * @Date 2020/4/8 18:39
 * @Version 1.0
 */
public class Test {

    public static void main(String[] args) {
        ConcreteObject co = new ConcreteObject();
        Proxy proxy = new Proxy(co);
        proxy.doWork();
    }

}
