package exception;

import java.util.HashSet;
import java.util.Set;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: 康大
 * \* Date: 2019/2/26
 * \* Time: 21:13
 * \* To change this template use FileInOut | Settings | FileInOut Templates.
 * \* Description:
 * \
 */
public class ReturnException {
    static void method1() {
        try {
            System.out.println("A");
            throw new RuntimeException("制造异常");
        } finally {
            System.out.println("A finally");
        }
    }
     static void method2() {
        try {
            System.out.println("B");
        } finally {
            System.out.println("B finally");
        }
     }
     public static void main(String args[]){
         try {
             method1();
         } catch (Exception e) {
             System.out.println(e.getMessage() + "main");
         }
         method2();
         Set<Object> set = new HashSet<Object>();
         set.add(null);
         set.add(null);
         System.out.println(set);
         "".equals("a");
     }
}
