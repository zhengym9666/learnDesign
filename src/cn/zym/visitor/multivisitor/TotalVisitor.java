package cn.zym.visitor.multivisitor;

/**
 * @ClassName TotalVisitor
 * @Description TODO    计算功能访问者的实现，实现访问对象后的具体动作以及提供外界统一调用的方法
 * @Author zhengym
 * @Date 2020/3/19 11:44
 * @Version 1.0
 */
public class TotalVisitor implements ITotalVisitor {

    private final static int COMMEMPLOYEE_EFFICIENT = 2;
    private final static int MANAGER_EFFICIENT = 5;
    private int totalSalary;

    @Override
    public void total() {
        System.out.println("员工薪资总数：\n"+this.totalSalary);
    }

    @Override
    public void visit(CommonEmployee _commonEmployee) {
        this.totalSalary = this.totalSalary+_commonEmployee.getSalary()+_commonEmployee.getSalary()*COMMEMPLOYEE_EFFICIENT;
    }

    @Override
    public void visit(Manager _manager) {
        this.totalSalary = this.totalSalary+_manager.getSalary()+_manager.getSalary()*MANAGER_EFFICIENT;
    }
}
