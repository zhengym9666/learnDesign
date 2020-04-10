package cn.zym.proxy.forceproxy;

/**
 * @ClassName ForceProxy
 * @Description TODO 强制代理，代理类，与真实对象实现同一个接口，内部封装真实对象，代理真实对象执行
 * @Author zhengym
 * @Date 2020/4/9 15:23
 * @Version 1.0
 */
public class ForceProxy implements Subject {

    private Subject subject;

    public ForceProxy(Subject _subject) {
        this.subject = _subject;
    }

    @Override
    public void doWork() {
        before();
        this.subject.doWork();
        after();
    }

    private void before() {
        System.out.println("预处理...");
    }

    private void after() {
        System.out.println("善后处理");
    }
}
