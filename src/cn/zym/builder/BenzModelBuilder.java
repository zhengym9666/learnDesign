package cn.zym.builder;

import java.util.List;

/**
 * @ClassName BenzModelBuilder
 * @Description TODO    奔驰车创建者，负责实例化奔驰车模型，设置方法执行顺序
 * @Author zhengym
 * @Date 2020/4/7 17:15
 * @Version 1.0
 */
public class BenzModelBuilder implements Builder {

    private BenzModel benzModel = new BenzModel();

    public BenzModel getModel(){
        return this.benzModel;
    }

    public void setSequence(List<String> _seq) {
        this.benzModel.setSequence(_seq);
    }

}
