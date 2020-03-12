package cn.zym.adapter;

/**
 * @ClassName Adapter
 * @Description TODO 适配器模式的核心角色，其他两个角色都是已经存在的角色，而适配器角色是需要新建立的，它的职责非常简单：把源角色转换为目标角色，怎么转换？通过继承或是类关联的方式。
 * @Author zhengym
 * @Date 2020/3/11 19:00
 * @Version 1.0
 */
public class Adapter extends Origin implements Target {
    /**
     * @Author zhengym
     * @Description //TODO 目标角色在新系统中的功能，在不影响源角色功能的前提下，对源角色新增了额外的功能。
     * @Date 2020/3/12 12:24
     * @Param []
     * @return void
     **/
    @Override
    public void operate() {
        System.out.println("经适配器改装后的角色");
        super.orginOperate();
    }
}
