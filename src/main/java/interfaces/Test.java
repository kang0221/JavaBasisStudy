package interfaces;

/**
\* Created with IntelliJ IDEA.
\* User: 康大
\* Date: 2019/2/24
\* Time: 18:17
\* To change this template use FileInOut | Settings | FileInOut Templates.
\* Description:
\*/
class Test {
    @org.junit.jupiter.api.Test
    void Test(){
        System.out.println(1);
        Runner r = new Runner() {
            public void eat() {
                System.out.println("a");
            }
        };
        r.eat();
    }
    Per p = new Per();
     class Per {
        String a = "1l";
    }
}
interface Runner {
    void eat();
}