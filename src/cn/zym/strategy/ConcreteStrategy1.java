package cn.zym.strategy;

/**
 * @ClassName ConcreteStrategy1
 * @Description TODO 具体策略角色
 * @Author zhengym
 * @Date 2020/3/11 15:58
 * @Version 1.0
 */
public class ConcreteStrategy1 implements IStrategy {
    @Override
    public void operate() {
        System.out.println("我是策略者1号");
    }
}
