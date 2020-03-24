package cn.zym.visitor;

/**
 * @ClassName Visitor
 * @Description TODO    具体访问者，实现访问改类对象后的具体动作
 * @Author zhengym
 * @Date 2020/3/17 18:39
 * @Version 1.0
 */
public class Visitor implements IVisitor {


    @Override
    public void visit(ConcreteElement1 _element) {
        System.out.println("开始访问ConcreteElement1对象...对被访问对象进行一系列操作");
    }

    @Override
    public void visit(ConcreteElement2 _element) {
        System.out.println("开始访问ConcreteElement2对象...对被访问对象进行一系列操作");
    }
}
