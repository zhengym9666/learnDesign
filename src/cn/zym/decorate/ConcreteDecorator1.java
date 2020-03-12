package cn.zym.decorate;

/**
 * @ClassName ConcreteDecorator1
 * @Description TODO 具体的修饰类，继承Decorator，构造函数内带上被修饰的对象，用于对其进行修饰，并调用其本身的方法（调用父类的super.xx即可）
 * @Author zhengym
 * @Date 2020/3/10 17:56
 * @Version 1.0
 */
public class ConcreteDecorator1 extends  Decorator{

    public ConcreteDecorator1(Component _component) {
        super(_component);
    }

    @Override
    public void decorate() {
        System.out.println("我是装饰者1号，这是我的装饰动作");
    }

    @Override
    public void operate() {
        this.decorate();
        super.decorate();
    }
}
