package testjdk;

/**
 * @program: JDK1.8
 * @description: 测试Byte类型
 * @author: xieshanzhong
 * @create: 2019-03-19 11:17
 **/
public class TestByte {

    public static void main(String[] args) {
        System.out.println("最小值-->" + Byte.MIN_VALUE + ",最大值-->" + Byte.MAX_VALUE);
        Byte b = 123;
        Byte anotherByte = 127;
        System.out.println(Byte.valueOf(b));


        System.out.println("Byte.parseByte(\"123\",8)-->"+Byte.parseByte("123",8));

//        System.out.println("Byte.valueOf(\"123\",1)-->"+Byte.valueOf("123",1));
//        System.out.println("Byte.valueOf(\"123\",2)-->"+Byte.valueOf("123",2));
//        System.out.println("Byte.valueOf(\"123\",3)-->"+Byte.valueOf("123",3));
//        System.out.println("Byte.valueOf(\"123\",4)-->"+Byte.valueOf("123",4));
        System.out.println("Byte.valueOf(\"123\",5)-->"+Byte.valueOf("123",5));
        System.out.println(Byte.decode("044"));
//        结果大于0表示b大于anotherByte
        System.out.println("b.compareTo(anotherByte)-->"+b.compareTo(anotherByte));


    }
}
