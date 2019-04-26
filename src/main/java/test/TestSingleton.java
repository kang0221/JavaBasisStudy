package test;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: 康大
 * \* Date: 2019/2/21
 * \* Time: 21:27
 * \* To change this template use FileInOut | Settings | FileInOut Templates.
 * \* Description:
 * \    单例设计模式：使得一个类只能创建一个对象
 */
public class TestSingleton {
    public static void main(String args[]) throws InterruptedException {
        Singletion s1 = Singletion.getInstance();
        Singletion s2 = Singletion.getInstance();
        Thread t = new Thread(){
            Singleton1 s3 = Singleton1.getInstance();
        };
        t.start();
        Thread t2 = new Thread(){
            Singleton1 s3 = Singleton1.getInstance();
        };
        t2.start();
        //TODO 多线程完善
        Singleton1 s4 = Singleton1.getInstance();
    }
}
// 饿汉式
class Singletion {
    //1.私有化构造器
    private Singletion() {
        System.out.println("1");
    }
    //2.在类内部创建类的实例
    private static Singletion instance = new Singletion();
    //3.私有化此对象，通过公共的方法调用
    public static Singletion getInstance(){
        return instance;
    }
}
// 懒汉式
class Singleton1 {
    private Singleton1() {
        System.out.println("2");
    }
    private static Singleton1 instance = null;
    public static Singleton1 getInstance() throws InterruptedException {
        if (instance == null) {
            Thread.sleep(1000);
            instance = new Singleton1();
        }
        return instance;
    }
}