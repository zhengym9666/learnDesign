package cn.zym.builder.improve;

import cn.zym.builder.CarModel;

import java.util.List;

/**
 * @ClassName CarModelBuilder
 * @Description TODO    完善车模型实例化方式，以工厂模式对车模型进行实例化，根据客户端传参判断实例化哪个类
 * @Author zhengym
 * @Date 2020/4/7 17:51
 * @Version 1.0
 */
public class CarModelBuilder {

    private CarModel carModel = null;

    public <T extends CarModel> CarModelBuilder(Class<T> _class) throws Exception {
        this.carModel = (CarModel) Class.forName(_class.getName()).newInstance();
    }

    public CarModel getCarModel() {
        return this.carModel;
    }

    public void setSequence(List<String> _sequence) {
        this.carModel.setSequence(_sequence);
    }

}
