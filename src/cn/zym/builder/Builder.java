package cn.zym.builder;

import java.util.List;

/**
 * @ClassName Builder
 * @Description TODO    抽象建造者角色，封装建造的公共方法
 * @Author zhengym
 * @Date 2020/4/8 11:18
 * @Version 1.0
 */
public interface Builder {

    public CarModel getModel();

    public void setSequence(List<String> _seq);

}
