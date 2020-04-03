package cn.zym.factorymethod;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName FactoryBuilder
 * @Description TODO    工厂创建类，提供对外统一获取工厂实例的方法。适用于多工厂模式
 * @Author zhengym
 * @Date 2020/4/3 11:41
 * @Version 1.0
 */
public class FactoryBuilder {

    private static Map<String,Class> factoryMap = new HashMap<>();

    static {
        factoryMap.put(Constants.HUMAN_FACTORY,HumanFactory.class);
        factoryMap.put(Constants.DELAY_FACTORY,DelayHumanFactory.class);
    }

    public static AbstractHumanFactory getFactory(String factoryKey) {
        AbstractHumanFactory factory = null;
            try {
                factory = (AbstractHumanFactory) factoryMap.get(factoryKey).newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
        return factory;
    }

}
