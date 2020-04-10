package cn.zym.proxy.ordinaryproxy;

/**
 * @ClassName ConcreteSubject
 * @Description TODO    普通代理，真实类，真实对象的创建限制在只能由代理类构造
 * @Author zhengym
 * @Date 2020/4/9 15:04
 * @Version 1.0
 */
public class ConcreteSubject implements Subject{

    public ConcreteSubject(Subject _proxy) throws Exception {
        //限制只有代理对象才能创建真实对象
        if (_proxy==null) {
            throw new Exception("不能创建真实对象");
        }
    }

    @Override
    public void doWork() {
        System.out.println("真实对象的动作...");
    }
}
