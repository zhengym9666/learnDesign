package cn.zym.factorymethod;

/**
 * @ClassName Test
 * @Description TODO    测试工厂方法模式
 * @Author zhengym
 * @Date 2020/4/2 18:24
 * @Version 1.0
 */
public class Test {

    public static void main(String[] args) {
        //创建工厂的两种方式：
        //1、通过统一的对外协调者创建，调用者只需要提供具体的工厂标识字符串。该方式适用于多工厂模式
        WhiteHuman human1 = FactoryBuilder.getFactory(Constants.HUMAN_FACTORY).buildHuman(WhiteHuman.class);
        human1.skin();
        //2、通过直接调用具体的工厂类。该方式适用于简单工厂模式
        YellowHuman human2 = HumanFactory.build().buildHuman(YellowHuman.class);
        human2 = FactoryBuilder.getFactory(Constants.DELAY_FACTORY).buildHuman(YellowHuman.class);
        human2.skin();

        //从延迟加载工厂获取实例

        YellowHuman human3 = new DelayHumanFactory().getHuman(Constants.YELLOW_HUMAN);
        human3.skin();
    }

}
