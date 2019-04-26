package extend;


import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: 康大
 * \* Date: 2019/2/23
 * \* Time: 15:00
 * \* To change this template use FileInOut | Settings | FileInOut Templates.
 * \* Description:
 * \
 */
class Test {
    @org.junit.jupiter.api.Test
    void method04() {
        Integer i = 1;
        String a = String.valueOf(1);

        StringBuffer sb = new StringBuffer(a);
        StringBuffer sb1 = sb.append("1");
        System.out.println(sb);

    }

    @org.junit.jupiter.api.Test
    void method03() {
        Studen s1 = new Studen();
        Studen s2 = new Studen();
        System.out.println(s2.hashCode());
        System.out.println(s1.hashCode());
        System.out.println(s1.equals(s2));
    }
    @org.junit.jupiter.api.Test
    void method1() {
        Studen s = new Studen();
        Person p = new Studen();
        Studen s2 = new Studen();
        System.out.println(s.hashCode());
        System.out.println(s2.hashCode());
        //System.out.println(p.name);
        Set set = new TreeSet();
        set.add(new Person("abb","a","a"));
        set.add(new Person("ab","a","a"));
        set.add(new Person("ac","a","a"));
        set.add(new Person("ad","a","a"));
        set.add(new Person("ad","a","a"));
        System.out.println("======Set=====");
        for (Object str: set) {
            System.out.println(str);
        }
        Map map = new HashMap();
        map.put("1","1");
        map.put(1,"1");
        map.put("4","1");
        map.put("3","1");
        System.out.println("======Map=====");
        System.out.println(map);
        System.out.println(map.get(1));
        System.out.println(map.containsKey("1"));
        for (Object set1: map.keySet()) {
            System.out.println(set1);
        }
        for (Object set1: map.values()) {
            System.out.println(set1);
        }
        for (Object set1: map.entrySet()) {
            System.out.println(set1);
            Map.Entry entry = (Map.Entry) set1;
            System.out.println(entry.getKey() + "==========" + entry.getValue());
        }
    }
    @org.junit.jupiter.api.Test
    void method2(){
        Map map = new TreeMap();
        map.put(new Person("abb","a","a"),"1");
        map.put(new Person("ab","a","a"),"1");
        map.put(new Person("ac","a","a"),"1");
        map.put(new Person("ad","a","a"),"1");
        map.put(new Person("ad","a","a"),"1");
        System.out.println(map);
        List list = new ArrayList();
        List list1 = new ArrayList();
        list.add("1");
        list.add("3");
        list.add("2");
        list.add("5");
        list.add("1");
        Collections.copy(list1, list);
        System.out.println(list1);
    }
}
