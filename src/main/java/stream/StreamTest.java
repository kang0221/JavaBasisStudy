package stream;

import extend.Person;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: 康大
 * \* Date: 2019/4/26
 * \* Time: 19:48
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class StreamTest {
    @Test
    public void test1() {
        List<Person> list = Person.getPersons();
        list.stream().filter(s -> Integer.valueOf(s.getAge()) > 22).forEach(System.out::println);
        list.stream().limit(3).forEach(System.out::println);
        list.stream().skip(3).forEach(System.out::println);
        list.stream().sorted().forEach(System.out::println);
    }

    @Test
    public void test2() {
        List<Person> list = Person.getPersons();
        list.stream().limit(3).map(Person::getName).forEach(System.out::println);
    }
}
