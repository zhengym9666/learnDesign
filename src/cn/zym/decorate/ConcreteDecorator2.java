package cn.zym.decorate;

/**
 * @ClassName ConcreteDecorator2
 * @Description TODO
 * @Author zhengym
 * @Date 2020/3/10 17:56
 * @Version 1.0
 */
public class ConcreteDecorator2 extends  Decorator{

    public ConcreteDecorator2(Component _component) {
        super(_component);
    }

    @Override
    public void decorate() {
        System.out.println("我是装饰者2号，这是我的装饰动作");
    }

    @Override
    public void operate() {
        decorate();
        super.decorate();
    }
}
