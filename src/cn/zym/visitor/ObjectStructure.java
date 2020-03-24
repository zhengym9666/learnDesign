package cn.zym.visitor;

import java.util.Random;

/**
 * @ClassName ObjectStructure
 * @Description TODO    生产对象
 * @Author zhengym
 * @Date 2020/3/17 18:41
 * @Version 1.0
 */
public class ObjectStructure {

    public static Element createElement() {
        Random random = new Random();
        if (random.nextInt(100)>50) {
            return new ConcreteElement1();
        } else {
            return new ConcreteElement2();
        }
    }

}
