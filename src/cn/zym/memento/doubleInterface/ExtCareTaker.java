package cn.zym.memento.doubleInterface;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName ExtCareTaker
 * @Description TODO    备忘录管理者角色，双接口设计方式，只能访问外部接口（宽接口）Imemento
 * @Author zhengym
 * @Date 2020/3/16 18:22
 * @Version 1.0
 */
public class ExtCareTaker {

    private Map<Integer,Imemento> mementoMap = new HashMap<>();

    public void addMemento(int memId,Imemento _memento) {
        this.mementoMap.put(memId,_memento);
    }

    public Imemento getMemento(int memId) {
        return this.mementoMap.get(memId);
    }

}
