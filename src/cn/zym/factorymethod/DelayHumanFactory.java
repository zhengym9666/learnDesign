package cn.zym.factorymethod;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName DelayHumanFactory
 * @Description TODO    延迟加载工厂类，若map中有实例，则不再创建。适用于需要限制最大实例化数量的场景
 * @Author zhengym
 * @Date 2020/4/3 12:03
 * @Version 1.0
 */
public class DelayHumanFactory extends AbstractHumanFactory{

    private static final Map<String,Human> insMap = new HashMap<>();
    private static final Map<String,Class> hmMap = new HashMap<>();

    static {
        hmMap.put(Constants.WHITE_HUMAN,WhiteHuman.class);
        hmMap.put(Constants.YELLOW_HUMAN,YellowHuman.class);
    }


    @Override
    public <T extends Human> T buildHuman(Class<T> c) {
        T human = null;
        try {
            human = (T) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return human;
    }

    public <T extends Human> T getHuman(String type){
        T human = null;
        if (insMap.containsKey(type)) {
            System.out.println("延迟加载工厂中有实例化对象，正在获取..");
            human = (T) insMap.get(type);
        }else {
            System.out.println("延迟加载工厂中没有实例对象，正在创建新的实例化对象..");
            human = (T) buildHuman(hmMap.get(type));
            insMap.put(type,human);
        }
        return human;
    }
}
