package cn.zym.proxy;

/**
 * @ClassName Proxy
 * @Description TODO    代理角色
 * @Author zhengym
 * @Date 2020/4/8 18:36
 * @Version 1.0
 */
public class Proxy implements Subject{

    private Subject subject = null;

    public Proxy(Subject _object) {
        this.subject = _object;
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
