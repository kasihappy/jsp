package org.kasihappy.Tutorial.network.socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class PTPServer {
    public static void main(String[] args)
    {
        try {
            /*创建套接字，监听端口为8000*/
            ServerSocket s = new ServerSocket(8000);
            /*显示连接信息*/
            System.out.println("Server created. Listening on port 8000");
            System.out.println("waiting for client to connect on...");

            /*挂起等待客户端的连接请求*/
            Socket incoming = s.accept();

            /*获取数据输入流*/
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(incoming.getInputStream())
            );
            /*获取数据输出流*/
            PrintWriter out =
                    new PrintWriter(incoming.getOutputStream(),
                            true);
            /*向客户端发送欢迎的提示信息*/
            out.println("Hello! Enter BYE to exit.");

            boolean done = false;
            while (!done)
            {
                String line = in.readLine();
                if (line == null)
                    done = true;
                else
                {
                    /*在服务器端显示从客户端接收的信息*/
                    System.out.println("From client: "+line);
                    /*向客户端发送信息*/
                    out.println("From Server port 8000: " +
                            line.toUpperCase());
                    if (line.trim().equals("BYE"))
                        done = true;
                }
            }
            /*关闭通讯通道*/
            incoming.close();
        } catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
