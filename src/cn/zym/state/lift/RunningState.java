package cn.zym.state.lift;

/**
 * @ClassName RunningState
 * @Description TODO    具体运行状态角色，实现运行状态下可做的动作，注意切换其他状态时，该动作委托对应状态执行
 * @Author zhengym
 * @Date 2020/3/24 13:43
 * @Version 1.0
 */
public class RunningState extends LiftState {
    //处于运行状态，不能打开电梯门
    @Override
    public void open() {

    }

    //处于运行状态，不能关闭电梯门
    @Override
    public void close() {

    }

    //处于运行状态，可以停止
    @Override
    public void stop() {
        System.out.println("当前是运行状态，电梯停止了...");
        //修改为停止状态
        super.context.setLiftState(Context.stoppingState);
        //委托停止状态执行停止动作
        super.context.getLiftState().stop();
    }

    //执行自己的运行动作
    @Override
    public void run() {
        System.out.println("电梯上下运行，进入运行状态...");
    }
}
