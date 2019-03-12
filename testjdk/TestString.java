package testjdk;


public class TestString {


    public static void main(String[] args) {
//        char[] c = {'a','c','d'};
        int[] num = {1, 2, 3};
        System.out.println(new String(num, 1, 2));
        System.out.println(Integer.valueOf(num[1]));
    }
}
