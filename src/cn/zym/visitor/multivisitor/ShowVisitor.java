package cn.zym.visitor.multivisitor;

/**
 * @ClassName ShowVisitor
 * @Description TODO    展示功能访问者的实现，分别实现访问对象的具体动作及暴露出对外界统一调用的方法
 * @Author zhengym
 * @Date 2020/3/19 11:37
 * @Version 1.0
 */
public class ShowVisitor implements IShowVisitor {

    private String info = "";

    @Override
    public void report() {
        System.out.println("员工信息如下：\n"+this.info);
    }

    @Override
    public void visit(CommonEmployee _commonEmployee) {
        this.info = this.info+getBasicInfo(_commonEmployee)+"工作："+_commonEmployee.getJob()+"\n";
    }

    @Override
    public void visit(Manager _manager) {
        this.info = this.info+getBasicInfo(_manager)+"工作："+_manager.getPerformance()+"\n";
    }

    private String getBasicInfo(Employee _employee) {
        return "姓名："+_employee.getName()+"\t"+
                "性别："+(_employee.getSex()==1?"女":"男")+"\t"+
                "薪资："+_employee.getSalary()+"\t";
    }
}
