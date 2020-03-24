package cn.zym.state;

/**
 * @ClassName ConcreteState1
 * @Description TODO    具体状态对象角色，实现切换到自己状态时执行的动作，要切换其他状态时，注意是委托其他状态去执行响应的动作
 * @Author zhengym
 * @Date 2020/3/24 14:43
 * @Version 1.0
 */
public class ConcreteState1 extends State {
    @Override
    public void operate1() {
        System.out.println("状态1执行自己的动作,不切换其他状态");
    }

    @Override
    public void operate2() {
        System.out.println("切换到状态2");
        //修改状态
        this.context.setState(Context.concreteState2);
        //过渡到状态2，由context实现
        this.context.operate2();
    }
}
