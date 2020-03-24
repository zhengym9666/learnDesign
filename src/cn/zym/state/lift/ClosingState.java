package cn.zym.state.lift;

/**
 * @ClassName ClosingState
 * @Description TODO    具体关闭状态角色，实现关闭状态下可做的动作，注意切换其他状态时，该动作委托对应状态执行
 * @Author zhengym
 * @Date 2020/3/24 13:34
 * @Version 1.0
 */
public class ClosingState extends LiftState {
    //处于关闭状态可以有开启动作
    @Override
    public void open() {
        System.out.println("当前是电梯门关闭状态，开启电梯门...");
        //修改为开启状态
        super.context.setLiftState(Context.openingState);
        //委托开启状态执行开启动作
        super.context.getLiftState().open();
    }

    //调用自己的关闭动作
    @Override
    public void close() {
        System.out.println("电梯门关了，进入电梯门关闭状态...");
    }

    //处于关闭状态时，电梯可能正在运行，可以停止
    @Override
    public void stop() {
        System.out.println("当前是电梯门关闭状态，停止电梯...");
        //修改为停止状态
        super.context.setLiftState(Context.stoppingState);
        //委托停止状态执行停止动作
        super.context.getLiftState().stop();
    }

    //处于关闭状态时，电梯可能正在停止，可以上下运行
    @Override
    public void run() {
        System.out.println("当前是电梯门关闭状态，电梯上下运行...");
        //修改为运行状态
        super.context.setLiftState(Context.runningState);
        //委托运行状态执行运行动作
        super.context.getLiftState().run();
    }
}
