package testjdk;


public class TestString {


    public static void main(String[] args) {
        String str = new String();
        str = "abcd";
        String str1 = new String("1234");
        char[] c = {'a','b','c','d','f','e'};
        int[] num = {1,2,3,4,5,6,7,8,9};
        System.out.println(str);
        System.out.println(str1);
        System.out.println(new String(c));
        System.out.println(new String(c,1,5));
        System.out.println(new String(num,1,5));
    }
}
