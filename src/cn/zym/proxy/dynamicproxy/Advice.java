package cn.zym.proxy.dynamicproxy;

/**
 * @ClassName Advice
 * @Description TODO
 * @Author zhengym
 * @Date 2020/4/9 18:35
 * @Version 1.0
 */
public class Advice implements IAdvice {
    @Override
    public void exec() {
        System.out.println("执行前置通知...");
    }
}
