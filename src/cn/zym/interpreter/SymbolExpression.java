package cn.zym.interpreter;


/**
 * @ClassName SymbolExpression
 * @Description TODO
 * @Author zhengym
 * @Date 2020/3/31 11:41
 * @Version 1.0
 */
public abstract class SymbolExpression extends Expression {

    protected Expression left;
    protected Expression right;

    //所有解析公式只关心符号左右两边的公式
    public SymbolExpression(Expression _left,Expression _right) {
        this.left = _left;
        this.right = _right;
    }
}
