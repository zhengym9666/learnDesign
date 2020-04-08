package cn.zym.builder;

import java.util.List;

/**
 * @ClassName BMWModelBuilder
 * @Description TODO    奔驰车创建者，负责实例化奔驰车模型，设置方法执行顺序
 * @Author zhengym
 * @Date 2020/4/7 17:35
 * @Version 1.0
 */
public class BMWModelBuilder implements Builder{

    private BMWModel bmwModel = new BMWModel();

    public BMWModel getModel(){
        return this.bmwModel;
    }

    public void setSequence(List<String> _seq) {
        this.bmwModel.setSequence(_seq);
    }

}
