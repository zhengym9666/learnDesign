package cn.zym.state;

/**
 * @ClassName Context
 * @Description TODO    环境对象角色，封装所有的状态对象，切换状态，提供引起状态变化的动作调用方法
 * @Author zhengym
 * @Date 2020/3/24 14:34
 * @Version 1.0
 */
public class Context {

    public static final ConcreteState1 concreteState1 = new ConcreteState1();
    public static final ConcreteState2 concreteState2 = new ConcreteState2();

    private State state;
    public void setState(State _state) {
        //切换状态
        this.state = _state;
        //修改状态对象的环境对象
        this.state.setContext(this);
    }

    public State getState(){
        return state;
    }

    public void operate1() {
        this.state.operate1();
    }

    public void operate2() {
        this.state.operate2();
    }
}
