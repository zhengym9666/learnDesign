package cn.zym.memento.doubleInterface;

import cn.zym.memento.BeanUtils;

import java.util.Map;

/**
 * @ClassName ExtOriginator
 * @Description TODO    备忘录发起人角色，双接口设计方式，备忘录角色作为内部类较为安全，其属性只能由备忘录发起人访问，外界无法访问
 * @Author zhengym
 * @Date 2020/3/16 18:18
 * @Version 1.0
 */
public class ExtOriginator {

    private String state1 = "";
    private String state2 = "";
    private String state3 = "";

    public ExtOriginator(String state1, String state2, String state3) {
        this.state1 = state1;
        this.state2 = state2;
        this.state3 = state3;
    }

    public String getState1() {
        return state1;
    }

    public void setState1(String state1) {
        this.state1 = state1;
    }

    public String getState2() {
        return state2;
    }

    public void setState2(String state2) {
        this.state2 = state2;
    }

    public String getState3() {
        return state3;
    }

    public void setState3(String state3) {
        this.state3 = state3;
    }

    @Override
    public String toString() {
        return "Originator{" +
                "state1='" + state1 + '\'' +
                ", state2='" + state2 + '\'' +
                ", state3='" + state3 + '\'' +
                '}';
    }

    public Memento createMemento() throws Exception {
        return new Memento(BeanUtils.backupProp(this));
    }

    public void restoreProp(Imemento _mememto) throws Exception {
        //外界只能访问Imemento，因此内部应该进行强转
        BeanUtils.restoreProp(this, ((Memento) _mememto).getStateMap());
    }

    /**
     * @Author zhengym
     * @Description //TODO  内部备忘录角色，提供给备忘录发起人的内部访问，外界无法访问
     * @Date 2020/3/17 11:41
     * @Param
     * @return
     **/
    private class Memento implements Imemento {
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

}
