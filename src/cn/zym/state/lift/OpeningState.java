package cn.zym.state.lift;

/**
 * @ClassName OpeningState
 * @Description TODO    具体打开状态角色，实现打开状态下可做的动作，注意切换其他状态时，该动作委托对应状态执行
 * @Author zhengym
 * @Date 2020/3/24 13:31
 * @Version 1.0
 */
public class OpeningState extends LiftState {
//    调用自己的开启动作
    @Override
    public void open() {
        System.out.println("电梯门开了，进入电梯门开启状态...");
    }

    //处于开启状态可以有关闭动作
    @Override
    public void close() {
        System.out.println("当前是电梯门开启状态，电梯门关闭了..");
        //修改为关闭状态
        super.context.setLiftState(Context.closingState);
        //委托关闭状态执行关闭动作
        super.context.getLiftState().close();
    }

    //处于开启状态没有停止动作
    @Override
    public void stop() {

    }

    //处于开启状态电梯不能上下运行
    @Override
    public void run() {

    }
}
