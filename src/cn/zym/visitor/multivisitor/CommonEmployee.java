package cn.zym.visitor.multivisitor;

/**
 * @ClassName CommonEmployee
 * @Description TODO    具体普通员工角色，封装自己的特有属性，实现被访问时自己的逻辑
 * @Author zhengym
 * @Date 2020/3/19 11:27
 * @Version 1.0
 */
public class CommonEmployee extends Employee {

    private String job;


    public CommonEmployee(String name, int sex, int salary, String job) {
        super(name, sex, salary);
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    //接收访问者访问
    @Override
    public void accepet(IVisitor _visitor) {
        _visitor.visit(this);
    }
}
