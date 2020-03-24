package cn.zym.state.lift;

/**
 * @ClassName LiftState
 * @Description TODO   抽象状态对象角色，封装状态的公共动作方法，封装自己的环境对象
 * @Author zhengym
 * @Date 2020/3/24 12:43
 * @Version 1.0
 */
public abstract class LiftState {

    public Context context;
    //封装当前状态所在环境信息
    public void setContext(Context _context) {
        this.context = _context;
    }

    public abstract void open();

    public abstract void close();

    public abstract void stop();

    public abstract void run();

}
