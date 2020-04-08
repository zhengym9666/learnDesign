package cn.zym.builder;

/**
 * @ClassName BenzModel
 * @Description TODO    具体奔驰车模型，实现自己的特有方法
 * @Author zhengym
 * @Date 2020/4/7 17:12
 * @Version 1.0
 */
public class BenzModel extends CarModel {
    @Override
    public void start() {
        System.out.println("奔驰车启动...");
    }

    @Override
    public void stop() {
        System.out.println("奔驰车停止...");
    }

    @Override
    public void alarm() {
        System.out.println("奔驰车报警...");
    }

    @Override
    public void enginBoom() {
        System.out.println("奔驰车引擎发动...");
    }

}
