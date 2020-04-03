package cn.zym.interpreter;

import java.util.Map;

/**
 * @ClassName VarExpression
 * @Description TODO
 * @Author zhengym
 * @Date 2020/3/31 11:39
 * @Version 1.0
 */
public class VarExpression extends Expression {

    private String key;

    public VarExpression(String _key){
        this.key = _key;
    }

    @Override
    public int interpreter(Map<String, Integer> var) {
        return var.get(this.key);
    }
}
