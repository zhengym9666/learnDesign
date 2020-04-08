package cn.zym.builder;

/**
 * @ClassName BMWModel
 * @Description TODO    具体宝马车模型，实现自己的特有方法
 * @Author zhengym
 * @Date 2020/4/7 17:14
 * @Version 1.0
 */
public class BMWModel extends CarModel {
    @Override
    public void start() {
        System.out.println("宝马车启动...");
    }

    @Override
    public void stop() {
        System.out.println("宝马车停止...");
    }

    @Override
    public void alarm() {
        System.out.println("宝马车报警...");
    }

    @Override
    public void enginBoom() {
        System.out.println("宝马车引擎发动...");
    }
}
