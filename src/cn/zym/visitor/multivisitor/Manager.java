package cn.zym.visitor.multivisitor;

/**
 * @ClassName Manager
 * @Description TODO    具体经理角色，封装自己的特有属性，实现被访问时自己的逻辑
 * @Author zhengym
 * @Date 2020/3/19 11:29
 * @Version 1.0
 */
public class Manager extends Employee {

    private String performance;

    public Manager(String name, int sex, int salary, String performance) {
        super(name, sex, salary);
        this.performance = performance;
    }

    public String getPerformance() {
        return performance;
    }

    public void setPerformance(String performance) {
        this.performance = performance;
    }

    //接收访问者访问
    @Override
    public void accepet(IVisitor _visitor) {
        _visitor.visit(this);
    }
}
