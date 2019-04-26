package String;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: 康大
 * \* Date: 2019/2/21
 * \* Time: 21:56
 * \* To change this template use FileInOut | Settings | FileInOut Templates.
 * \* Description:
 * \
 */
public class StaticClass {
    public static void main(String args[]){
        Test t = new Test();
        StaticClass ss = new StaticClass();
    }
    @org.junit.jupiter.api.Test
    public void metho1() {
        char[] a = new char[10];
        System.out.println(a);
        System.out.println(a.toString());
        int[] b = new int[10];
        System.out.println(b);
        System.out.println(b.toString());
        String aa = new String("0");
        ret(aa);
        System.out.println(aa);
    }
    public String ret(String a) {
        a = "1";
        return a;
    }

    @org.junit.jupiter.api.Test
    public void binomial(){
        recursion(10);
    }
    private static int count = 0;
    public static int recursion(int k) {
        count ++;
        System.out.println("count:" + count + "k:" + k);
        if (k < 0) {
            return 0;
        }
        return recursion(k-1) + recursion(k-2);
    }

}
class Test {

    {
        name = "2";
    }
    public void math1() {
        System.out.println(name);
        name = "3";
    }
    public String name = "1";
}