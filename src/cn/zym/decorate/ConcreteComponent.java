package cn.zym.decorate;

/**
 * @ClassName ConcreteComponent
 * @Description TODO  被修饰的对象，要继承或实现最原始的Component
 * @Author zhengym
 * @Date 2020/3/10 17:39
 * @Version 1.0
 */
public class ConcreteComponent extends Component {

    @Override
    public void operate() {
        System.out.println("我是被装饰的对象，这是我的操作");
    }

}
