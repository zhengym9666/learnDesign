package cn.zym.memento.doubleInterface;

import cn.zym.memento.Memento;

/**
 * @ClassName TestExtMemento
 * @Description TODO
 * @Author zhengym
 * @Date 2020/3/16 18:24
 * @Version 1.0
 */
public class TestExtMemento {

    public static void main(String[] args) throws Exception {
        ExtOriginator exto = new ExtOriginator("1","2","3");
        System.out.println("第一个值："+exto);
        Imemento memento = exto.createMemento();
        ExtCareTaker extCareTaker = new ExtCareTaker();
        extCareTaker.addMemento(1,memento);
        exto.setState1("11");
        System.out.println("第二个值："+exto);
        exto.restoreProp(extCareTaker.getMemento(1));
        System.out.println("从备份1中备份出来的值："+exto);
    }

}
