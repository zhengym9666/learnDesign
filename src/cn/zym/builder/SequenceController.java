package cn.zym.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName SequenceController
 * @Description TODO    控制方法（事件）执行顺序的控制者角色，每种顺序返回相应对象
 * @Author zhengym
 * @Date 2020/4/7 17:42
 * @Version 1.0
 */
public class SequenceController {

    List<String> sequence = new ArrayList<>();

    /*private BenzModelBuilder bmBuilder = new BenzModelBuilder();
    private BMWModelBuilder bwBuilder = new BMWModelBuilder();*/
    private Builder bmBuilder = new BenzModelBuilder();
    private Builder bwBuilder = new BMWModelBuilder();

    public CarModel getBenzModel1() {
        this.sequence.clear();
        this.sequence.add("start");
        this.sequence.add("stop");
        bmBuilder.setSequence(this.sequence);
        return bmBuilder.getModel();
    }

    public CarModel getBenzModel2() {
        this.sequence.clear();
        this.sequence.add("start");
        this.sequence.add("engine boom");
        this.sequence.add("alarm");
        bmBuilder.setSequence(this.sequence);
        return bmBuilder.getModel();
    }

    public CarModel getBMWModerl1() {
        this.sequence.clear();
        this.sequence.add("start");
        this.sequence.add("alarm");
        bwBuilder.setSequence(this.sequence);
        return bwBuilder.getModel();
    }

    public CarModel getBMWModerl2() {
        this.sequence.clear();
        this.sequence.add("alarm");
        this.sequence.add("stop");
        bwBuilder.setSequence(this.sequence);
        return bwBuilder.getModel();
    }

}
