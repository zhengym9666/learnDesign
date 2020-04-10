package cn.zym.proxy.ordinaryproxy;

/**
 * @ClassName OrdinaryProxy
 * @Description TODO    普通代理，代理类，被代理对象通过代理类创建
 * @Author zhengym
 * @Date 2020/4/9 15:04
 * @Version 1.0
 */
public class OrdinaryProxy  implements Subject{

    private Subject subject = null;//真实对象

    public OrdinaryProxy() {
        try {
            this.subject = new ConcreteSubject(this);
        } catch (Exception e) {
            //异常处理
        }
    }

    @Override
    public void doWork() {
        this.before();
        this.subject.doWork();
        this.after();
    }

    private void before(){
        System.out.println("代理对象预处理");
    }

    private void after() {
        System.out.println("善后处理");
    }
}
