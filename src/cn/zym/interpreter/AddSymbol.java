package cn.zym.interpreter;

import java.util.Map;

/**
 * @ClassName AddSymbol
 * @Description TODO
 * @Author zhengym
 * @Date 2020/3/31 11:47
 * @Version 1.0
 */
public class AddSymbol extends SymbolExpression {

    public AddSymbol(Expression _left,Expression _right){
        super(_left,_right);
    }
    @Override
    public int interpreter(Map<String, Integer> var) {
        return this.left.interpreter(var)+this.right.interpreter(var);
    }
}
