package cn.zym.visitor;

/**
 * @ClassName IVisitor
 * @Description TODO    访问者统一接口角色，封装访问改类对象的抽象访问方法
 * @Author zhengym
 * @Date 2020/3/17 18:39
 * @Version 1.0
 */
public interface IVisitor {

    public void visit(ConcreteElement1 _element);

    public void visit(ConcreteElement2 _element);

}
