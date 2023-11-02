package org.kasihappy.Tutorial.network.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class Client {
    public static void main(String args[])
    {
        try {
            /*提示本程序的用法*/
            if (args.length != 1)
            {
                System.out.println("USAGE: java Client servername");
                return;
            }
            /*获得服务器的名称*/
            String connectto = args[0];
            Socket connection;
            /*连接到服务器的端口8000*/
            if (connectto.equals("localhost"))
            {
                connection =
                        new Socket(InetAddress.getLocalHost(), 8000);
            } else {
                connection =
                        new Socket(InetAddress.getByName(connectto), 8000);
            }
            /*获取键盘输入流*/
            BufferedReader stdIn = new BufferedReader(
                    new InputStreamReader(System.in));
            PrintWriter out =
                    new PrintWriter(connection.getOutputStream(),
                            true);
            /*获得服务器的输入流*/
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(connection.getInputStream()));
            /*从服务器得到欢迎信息*/
            System.out.println("From Server:" + in.readLine());
            /*提示用户输入*/
            System.out.println("input > ");

            String sInput, info;
            boolean done = false;

            while(!done)
            {
                /*从键盘上读字符串*/
                sInput = stdIn.readLine();
                /*写向服务端*/
                out.println(sInput);
                /*如果督导bye, 结束循环*/
                if (sInput.equalsIgnoreCase("bye"))
                    done = true;
                /*从服务器读取字符串*/
                info = in.readLine();
                /*在客户端显示从服务器返回的字符串*/
                System.out.println("Echo:" + info);
                /*提示用户输入*/
                if (!done)
                {
                    System.out.println("input > ");
                }
            }
            /*关闭 socket*/
            connection.close();
        } catch (SecurityException e){
            System.out.println("SecurityException when connecting Server!");
        } catch (IOException e) {
            System.out.println("IOException when connecting Server!");
        }
    }
}
