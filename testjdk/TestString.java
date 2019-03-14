package testjdk;


import java.io.UnsupportedEncodingException;

public class TestString {


    public static void main(String[] args) {
        String str = "abcdABCD";
        char[] c = {'a','b','c','d','f','e'};
        char[] chars = new char[10];

        String strNew = "abcdABCD1";
        String strOld = "ebcdABCD1";
        //StringBuffer
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(1);
        stringBuffer.append(2);
        stringBuffer.append('a');

        //StringBuilder
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('a');
        stringBuilder.append('b');
        stringBuilder.append('c');

        System.out.println("new String(stringBuffer)-->"+new String(stringBuffer));
        System.out.println("new String(stringBuilder)-->"+new String(stringBuilder));
        System.out.println("str.codePointAt(0)-->"+str.codePointAt(0));
        System.out.println("str.codePointCount(0,2)-->"+str.codePointCount(0,1));
        System.out.println("str.offsetByCodePoints(0,2)-->"+str.offsetByCodePoints(0,2));
        System.out.println("str.codePointBefore(1)-->"+str.codePointBefore(6));
        try {
            System.out.println("str.getBytes(\"utf-8\")-->"+str.getBytes("utf-8"));
            System.out.println("str.getBytes()-->"+str.getBytes());
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        System.out.println(strNew.equalsIgnoreCase(strOld));

        System.out.println("strNew.compareTo(strOld)-->"+strNew.compareTo(strOld));
        System.out.println("strOld.compareTo(strNew)-->"+strOld.compareTo(strNew));
        //方法类似compare方法
        System.out.println(strNew.compareToIgnoreCase(strOld));
        System.out.println(new String(c));
        System.out.println(new String(c,1,5));

    }
}
