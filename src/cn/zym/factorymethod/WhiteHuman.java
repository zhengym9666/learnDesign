package cn.zym.factorymethod;

/**
 * @ClassName WhiteHuman
 * @Description TODO
 * @Author zhengym
 * @Date 2020/4/2 18:23
 * @Version 1.0
 */
public class WhiteHuman implements Human {
    @Override
    public void skin() {
        System.out.println("肤色是白的");
    }
}
