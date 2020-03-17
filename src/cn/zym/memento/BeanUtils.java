package cn.zym.memento;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName BeanUtils
 * @Description TODO    多状态属性转换工具类
 * @Author zhengym
 * @Date 2020/3/16 17:36
 * @Version 1.0
 */
public class BeanUtils {

    public static Map<String,Object> backupProp(Object bean) throws Exception {
        Map<String, Object> map = new HashMap<>();
        try {
            //反射获取bean的class
            Class beanClass = bean.getClass();
            //获取bean属性
            Field[] fields = beanClass.getDeclaredFields();
            for (int i = 0;i<fields.length;i++) {
                //将属性名首字母转为大写
                String fielName = fields[i].getName().substring(0,1).toUpperCase()+fields[i].getName().substring(1);
                //获取getter方法
                Method getMethod = beanClass.getMethod("get"+fielName,null);
                //执行getter方法，并put到map中
                map.put(fielName,getMethod.invoke(bean,null));
            }
        } catch (Exception e) {
            System.out.println("shit");
            e.printStackTrace();
        }
        return map;
    }

    public static void restoreProp(Object bean,Map<String,Object> props) throws Exception {
        try {
            //反射获取bean的class
            Class beanClass = bean.getClass();
            for (String key:props.keySet()) {
                //获取setter方法
                Method setMethod = beanClass.getMethod("set"+key,props.get(key).getClass());
                //执行setter方法，恢复bean的状态属性值
                setMethod.invoke(bean,props.get(key));
            }
        } catch (Exception e) {
            System.out.println("shit");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        Originator o = new Originator("a","b","c");
        Map map = backupProp(o);
        System.out.println(map);
        o.setState1("aa");
        o.setState2("bb");
        o.setState3("cc");
        System.out.println(o);
        restoreProp(o,map);
        System.out.println(o);
    }

}
