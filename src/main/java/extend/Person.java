package extend;

import org.jetbrains.annotations.NotNull;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
public class Person implements Comparable, Serializable {
    public static final long serialVersionUID = 12343256123634L;
    public String name = "p";
    public String age;
    String sex;

    public void getName() {
        System.out.println("pname");
    }
    public String getAge() {
        return age;
    }
    public Person() {}
    public Person(String name, String age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public static List<Person> getPersons() {
        List<Person> list = new ArrayList<>();
        list.add(new Person("a", "24", "男"));
        list.add(new Person("b", "23", "女"));
        list.add(new Person("c", "22", "男"));
        list.add(new Person("d", "21", "女"));
        list.add(new Person("e", "20", "男"));
        list.add(new Person("f", "21", "女"));
        list.add(new Person("g", "22", "男"));
        list.add(new Person("h", "24", "男"));
        return list;
    }
    @Override
    public int compareTo(@NotNull Object o) {
        if(o instanceof Person) {
            Person p = (Person) o;
            int i = this.name.compareTo(p.name);
            if(i == 0) {
                return this.age.compareTo(p.age);
            }
            return i;
        }
        return 0;
    }
    //Person p = new Person();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(age, person.age) &&
                Objects.equals(sex, person.sex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, sex);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
