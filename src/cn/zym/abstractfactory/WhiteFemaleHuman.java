package cn.zym.abstractfactory;

/**
 * @ClassName WhiteFemaleHuman
 * @Description TODO    具体产品，实现特有属性
 * @Author zhengym
 * @Date 2020/4/7 11:58
 * @Version 1.0
 */
public class WhiteFemaleHuman extends AbstractWhiteHuman {
    @Override
    public void sex() {
        System.out.println("白种人女孩...");
    }
}
