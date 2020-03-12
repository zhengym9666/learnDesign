package cn.zym.decorate;

/**
 * @ClassName TestDecorator
 * @Description TODO 测试装饰者模式
 * @Author zhengym
 * @Date 2020/3/10 18:01
 * @Version 1.0
 */
public class TestDecorator {

    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        component = new ConcreteDecorator1(component);//ConcreteDecorator1继承了Decorator，而Decorator继承了Component，因此装饰者本质上也是Component，Decorator内封装了一个Component对象
        component = new ConcreteDecorator2(component);//将ConcreteDecorator1对象传入内部封装的Component,因此ConcreteDecorator2对象会封装两个Component对象，一个是ConcreteDecorator1，一个是Component
        component.operate();
    }

}
