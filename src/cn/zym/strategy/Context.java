package cn.zym.strategy;


/**
 * @ClassName Context
 * @Description TODO 封装角色，借用代理模式的思路
 * @Author zhengym
 * @Date 2020/3/11 16:02
 * @Version 1.0
 */
public class Context {
    IStrategy strategy = null;

    public Context(IStrategy _strategy) {
        this.strategy = _strategy;
    }

    public void operate() {
        this.strategy.operate();
    }

}
