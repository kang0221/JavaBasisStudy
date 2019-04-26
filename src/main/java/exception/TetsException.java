package exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: 康大
 * \* Date: 2019/2/26
 * \* Time: 20:35
 * \* To change this template use FileInOut | Settings | FileInOut Templates.
 * \* Description:
 * \
 */
public class TetsException {
    public static void main(String args[]){

    }
    public void method1() throws IOException, FileNotFoundException {
        FileInputStream fis = new FileInputStream(new File(""));
        int b;
        while ((b = fis.read()) != -1){
            System.out.println(b);
        }
        fis.close();
        try {
            throw new Exception("a");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
