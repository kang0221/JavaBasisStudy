package datetime;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: 康大
 * \* Date: 2019/4/28
 * \* Time: 21:23
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class LocalDateTimeTest {
    @Test
    public void test1() {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        System.out.println(localDateTime.plusDays(2));
        System.out.println(localDateTime.getDayOfYear());
        System.out.println(localDateTime.getDayOfWeek().getValue());
        int _i = 1;
        int _ = 1;
    }
}
