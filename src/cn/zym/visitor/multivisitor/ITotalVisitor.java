package cn.zym.visitor.multivisitor;

/**
 * @Author zhengym
 * @Description //TODO  用于计算功能的访问者接口，用于封装自己的特有访问方法
 * @Date 2020/3/19 12:08
 * @Param
 * @return
 **/
public interface ITotalVisitor extends IVisitor {

    public void total();

}
