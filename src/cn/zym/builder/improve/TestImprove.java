package cn.zym.builder.improve;

import cn.zym.builder.BenzModel;

/**
 * @ClassName TestImprove
 * @Description TODO    建造者模式结合工厂模式
 * @Author zhengym
 * @Date 2020/4/7 18:07
 * @Version 1.0
 */
public class TestImprove {

    public static void main(String[] args) throws Exception {
        //将建造者创建模型改为工厂模式生产实例
        DynamicSequenceController dsc = new DynamicSequenceController(BenzModel.class);
        dsc.getBenzModel1().run();
    }

}
