package extend;

import java.util.Objects;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: 康大
 * \* Date: 2019/2/20
 * \* Time: 21:59
 * \* To change this template use FileInOut | Settings | FileInOut Templates.
 * \* Description:
 * \
 */
public class Studen extends Person{
    public String age;
    String sex;
    public Studen() {
        System.out.println("空参构造器");
    }
    public Studen(String name, String age) {
        this();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Studen)) return false;
        Studen studen = (Studen) o;
        return age.equals(studen.age) &&
                sex.equals(studen.sex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, sex);
    }
}
