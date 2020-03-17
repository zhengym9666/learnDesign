package cn.zym.memento;

import java.util.Map;

/**
 * @ClassName Memento
 * @Description TODO    备忘录角色，维护Map，支持多状态的备忘录模式
 * @Author zhengym
 * @Date 2020/3/16 17:31
 * @Version 1.0
 */
public class Memento {

    private Map<String,Object> stateMap;

    public Memento(Map<String, Object> stateMap) {
        this.stateMap = stateMap;
    }

    public Map<String, Object> getStateMap() {
        return stateMap;
    }

    public void setStateMap(Map<String, Object> stateMap) {
        this.stateMap = stateMap;
    }
}
