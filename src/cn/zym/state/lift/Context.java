package cn.zym.state.lift;

/**
 * @ClassName Context
 * @Description TODO    封装所有的状态对象，控制状态的切换以及提供状态动作的调用入口
 * @Author zhengym
 * @Date 2020/3/24 12:43
 * @Version 1.0
 */
public class Context {

    public static final OpeningState openingState = new OpeningState();
    public static final ClosingState closingState = new ClosingState();
    public static final StoppingState stoppingState = new StoppingState();
    public static final RunningState runningState = new RunningState();
    private LiftState liftState;

    public void setLiftState(LiftState _liftState) {
        this.liftState = _liftState;
        //将当前环境通知各个实现类中
        this.liftState.setContext(this);
    }

    public LiftState getLiftState() {
        return liftState;
    }

    public void open() {
        this.liftState.open();
    }

    public void close() {
        this.liftState.close();
    }

    public void stop() {
        this.liftState.stop();
    }

    public void run() {
        this.liftState.run();
    }

}
