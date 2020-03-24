package cn.zym.visitor;

/**
 * @ClassName ConcreteElement2
 * @Description TODO    具体被访问者角色，实现接收访问后自己的逻辑
 * @Author zhengym
 * @Date 2020/3/17 18:43
 * @Version 1.0
 */
public class ConcreteElement2 implements Element {

    @Override
    public void doSomethig() {
        System.out.println("完善业务逻辑");
    }

    @Override
    public void accept(IVisitor _visitor) {
        _visitor.visit(this);
        System.out.println("我是ConcreteElement2对象，我被访问了");
    }
}
