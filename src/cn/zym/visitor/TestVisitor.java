package cn.zym.visitor;

/**
 * @ClassName TestVisitor
 * @Description TODO
 * @Author zhengym
 * @Date 2020/3/17 18:47
 * @Version 1.0
 */
public class TestVisitor {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            Element e = ObjectStructure.createElement();
            e.accept(new Visitor());
        }
    }


}
