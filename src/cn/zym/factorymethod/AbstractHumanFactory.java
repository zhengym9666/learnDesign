package cn.zym.factorymethod;

/**
 * @ClassName AbstractHumanFactory
 * @Description TODO    抽象人类工厂
 * @Author zhengym
 * @Date 2020/4/2 18:15
 * @Version 1.0
 */
public abstract class AbstractHumanFactory {

    public abstract <T extends Human> T buildHuman(Class<T> c);

}
