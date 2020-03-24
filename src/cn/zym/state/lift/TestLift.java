package cn.zym.state.lift;

/**
 * @ClassName TestLift
 * @Description TODO    测试状态模式，对外调用时只展示了动作的变化，而状态的变化不会显式暴露出来
 * @Author zhengym
 * @Date 2020/3/24 14:12
 * @Version 1.0
 */
public class TestLift {

    public static void main(String[] args) {
        Context context = new Context();
        context.setLiftState(new StoppingState());
        context.open();//打开电梯门，放人进来
        context.close();//人进来之后，关电梯门
        context.run();//电梯上下运行
        context.stop();//电梯停止
    }

}
