package file;

import extend.Person;
import org.junit.jupiter.api.Test;

import java.io.*;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: 康大
 * \* Date: 2019/3/11
 * \* Time: 21:18
 * \* To change this template use FileInOut | Settings | FileInOut Templates.
 * \* Description:
 * \
 */
public class FileInOut {
    @Test
    public void randomaccess() {
        RandomAccessFile raf = null;
        try {
            raf = new RandomAccessFile(new File("./src/main/java/file/1.txt"), "rw");
            raf.seek(4);
            byte[] b = new byte[1024];
            int len;
            StringBuffer sb = new StringBuffer();
            while ((len = raf.read(b)) != -1) {
                sb.append(new String(b, 0, len));
            }
            raf.seek(4);
            raf.write("aa".getBytes());
            raf.write(sb.toString().getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void copefile() {
        File fis = new File("./src/main/java/file/1.txt");
        File fos = new File("./src/main/java/file/2.txt");
        FileInputStream in = null;
        FileOutputStream ot = null;
        try {
            in = new FileInputStream(fis);
            ot = new FileOutputStream(fos);
            int len;
            byte[] b = new byte[20];
            while ((len = in.read(b)) != -1) {
                ot.write(b, 0 , len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (ot != null) {
                try {
                    ot.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    @Test
    public void method1(){
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("src/main/java/file/Person.txt"));
            oos.writeObject(new Person("1", "2", "3"));
            oos.flush();
            oos.writeObject(new Person("a", "b", "c"));
            oos.flush();
            oos.writeObject("a");
            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void method2(){
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("src/main/java/file/Person.txt"));
            Person p = (Person) ois.readObject();
            System.out.println(p);
            Person p1 = (Person) ois.readObject();
            System.out.println(p1);
            String str = (String) ois.readObject();
            System.out.println(str);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
