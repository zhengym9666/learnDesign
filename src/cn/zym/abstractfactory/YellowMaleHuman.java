package cn.zym.abstractfactory;

/**
 * @ClassName YellowMaleHuman
 * @Description TODO    具体产品，实现特有属性
 * @Author zhengym
 * @Date 2020/4/7 12:04
 * @Version 1.0
 */
public class YellowMaleHuman extends AbstractYellowHuman {
    @Override
    public void sex() {
        System.out.println("黄种人男孩...");
    }
}
