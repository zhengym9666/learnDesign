package cn.zym.component;

/**
 * @ClassName Component
 * @Description TODO 抽象构件角色，定义参加组合对象的共有方法和属性，可以定义一些默认的行为或属性
 * @Author zhengym
 * @Date 2020/3/12 14:58
 * @Version 1.0
 */
public abstract class Component {

    private String name = "";
    private String position = "";
    private int salary = 0;

    public Component(String _name,String _position,int _salary) {
        this.name = _name;
        this.position = _position;
        this.salary = _salary;
    }

    public void getInfo() {
        System.out.println("姓名："+this.name+"\t"+
                            "职位："+this.position+"\t"+
                            "薪水"+this.salary+"\t");
    }



}
