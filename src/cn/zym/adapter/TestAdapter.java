package cn.zym.adapter;

/**
 * @ClassName TestAdapter
 * @Description TODO
 * @Author zhengym
 * @Date 2020/3/11 19:02
 * @Version 1.0
 */
public class TestAdapter {

    public static void main(String[] args) {
        Target target1 = new ConcreteTarget();
        target1.operate();
        Target target2 = new Adapter();
        target2.operate();
    }

}
