package cn.zym.builder;

import com.sun.deploy.util.StringUtils;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName CarModel
 * @Description TODO    抽象车模型，封装共同属性
 * @Author zhengym
 * @Date 2020/4/7 17:10
 * @Version 1.0
 */
public abstract class CarModel {

    private List<String> sequence = new ArrayList<>();

    public abstract void start();

    public abstract void stop();

    public abstract void alarm();

    public abstract void enginBoom();

    public void run(){
        for (String se:this.getSequence()) {
            if (se.equalsIgnoreCase("start")) {
                this.start();
            } else if (se.equalsIgnoreCase("stop")) {
                this.stop();
            } else if (se.equalsIgnoreCase("alarm")) {
                this.alarm();
            } else if (se.equalsIgnoreCase("engin boom")) {
                this.enginBoom();
            }
        }
    }

    public List<String> getSequence() {
        return sequence;
    }

    public void setSequence(List<String> sequence) {
        this.sequence = sequence;
    }
}
