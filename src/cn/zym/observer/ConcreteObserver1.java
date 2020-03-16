package cn.zym.observer;

/**
 * @ClassName ConcreteObserver1
 * @Description TODO 具体观察者角色，实现观察者观察到有动静之后采取的具体行动方法
 * @Author zhengym
 * @Date 2020/3/13 11:39
 * @Version 1.0
 */
public class ConcreteObserver1 implements IObserver {
    @Override
    public void update() {
        System.out.println("我是观察者李斯，观察到韩非子有动静");
    }
}
