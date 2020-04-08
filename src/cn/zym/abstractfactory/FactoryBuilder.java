package cn.zym.abstractfactory;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName FactoryBuilder
 * @Description TODO    工厂创建类，返回工厂实例对象
 * @Author zhengym
 * @Date 2020/4/7 12:23
 * @Version 1.0
 */
public class FactoryBuilder {

    public  static  final Map<Class,HumanFactory> insMap = new HashMap<>();//维护一个map，使工厂实例保持是单例的

    public static <T extends HumanFactory> HumanFactory build(Class<T> _class) throws Exception {
        HumanFactory factory = null;
        if (insMap.containsKey(_class)) {
            factory = insMap.get(_class);
        } else {
            factory = (HumanFactory) Class.forName(_class.getName()).newInstance();
            insMap.put(_class,factory);
        }
        return factory;
    }

}
