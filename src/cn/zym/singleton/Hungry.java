package cn.zym.singleton;

/**
 * @ClassName Hungry
 * @Description TODO    单例模式，内存中只有一个实例。饿汉模式，声明时已经创建好实例。线程安全
 * @Author zhengym
 * @Date 2020/4/2 17:52
 * @Version 1.0
 */
public class Hungry {

    private static final Hungry object = new Hungry();

    public static Hungry build() {
        return object;
    }

}
