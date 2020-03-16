package cn.zym.facade;

/**
 * @ClassName TestFacade
 * @Description TODO    测试门面模式
 * @Author zhengym
 * @Date 2020/3/16 13:57
 * @Version 1.0
 */
public class TestFacade {

    public static void main(String[] args) {
        //构造门面对象
        Facade facade = new Facade();
        facade.method1();
        facade.method2();
    }

}
