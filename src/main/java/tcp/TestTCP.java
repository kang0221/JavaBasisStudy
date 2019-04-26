package tcp;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: 康大
 * \* Date: 2019/4/9
 * \* Time: 20:08
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class TestTCP {
    @Test
    public void client() {
        Socket socket = null;
        OutputStream out = null;
        InputStream in = null;
        try {
            socket = new Socket(InetAddress.getByName("127.0.0.1"), 8989);
            out = socket.getOutputStream();
            out.write("我是客户端，请多关照".getBytes());
            socket.shutdownOutput();
            in = socket.getInputStream();
            byte[] b = new byte[20];
            int len;
            while ((len = in.read(b)) != -1) {
                System.out.print( new String(b, 0, len));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }

    @Test
    public void server() {
        ServerSocket serverSocket = null;
        Socket s = null;
        InputStream in = null;
        OutputStream out = null;
        try {
            serverSocket = new ServerSocket(8989);
            s = serverSocket.accept();
            in = s.getInputStream();
            byte[] b = new byte[20];
            int len;
            while ((len = in.read(b)) != -1) {
                System.out.print(new String(b, 0, len));
            }
            out = s.getOutputStream();
            out.write("服务的收到消息".getBytes());
            //s.shutdownInput();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (out != null) {
                try {
                    out.close();
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
            if (s != null) {
                try {
                    s.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (serverSocket != null) {
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
