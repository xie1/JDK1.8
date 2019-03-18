package testjdk;

/**
 * @program: JDK1.8
 * @description: 测试StringBuffer类
 * @author: xieshanzhong
 * @create: 2019-03-18 15:49
 **/
public class TestStringBuffer {


    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("a");
        sb.append("c");
        sb.append("d");
        sb.append("e");
        sb.append("f");

        char[] c = {'g','h','i','j'};
        // 长度
        System.out.println("sb.length()-->" + sb.length());
        // 容量
        System.out.println("sb.capacity()-->"+sb.capacity());
        sb.trimToSize();
        // 长度
        System.out.println("sb.length()-->" + sb.length());

        System.out.println("sb.charAt(1)-->"+sb.charAt(1));

        // 获取索引下的字符的编码值，即ascii值
        System.out.println("sb.codePointAt(1)-->"+sb.codePointAt(1));


        System.out.println(sb.codePointCount(0,1));

        //寻找源索引，偏移之后的数量
        System.out.println("sb.offsetByCodePoints(1,3)-->"+sb.offsetByCodePoints(1,3));

        sb.getChars(1,3,c,0);

        System.out.println(sb.append(c,2,2));

    }

}
