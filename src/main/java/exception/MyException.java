package exception;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: 康大
 * \* Date: 2019/2/26
 * \* Time: 20:57
 * \* To change this template use FileInOut | Settings | FileInOut Templates.
 * \* Description:
 * \
 */
public class MyException extends Exception {
    static final long serialVersionUID = -77777777777L;
    public MyException() {}
    public MyException(String message) {
        super(message);
    }
}
