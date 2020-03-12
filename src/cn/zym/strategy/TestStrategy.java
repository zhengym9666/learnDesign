package cn.zym.strategy;

/**
 * @ClassName TestStrategy
 * @Description TODO 测试策略模式
 * @Author zhengym
 * @Date 2020/3/11 16:05
 * @Version 1.0
 */
public class TestStrategy {

    public static void main(String[] args) {
        Context context = new Context(new ConcreteStrategy1());
        context.operate();
        context = new Context(new ConcreteStrategy2());
        context.operate();
        System.out.println("测试策略模式完成");
    }

}
