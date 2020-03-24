package cn.zym.state.lift;

/**
 * @ClassName StoppingState
 * @Description TODO    具体停止状态角色，实现停止状态下可做的动作，注意切换其他状态时，该动作委托对应状态执行
 * @Author zhengym
 * @Date 2020/3/24 13:38
 * @Version 1.0
 */
public class StoppingState extends LiftState {
    //处于停止状态，可以打开电梯门
    @Override
    public void open() {
        System.out.println("当前是停止状态，电梯门打开了...");
        //修改为打开状态
        super.context.setLiftState(Context.openingState);
        //委托打开状态执行打开动作
        super.context.getLiftState().open();
    }

    //处于停止状态，可以关闭电梯门
    @Override
    public void close() {
        System.out.println("当前是停止状态，电梯门关了...");
        //修改为关闭状态
        super.context.setLiftState(Context.closingState);
        //委托关闭状态执行关闭动作
        super.context.getLiftState().close();
    }

    //执行自己的停止动作
    @Override
    public void stop() {
        System.out.println("电梯停止了，进入电梯停止状态...");
    }

    //处于停止状态，可以运行电梯
    @Override
    public void run() {
        System.out.println("当前是电梯停止状态");
        //修改为运行状态
        super.context.setLiftState(Context.runningState);
        //委托运行状态执行运行动作
        super.context.getLiftState().run();
    }
}
