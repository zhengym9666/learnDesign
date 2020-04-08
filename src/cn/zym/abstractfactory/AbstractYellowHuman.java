package cn.zym.abstractfactory;

/**
 * @ClassName AbstractYellowHuman
 * @Description TODO     抽象产品类，封装一类产品的共同属性
 * @Author zhengym
 * @Date 2020/4/7 11:55
 * @Version 1.0
 */
public abstract class AbstractYellowHuman implements Human{
    @Override
    public void talk() {
        System.out.println("黄种人说汉语");
    }

    @Override
    public void skin() {
        System.out.println("黄种人的肤色是黄的");
    }

    public abstract void sex();
}
