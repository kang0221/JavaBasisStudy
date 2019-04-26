import extend.Person;
import extend.Studen;
import org.junit.jupiter.api.Test;

import java.sql.Array;
import java.util.*;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: 康大
 * \* Date: 2019/2/20
 * \* Time: 19:56
 * \* To change this template use FileInOut | Settings | FileInOut Templates.
 * \* Description:
 * \
 */
class JavaBasisCollection{
    @Test
    void testCollection() {
        Person s = new Studen();
        System.out.println(s.name);
        List<String> arrayList = new ArrayList<String>();
        arrayList.add("s1");
        arrayList.add("s3");
        arrayList.add("s4");
        arrayList.add("s5");
        arrayList.add("s2");
        System.out.println("ArrayList:==========================");
        for(String arrList : arrayList){
            System.out.println(arrList);
        }

        List<String> linkedList = new LinkedList<String>();
        linkedList.add("s1");
        linkedList.add("s3");
        linkedList.add("s4");
        linkedList.add("s5");
        linkedList.add("s2");
        System.out.println("LinkedList:===========================");
        for(String linkList : linkedList){
            System.out.println(linkList);
        }

        Set<String> hashSet = new HashSet<String>();
        hashSet.add("s1");
        hashSet.add("s3");
        hashSet.add("s4");
        hashSet.add("s5");
        hashSet.add("s2");
        System.out.println("HashSet:==============================");
        for(String hashst: hashSet){
            System.out.println(hashst);
        }

        Set<String> linkedHashSet = new LinkedHashSet<String>();
        linkedHashSet.add("s1");
        linkedHashSet.add("s3");
        linkedHashSet.add("s4");
        linkedHashSet.add("s5");
        linkedHashSet.add("s2");
        System.out.println("LinkedHashSet:=========================");
        for(String linkedst : linkedHashSet){
            System.out.println(linkedst);
        }

        Set<String> treeSet = new TreeSet<String>();
        treeSet.add("1");
        treeSet.add("3");
        treeSet.add("4");
        treeSet.add("5");
        treeSet.add("2");
        treeSet.add("12");
        treeSet.add("11");
        System.out.println("TreeSet:==============================");
        for(String treest : treeSet){
            System.out.println(treest);
        }
    }
    @Test
    public void Singleton() {
        Person p = new Person();
    }
}

