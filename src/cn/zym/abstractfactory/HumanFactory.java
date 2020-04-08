package cn.zym.abstractfactory;


/**
 * @ClassName HumanFactory
 * @Description TODO     工厂接口，封装所有工厂的共同属性
 * @Author zhengym
 * @Date 2020/4/7 12:06
 * @Version 1.0
 */
public interface HumanFactory {

    //制造一个白种人
    public abstract Human createWhiteHuman();

    //制造一个黄种人
    public abstract Human createYellowHuman();

}
