package cn.zym.abstractfactory;

/**
 * @ClassName Test
 * @Description TODO    测试抽象工厂模式
 * @Author zhengym
 * @Date 2020/4/7 12:11
 * @Version 1.0
 */
public class Test {

    public static void main(String[] args) throws Exception {
        HumanFactory fFactory = FactoryBuilder.build(FemaleFactory.class);
        WhiteFemaleHuman wfhuman = (WhiteFemaleHuman) fFactory.createWhiteHuman();
        wfhuman.talk();
        wfhuman.skin();
        wfhuman.sex();
        HumanFactory mfactory = FactoryBuilder.build(MaleFactory.class);
        YellowMaleHuman ymhuman = (YellowMaleHuman) mfactory.createYellowHuman();
        ymhuman.talk();
        ymhuman.skin();
        ymhuman.sex();
    }

}
