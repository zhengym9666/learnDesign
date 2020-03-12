package cn.zym.component;

import java.util.List;

/**
 * @ClassName TestComponent
 * @Description TODO 测试组合模式
 * @Author zhengym
 * @Date 2020/3/12 15:09
 * @Version 1.0
 */
public class TestComponent {

    public static void main(String[] args) {
        //组装树形结构
        Branch root = new Branch("老王","总经理",30000);
        Branch branch1 = new Branch("老赵","研发总监",20000);
        Branch branch2 = new Branch("老林","销售总监",20000);
        Branch branch1_1 = new Branch("老李","研发组长1",15000);
        Branch branch1_2 = new Branch("老郑","研发组长2",15000);
        Leaf leaf1 = new Leaf("老肖","秘书",2000);
        Leaf leaf2 = new Leaf("老苏","开发小兵1",4000);
        Leaf leaf3 = new Leaf("老游","开发小兵2",5000);
        Leaf leaf6 = new Leaf("老苏2","开发小兵1",4000);
        Leaf leaf7 = new Leaf("老游2","开发小兵2",5000);
        Leaf leaf4 = new Leaf("老刘","销售小兵1",2000);
        Leaf leaf5 = new Leaf("老黄","销售小兵2",3000);
        branch1_1.addChild(leaf2);
        branch1_1.addChild(leaf3);
        branch1_2.addChild(leaf6);
        branch1_2.addChild(leaf7);
        branch1.addChild(branch1_1);
        branch1.addChild(branch1_2);
        branch2.addChild(leaf4);
        branch2.addChild(leaf5);
        root.addChild(branch1);
        root.addChild(branch2);
        root.addChild(leaf1);

        root.getInfo();//根节点信息
        //遍历树形节点
        getTreeInfo(root);
    }

    public static void getTreeInfo(Branch root) {
        List<Component> subOrdinateChild = root.getChildren();
        for (Component c:subOrdinateChild) {
            if (c instanceof Leaf) {
                c.getInfo();//叶子节点
            } else{
                c.getInfo();
                getTreeInfo((Branch) c);//树枝节点
            }
        }

    }

}
