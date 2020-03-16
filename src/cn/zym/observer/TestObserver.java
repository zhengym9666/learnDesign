package cn.zym.observer;

/**
 * @ClassName TestObserver
 * @Description TODO 测试观察者模式
 * @Author zhengym
 * @Date 2020/3/13 11:42
 * @Version 1.0
 */
public class TestObserver {

    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        //准备观察者
        ConcreteObserver1 observer1 = new ConcreteObserver1();
        ConcreteObserver2 observer2 = new ConcreteObserver2();
        //被观察者添加需要观察自己的观察者
        subject.addObserver(observer1);
        subject.addObserver(observer2);
        //观察者开始搞事
        subject.doSomething();
    }

}
