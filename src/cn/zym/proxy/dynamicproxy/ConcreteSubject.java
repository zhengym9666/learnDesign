package cn.zym.proxy.dynamicproxy;

/**
 * @ClassName ConcreteSubject
 * @Description TODO
 * @Author zhengym
 * @Date 2020/4/9 18:19
 * @Version 1.0
 */
public class ConcreteSubject implements Subject {
    @Override
    public void doWork() {
        System.out.println("真实对象的动作...");
    }
}
