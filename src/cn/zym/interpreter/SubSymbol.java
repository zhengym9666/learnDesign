package cn.zym.interpreter;

import java.util.Map;

/**
 * @ClassName SubSymbol
 * @Description TODO
 * @Author zhengym
 * @Date 2020/3/31 11:49
 * @Version 1.0
 */
public class SubSymbol extends SymbolExpression {

    public SubSymbol(Expression _left,Expression _right) {
        super(_left, _right);
    }

    @Override
    public int interpreter(Map<String, Integer> var) {
        return this.left.interpreter(var)-this.right.interpreter(var);
    }
}
