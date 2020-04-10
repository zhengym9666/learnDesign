package cn.zym.proxy.ordinaryproxy;

/**
 * @ClassName Test
 * @Description TODO    测试普通代理，客户端只能访问代理类，不能访问真实对象
 * @Author zhengym
 * @Date 2020/4/9 15:18
 * @Version 1.0
 */
public class Test {

    public static void main(String[] args) {
        OrdinaryProxy proxy = new OrdinaryProxy();
        proxy.doWork();
    }

}
