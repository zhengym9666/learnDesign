package cn.zym.observer;

/**
 * @ClassName ConcreteSubject
 * @Description TODO 具体被观察者角色，定义自己的业务逻辑，并定义自己的哪些事情需要通知观察者
 * @Author zhengym
 * @Date 2020/3/13 11:36
 * @Version 1.0
 */
public class ConcreteSubject extends Subject {

    public void doSomething() {
        String msg = "我是被观察者韩非子，我要开始做一些事了";
        System.out.println(msg);
        notifyAllObserver(msg);
    }

}
