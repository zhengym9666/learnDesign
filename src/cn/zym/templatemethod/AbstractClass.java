package cn.zym.templatemethod;

/**
 * @ClassName AbstractClass
 * @Description TODO    模板方法模式的模板类，将子类的公用方法抽象到该类中，基本方法的访问权限设置为protected
 * @Author zhengym
 * @Date 2020/4/3 15:05
 * @Version 1.0
 */
public abstract class AbstractClass {

    protected abstract void method1();

    protected  abstract void mthod2();

    public void run(){
        this.method1();
        this.mthod2();
    }

}
