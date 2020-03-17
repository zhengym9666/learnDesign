package cn.zym.memento;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName CareTaker
 * @Description TODO    备忘录管理者角色，维护map变量，支持多备忘录存储
 * @Author zhengym
 * @Date 2020/3/16 17:33
 * @Version 1.0
 */
public class CareTaker {

    private  Map<Integer,Memento> mementoMap = new HashMap<>();

    public void addMemento(int memId,Memento _memento) {
        this.mementoMap.put(memId,_memento);
    }

    public Memento getMemento(int memId) {
        return this.mementoMap.get(memId);
    }
}
