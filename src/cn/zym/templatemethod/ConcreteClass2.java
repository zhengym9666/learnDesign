package cn.zym.templatemethod;

/**
 * @ClassName ConcreteClass2
 * @Description TODO    模板方法模式的子类
 * @Author zhengym
 * @Date 2020/4/3 15:11
 * @Version 1.0
 */
public class ConcreteClass2 extends AbstractClass {
    @Override
    protected void method1() {
        System.out.println("具体实现类2的方法1");
    }

    @Override
    protected void mthod2() {
        System.out.println("具体实现类2的方法2");
    }
}
