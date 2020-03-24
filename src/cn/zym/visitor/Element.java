package cn.zym.visitor;

/**
 * @ClassName Element
 * @Description TODO    抽象被访问者元素，封装被访问对象共有属性及接受访问的共同方法
 * @Author zhengym
 * @Date 2020/3/17 18:37
 * @Version 1.0
 */
public interface Element {

    public void doSomethig();
    public void accept(IVisitor _visitor);

}
