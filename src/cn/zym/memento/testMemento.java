package cn.zym.memento;

/**
 * @ClassName testMemento
 * @Description TODO    测试备忘录模式
 * @Author zhengym
 * @Date 2020/3/16 18:09
 * @Version 1.0
 */
public class testMemento {

    public static void main(String[] args) throws Exception{
        Originator o = new Originator("1","2","3");
        System.out.println("第一个值："+o);
        Memento memento = o.createMemento();
        CareTaker careTaker = new CareTaker();
        careTaker.addMemento(1,memento);
        o.setState1("11");
        System.out.println("第二个值："+o);
        memento = o.createMemento();
        careTaker.addMemento(2,memento);
        o.setState1("111");
        System.out.println("第三个值："+o);
        o.restoreProp(careTaker.getMemento(1));
        System.out.println("从备份1中备份出来的值："+o);
        o.restoreProp(careTaker.getMemento(2));
        System.out.println("从备份2中备份出来的值："+o);

    }

}
