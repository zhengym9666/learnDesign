package cn.zym.proxy;

/**
 * @ClassName ConcreteObject
 * @Description TODO    真实对象角色
 * @Author zhengym
 * @Date 2020/4/8 18:35
 * @Version 1.0
 */
public class ConcreteObject implements Subject {
    @Override
    public void doWork() {
        System.out.println("真实对象的动作...");
    }
}
