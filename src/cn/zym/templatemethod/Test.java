package cn.zym.templatemethod;

/**
 * @ClassName Test
 * @Description TODO    测试模板方法模式
 * @Author zhengym
 * @Date 2020/4/3 15:12
 * @Version 1.0
 */
public class Test {

    public static void main(String[] args) {
        ConcreteClass1 class1 = new ConcreteClass1();
        class1.run();
        ConcreteClass2 class2 = new ConcreteClass2();
        class2.run();
    }

}
