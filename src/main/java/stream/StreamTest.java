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
        Stream<Person> stream = list.stream();
        stream.filter(s -> {
            return Integer.valueOf(s.getAge()) > 22;
        }).forEach(System.out::println);
    }
}
