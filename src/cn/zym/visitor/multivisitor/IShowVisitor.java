package cn.zym.visitor.multivisitor;

/**
 * @ClassName IShowVisitor
 * @Description TODO    用于展示功能的访问者接口，用于封装自己的特有访问方法
 * @Author zhengym
 * @Date 2020/3/19 11:34
 * @Version 1.0
 */
public interface IShowVisitor extends IVisitor {

    public void report();

}
