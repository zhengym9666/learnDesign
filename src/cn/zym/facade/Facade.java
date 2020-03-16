package cn.zym.facade;

/**
 * @ClassName Facade
 * @Description TODO    门面对象角色
 * @Author zhengym
 * @Date 2020/3/16 13:45
 * @Version 1.0
 */
public class Facade {

    private Subsystem1 subsystem1 = new Subsystem1();
    private Subsystem2 subsystem2 = new Subsystem2();

    public void method1() {
        this.subsystem1.doSomething();
    }

    public void method2() {
        this.subsystem2.doSomething();
    }
}
