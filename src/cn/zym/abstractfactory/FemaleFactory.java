package cn.zym.abstractfactory;

/**
 * @ClassName FemaleFactory
 * @Description TODO    产品工厂类，实现产品对象的创建
 * @Author zhengym
 * @Date 2020/4/7 12:09
 * @Version 1.0
 */
public class FemaleFactory implements HumanFactory {


    @Override
    public Human createWhiteHuman() {
        return new WhiteFemaleHuman();
    }

    @Override
    public Human createYellowHuman() {
        return new YellowFemaleHuman();
    }
}
