package cn.zym.decorate;

/**
 * @ClassName Decorator
 * @Description TODO  接口或抽象类，内部有一个private变量封装了Component对象，用于委托该对象执行它自己的方法
 * @Author zhengym
 * @Date 2020/3/10 17:55
 * @Version 1.0
 */
public abstract class Decorator extends Component{

    private Component component = null;

    public Decorator(Component _component) {
        this.component = _component;
    }

    public void decorate() {
        System.out.println("装饰完后，执行对象自己本身的操作");
        //委托给被修饰者执行
        this.component.operate();
    }

}
