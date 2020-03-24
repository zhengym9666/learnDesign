package cn.zym.visitor.multivisitor;

/**
 * @ClassName Employee
 * @Description TODO    抽象员工角色，封装共同属性和接收访问的抽象方法
 * @Author zhengym
 * @Date 2020/3/19 11:26
 * @Version 1.0
 */
public abstract class Employee {

    private String name;
    private int sex;
    private int salary;

    public Employee(String name, int sex, int salary) {
        this.name = name;
        this.sex = sex;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public abstract void accepet(IVisitor _visitor);
}
