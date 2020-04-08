package cn.zym.abstractfactory;

/**
 * @ClassName YellowFemaleHuman
 * @Description TODO    具体产品，实现特有属性
 * @Author zhengym
 * @Date 2020/4/7 12:05
 * @Version 1.0
 */
public class YellowFemaleHuman extends AbstractYellowHuman {
    @Override
    public void sex() {
        System.out.println("黄种人女孩...");
    }
}
