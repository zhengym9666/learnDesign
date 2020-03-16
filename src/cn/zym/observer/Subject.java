package cn.zym.observer;

import java.util.Vector;

/**
 * @ClassName Subject
 * @Description TODO 抽象被观察者角色，用于管理观察者和通知观察者，观察者模式的核心：被观察者对象中封装和管理自己的观察对象
 * @Author zhengym
 * @Date 2020/3/13 11:26
 * @Version 1.0
 */
public abstract class Subject {

    Vector<IObserver> obsVector = new Vector<>();

    public void addObserver(IObserver _observer) {
        this.obsVector.add(_observer);
    }

    public void removeObserver(IObserver _observer) {
        this.obsVector.remove(_observer);
    }

    public void notifyAllObserver(String msg) {
        for (IObserver obs:obsVector) {
            obs.update();
        }
    }

}
