package testjdk;


import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.Objects;

public class TestString {


    public static void main(String[] args) {
        String str = "abcdABCD";
        char[] c = {'a', 'b', 'c', 'd', 'f', 'e'};
        char[] chars = new char[10];

        String myStr = "xieshanZHONGxieshanzhongxieshanzhong";

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

        System.out.println("new String(stringBuffer)-->" + new String(stringBuffer));
        System.out.println("new String(stringBuilder)-->" + new String(stringBuilder));
        System.out.println("str.codePointAt(0)-->" + str.codePointAt(0));
        System.out.println("str.codePointCount(0,2)-->" + str.codePointCount(0, 1));
        System.out.println("str.offsetByCodePoints(0,2)-->" + str.offsetByCodePoints(0, 2));
        System.out.println("str.codePointBefore(1)-->" + str.codePointBefore(6));
        try {
            System.out.println("str.getBytes(\"utf-8\")-->" + str.getBytes("utf-8"));
            System.out.println("str.getBytes()-->" + str.getBytes());
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        System.out.println(strNew.equalsIgnoreCase(strOld));
        System.out.println("strNew.compareTo(strOld)-->" + strNew.compareTo(strOld));
        System.out.println("strOld.compareTo(strNew)-->" + strOld.compareTo(strNew));
        //方法类似compare方法
        System.out.println(strNew.compareToIgnoreCase(strOld));
        System.out.println("myStr.endsWith(\"xie\")-->"+myStr.endsWith("g"));
        System.out.println("myStr.startsWith(\"xie\")-->" + myStr.startsWith("xie"));
        System.out.println("strNew.regionMatches(1,strOld,3,19)-->" + strNew.regionMatches(1, strOld, 3, 19));
        System.out.println(strNew.hashCode());
        System.out.println(strOld.hashCode());
        System.out.println("myStr.indexOf(97)-->"+myStr.indexOf(97));
        System.out.println("myStr.indexOf(97,3)-->"+myStr.indexOf(97,6));
        System.out.println("myStr.indexOf(\"x\")-->"+myStr.indexOf("a",3));
        System.out.println(new String(c, 1, 5));
        // 字符串的提取
        System.out.println("myStr.substring(2)-->" + myStr.substring(2));


        //字符串的连接
        System.out.println(myStr.concat(" is me"));

        // 替换
        System.out.println(myStr.replace('n','m'));

        //
        System.out.println(myStr.matches("x"));

        System.out.println(myStr.contains("xie"));

        System.out.println(myStr.replaceFirst("x","xieshanzhong"));

        System.out.println(myStr.replaceAll("^xie","111"));

        System.out.println(myStr.replace("x","2"));

        String[] a = myStr.split("x",2);
        for (int i = 1; i < a.length; i++) {
            System.out.println("1-->"+a[i]);
        }

        System.out.println(myStr.split("x"));
        System.out.println(String.join("*","xie","zhong"));

        System.out.println(myStr.trim());
//        非空校验
//        Objects.requireNonNull(delimiter);

        chars = myStr.toCharArray();
        System.out.println(chars[1]);
    }
}
