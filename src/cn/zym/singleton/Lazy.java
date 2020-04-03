package cn.zym.singleton;

/**
 * @ClassName Lazy
 * @Description TODO    单例模式，内存中只有一个实例。懒汉模式，需要对象时才创建,线程不安全
 * @Author zhengym
 * @Date 2020/4/2 17:49
 * @Version 1.0
 */
public class Lazy {

    private static Lazy object = null;

    public static Lazy build() {
        if (object==null) {
            object = new Lazy();
        }
        return object;
    }

    //解决线程安全
    public static synchronized Lazy getInstance(){
        if (object==null) {
            object = new Lazy();
        }
        return object;
    }

}
