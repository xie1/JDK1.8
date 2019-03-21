package testjdk;

/**
 * @program: JDK1.8
 * @description: 测试Integer
 * @author: xieshanzhong
 * @create: 2019-03-19 14:58
 **/
public class TestInteger {

    public static void main(String[] args) {
//        获取原始的数据类型
        System.out.println("Integer.TYPE-->" + Integer.TYPE);

        System.out.println("Integer.toString(3,11)-->" + Integer.toString(3, 11));

//        整型转成无符号的字符串
        System.out.println("Integer.toUnsignedString(3,11)-->" + Integer.toUnsignedString(3, 11));

        System.out.println("Integer.toHexString(15)-->" + Integer.toHexString(15));

        System.out.println("Integer.toOctalString(15)-->" + Integer.toOctalString(15));

        System.out.println("Integer.toBinaryString(15)-->" + Integer.toBinaryString(15));

        System.out.println("Integer.parseInt(\"18\",10)-->"+Integer.parseInt("18",10));
        //默认是10进制
        System.out.println("Integer.parseInt(\"30\")-->"+Integer.parseInt("30"));

        System.out.println(Integer.parseUnsignedInt("18",10));
    }
}
