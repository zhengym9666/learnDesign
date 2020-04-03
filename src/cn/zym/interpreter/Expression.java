package cn.zym.interpreter;

import java.util.Map;

/**
 * @ClassName Expression
 * @Description TODO
 * @Author zhengym
 * @Date 2020/3/31 11:37
 * @Version 1.0
 */
public abstract class Expression {

    public abstract int interpreter(Map<String,Integer> var);

}
