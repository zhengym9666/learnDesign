package cn.zym.memento;

/**
 * @ClassName Originator
 * @Description TODO    备忘录发起人角色，决定备忘录的创建和恢复备忘录
 * @Author zhengym
 * @Date 2020/3/16 17:29
 * @Version 1.0
 */
public class Originator {

    private String state1 = "";
    private String state2 = "";
    private String state3 = "";

    public Originator(String state1, String state2, String state3) {
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

    public void restoreProp(Memento _mememto) throws Exception {
        BeanUtils.restoreProp(this,_mememto.getStateMap());
    }
}
