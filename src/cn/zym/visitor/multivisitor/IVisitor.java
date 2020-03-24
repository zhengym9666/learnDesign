package cn.zym.visitor.multivisitor;

/**
 * @ClassName IVisitor
 * @Description TODO    顶级访问者接口，封装该类访问者会访问的Employee类对象的共同访问方法
 * @Author zhengym
 * @Date 2020/3/19 11:23
 * @Version 1.0
 */
public interface IVisitor {

    public void visit(CommonEmployee _commonEmployee);

    public void visit(Manager _manager);

}
