package cn.zym.builder.improve;

import cn.zym.builder.CarModel;
import cn.zym.builder.improve.CarModelBuilder;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName DynamicSequenceController
 * @Description TODO    完善的顺序控制者角色，内部维护的建造者对象类似于动态工厂，构造函数是根据参数进行实例化的
 * @Author zhengym
 * @Date 2020/4/7 17:58
 * @Version 1.0
 */
public class DynamicSequenceController {

    List<String> sequence = new ArrayList<>();

    private CarModelBuilder carBuilder = null;

    public DynamicSequenceController(Class _carClass) throws Exception {
        this.carBuilder = new CarModelBuilder(_carClass);
    }

    public CarModel getBenzModel1() {
        this.sequence.clear();
        this.sequence.add("start");
        this.sequence.add("stop");
        carBuilder.setSequence(this.sequence);
        return carBuilder.getCarModel();
    }

    public CarModel getBenzModel2() {
        this.sequence.clear();
        this.sequence.add("start");
        this.sequence.add("engine boom");
        this.sequence.add("alarm");
        carBuilder.setSequence(this.sequence);
        return carBuilder.getCarModel();
    }

    public CarModel getBMWModerl1() {
        this.sequence.clear();
        this.sequence.add("start");
        this.sequence.add("alarm");
        carBuilder.setSequence(this.sequence);
        return carBuilder.getCarModel();
    }

    public CarModel getBMWModerl2() {
        this.sequence.clear();
        this.sequence.add("alarm");
        this.sequence.add("stop");
        carBuilder.setSequence(this.sequence);
        return carBuilder.getCarModel();
    }

}
