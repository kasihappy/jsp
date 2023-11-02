package org.kasihappy.Tutorial.network.rmi;

import java.rmi.Naming;
/*导入远程接口，同一包不需要导入，这里是为了上课演示*/
public class HelloClient {
    public static void main(String[] args)
    {
        try
        {
            /*查找远程接口*/
            Hello hello =
                    (Hello) Naming.lookup("rmi://localhost:1099/hello");
            /*调用远程接口*/
            System.out.println(hello.sayHello(" Hello, rmi-Hello app"));
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
