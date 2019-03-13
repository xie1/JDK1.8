package testjdk;

/**
 * @program: JDK1.8
 * @description: 学生
 * @author: xieshanzhong
 * @create: 2019-03-12 16:20
 **/
public class Student implements Cloneable{

    private String name;

    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
