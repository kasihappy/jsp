package org.kasihappy.Tutorial.network.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class PTMServer extends ServerSocket {

    /*监听端口8000*/
    private static final int SERVER_PORT = 8000;
    public PTMServer() throws IOException
    {
        super(SERVER_PORT);
        /*显示连接信息*/
        System.out.println("Server created. Listening on port 8000");
        System.out.println("waiting for client to connect on...");
        try {
            while (true) {
                /*挂起，直到有客户连接*/
                Socket socket = accept();
                /*建立服务线程*/
                new CreateServerThread(socket);
            }
        } catch (IOException e){}
        finally {
            close();
        }
    }

    /*内部类， 建立服务线程的过程 */
    class CreateServerThread extends Thread
    {
        private Socket client;
        private BufferedReader in;
        private PrintWriter out;

        /*构造方法*/
        public CreateServerThread(Socket s) throws IOException
        {
            client = s;
            /*获取数据输入流*/
            in = new BufferedReader(
                    new InputStreamReader(client.getInputStream(), "GB2312")
            );
            out = new PrintWriter(client.getOutputStream(), true);
            out.println("Hello! Enter BYE to exit.");
            /*启动线程*/
            start();
        }

        public void run()
        {
            try {
                /*从输入流读取数据*/
                String line = in.readLine();
                /*在服务器端显示从客户端接收的数据*/
                System.out.println("From client: "+line);

                while (!line.equals("bye"))
                {
                    /*服务器端加工信息方法*/
                    String msg = createMessage(line);
                    /*向客户端发送信息*/
                    out.println(msg);
                    /*再从输入流上读取数据*/
                    line = in.readLine();
                    /*在服务器端显示从客户端接收的信息*/
                    System.out.println("From client: "+line);
                }
                out.println("From Server port 8000:"+line);
                client.close();
            }catch (IOException e){}

        }

        private String createMessage(String line)
        {
            return("From Server port 8000: " + line.toUpperCase());
        }
    }

    public static void main(String[] args) throws IOException
    {
        new PTMServer();
    }
}
