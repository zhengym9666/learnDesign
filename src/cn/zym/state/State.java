package cn.zym.state;

/**
 * @ClassName State
 * @Description TODO    抽象状态对象角色，封装状态动作的共用抽象方法，封装当前状态的环境信息
 * @Author zhengym
 * @Date 2020/3/24 14:35
 * @Version 1.0
 */
public abstract class State {

    public Context context;
    public void setContext(Context _context) {
        this.context = _context;
    }

    public abstract void operate1();

    public abstract void operate2();

}
