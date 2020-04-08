package cn.zym.builder;

import cn.zym.builder.improve.DynamicSequenceController;

/**
 * @ClassName Test
 * @Description TODO    建造者模式
 * @Author zhengym
 * @Date 2020/4/7 17:36
 * @Version 1.0
 */
public class Test {

    public static void main(String[] args) throws Exception {
       /* BenzModelBuilder bmBuilder = new BenzModelBuilder();
        List<String> sequence = new ArrayList<>();
        sequence.add("start");
        sequence.add("engine boom");
        sequence.add("alarm");
        sequence.add("stop");
        bmBuilder.setSequence(sequence);
        bmBuilder.getModel().run();*/
       //引入顺序控制者对象
       SequenceController sc = new SequenceController();
       CarModel car = sc.getBenzModel1();
       car.run();
       car = sc.getBMWModerl2();
       car.run();

    }

}
