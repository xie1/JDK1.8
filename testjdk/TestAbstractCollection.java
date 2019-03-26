package testjdk;

import java.util.AbstractCollection;
import java.util.Iterator;

/**
 * @program: JDK1.8
 * @description: 测试抽象集合类
 * @author: xieshanzhong
 * @create: 2019-03-25 11:47
 **/
public class TestAbstractCollection {

    public static void main(String[] args) {


        AbstractCollection<Integer> students = new AbstractCollection<Integer>() {
            @Override
            public Iterator<Integer> iterator() {
                return null;
            }

            @Override
            public int size() {
                return 10;
            }
        };


        students.add(1);
        students.add(2);

        System.out.println(students.isEmpty());

    }
}
