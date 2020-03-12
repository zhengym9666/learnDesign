package cn.zym.adapter;

/**
 * @ClassName ConcreteTarget
 * @Description TODO 目标角色在原系统中的功能
 * @Author zhengym
 * @Date 2020/3/11 18:59
 * @Version 1.0
 */
public class ConcreteTarget implements Target {
    @Override
    public void operate() {
        System.out.println("我是目标角色");
    }
}
