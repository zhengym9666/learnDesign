package cn.zym.interpreter;

import java.util.Map;
import java.util.Stack;

/**
 * @ClassName Caculator
 * @Description TODO
 * @Author zhengym
 * @Date 2020/3/31 11:51
 * @Version 1.0
 */
public class Caculator {

    //定义表达式
    private Expression expression;
    //构造函数，传参
    public Caculator(String varStr) {
        //定义一个栈，安排运算的先后顺序
        Stack<Expression> stack = new Stack<>();
        //将表达式拆分为字符数组
        char[] charArray = varStr.toCharArray();
        //数组遍历获取当前运算的值，结合栈的弹出操作获取前一个运算的值
        Expression left = null;
        Expression right = null;
        for (int i = 0;i<charArray.length;i++) {
            switch (charArray[i]) {
                case '+':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArray[++i]));//避免重复遍历，进行自增
                    Expression add = new AddSymbol(left,right);
                    stack.push(add);
                    break;
                case '-':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArray[++i]));//避免重复遍历，进行自增
                    Expression sub = new SubSymbol(left,right);
                    stack.push(sub);
                    break;
                default:
                    //运算元素
                    stack.push(new VarExpression(String.valueOf(charArray[i])));
            }
        }
        this.expression = stack.pop();
    }

    //进行运算
    public int run(Map<String,Integer> var) {
        return this.expression.interpreter(var);
    }

}
