package testjdk;

/**
 * @program: JDK1.8
 * @description:
 * @author: xieshanzhong
 * @create: 2019-03-12 16:21
 **/
public class TestObject {

    public static void main(String[] args) {
        Student studentA = new Student();
        studentA.setAge(23);
        studentA.setName("小明");
        Student studentB = new Student();
        System.out.println(studentA.getClass());
        System.out.println(studentB.getClass());
        System.out.println(studentA.equals(studentB));
        System.out.println(studentA.hashCode());
        System.out.println(studentB.hashCode());
        System.out.println("对象的getClass()@Integer.toHexString(hashCode())"+studentA.toString());
        studentA.notify();
    }

}
