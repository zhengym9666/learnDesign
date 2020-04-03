package cn.zym.interpreter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName TestCaculator
 * @Description TODO
 * @Author zhengym
 * @Date 2020/3/31 12:20
 * @Version 1.0
 */
public class TestCaculator {

    public static void main(String[] args) throws IOException {
        String expStr = getExpStr();
        Map<String,Integer> paramMap = getValue(expStr);
        //创建计算机对象
        Caculator caculator = new Caculator(expStr);
        //计算
        int result = caculator.run(paramMap);
        System.out.println("运算结果："+result);
    }

//    获取表达式
    public static String getExpStr() throws IOException {
        System.out.print("请输入表达式：");
        String str = new BufferedReader(new InputStreamReader(System.in)).readLine();
        return str;
    }

//    获取值
    public static Map<String,Integer> getValue(String expStr) throws IOException {
        Map<String,Integer> paramMap = new HashMap<>();
        //获取参数的值
        for (char ch:expStr.toCharArray()) {
            if (ch!='+' && ch!='-') {
                System.out.print("请输入"+ch+"的值：");
                //解决获取重复参数的值
                if (!paramMap.containsKey(String.valueOf(ch))) {
                    String in = new BufferedReader(new InputStreamReader(System.in)).readLine();
                    paramMap.put(String.valueOf(ch),Integer.parseInt(in));
                }
            }
        }
        return paramMap;
    }

}
