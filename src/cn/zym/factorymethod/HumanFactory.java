package cn.zym.factorymethod;

/**
 * @ClassName HumanFactory
 * @Description TODO
 * @Author zhengym
 * @Date 2020/4/2 18:19
 * @Version 1.0
 */
public class HumanFactory extends AbstractHumanFactory {

    private static AbstractHumanFactory factory = null;

    public static AbstractHumanFactory build() {
        if (factory==null) {
            factory = new HumanFactory();
        }
        return factory;
    }

    @Override
    public <T extends Human> T buildHuman(Class<T> c) {
        //定义一个生产的人种
        T human = null;
        try {
            human = (T) Class.forName(c.getName()).newInstance();
        }catch (Exception e) {
            e.printStackTrace();
        }
        return human;
    }
}
