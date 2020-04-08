package cn.zym.abstractfactory;

/**
 * @ClassName WhiteMaleHuman
 * @Description TODO    具体产品，实现特有属性
 * @Author zhengym
 * @Date 2020/4/7 12:02
 * @Version 1.0
 */
public class WhiteMaleHuman extends AbstractWhiteHuman {
    @Override
    public void sex() {
        System.out.println("白种人男孩...");
    }
}
