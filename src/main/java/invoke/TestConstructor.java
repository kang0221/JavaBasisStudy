package invoke;

import extend.Person;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: 康大
 * \* Date: 2019/3/25
 * \* Time: 21:19
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class TestConstructor {
    @Test
    public void test1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        String className = "extend.Person";
        Class clazz = Class.forName(className);
        Object obj = clazz.getDeclaredConstructor().newInstance();
        Person p = (Person) obj;
        System.out.println(p);
    }
}
