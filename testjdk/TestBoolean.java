package testjdk;

/**
 * @program: JDK1.8
 * @description: 测试Boolean类型
 * @author: xieshanzhong
 * @create: 2019-03-19 10:15
 **/
public class TestBoolean {

    public static void main(String[] args) {
        Boolean b = new Boolean("true");
        System.out.println(b);

        System.out.println("Boolean.parseBoolean(\"true\")-->" + Boolean.parseBoolean("true"));

        System.out.println("b.booleanValue()-->" + b.booleanValue());

        // 静态工厂方法
        System.out.println("Boolean.valueOf(true)-->" + Boolean.valueOf(true));

        System.out.println("Boolean.valueOf(\"false\")-->" + Boolean.valueOf("false"));

        System.out.println(Boolean.toString(false));

        System.out.println(Boolean.logicalXor(true,true));
    }
}
