package cn.zym.strategy;


/**
 * @ClassName ConcreteStrategy2
 * @Description TODO 具体策略角色
 * @Author zhengym
 * @Date 2020/3/11 16:02
 * @Version 1.0
 */
public class ConcreteStrategy2 implements IStrategy {
    @Override
    public void operate() {
        System.out.println("我是策略者2号");
    }
}
