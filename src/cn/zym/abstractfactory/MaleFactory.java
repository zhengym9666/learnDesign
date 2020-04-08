package cn.zym.abstractfactory;

/**
 * @ClassName MaleFactory
 * @Description TODO    产品工厂类，实现产品对象的创建
 * @Author zhengym
 * @Date 2020/4/7 12:10
 * @Version 1.0
 */
public class MaleFactory implements HumanFactory {
    @Override
    public Human createWhiteHuman() {
        return new WhiteMaleHuman();
    }

    @Override
    public Human createYellowHuman() {
        return new YellowMaleHuman();
    }
}
