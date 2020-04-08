package cn.zym.abstractfactory;

/**
 * @ClassName AbstractWhiteHuman
 * @Description TODO    抽象产品类，封装一类产品的共同属性
 * @Author zhengym
 * @Date 2020/4/7 11:53
 * @Version 1.0
 */
public abstract class AbstractWhiteHuman implements Human {


    @Override
    public void talk() {
        System.out.println("白种人讲英语");
    }

    @Override
    public void skin() {
        System.out.println("白种人肤色是白的");
    }

    public abstract void sex();
}
