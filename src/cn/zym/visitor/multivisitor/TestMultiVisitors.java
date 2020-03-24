package cn.zym.visitor.multivisitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName TestMultiVisitors
 * @Description TODO    多访问者模式，一个对象可以被多个访问者访问，访问者最终可以统一输出结果
 * @Author zhengym
 * @Date 2020/3/19 11:51
 * @Version 1.0
 */
public class TestMultiVisitors {

    public static void main(String[] args) {
        //构造被访问对象
        List<Employee> employees = new ArrayList<>();
        employees.add(new CommonEmployee("张三",2,5000,"代码搬运工"));
        employees.add(new CommonEmployee("李四",2,6900,"中级代码搬运工"));
        employees.add(new CommonEmployee("赵六",1,4500,"测试大神"));
        employees.add(new Manager("老王",2,9000,"啥也不会，但是会拍马屁"));
        //构造访问者
        ShowVisitor showVisitor = new ShowVisitor();
        TotalVisitor totalVisitor = new TotalVisitor();
        //访问者去访问对象
        for (Employee e:employees) {
            e.accepet(showVisitor);
            e.accepet(totalVisitor);
        }
        //执行访问者最终结果
        showVisitor.report();
        totalVisitor.total();
    }

}
