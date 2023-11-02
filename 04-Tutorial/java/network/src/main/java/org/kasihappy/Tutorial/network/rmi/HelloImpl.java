package org.kasihappy.Tutorial.network.rmi;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class HelloImpl extends UnicastRemoteObject implements Hello {
    protected HelloImpl() throws RemoteException{
        super();
    }

    private static final long serialVersionUID=1L;

    public String sayHello(String name) throws RemoteException {
        return "Hello "+name+"^_^";
    }

    public static void main(String[] args)
    {
        try {
            Hello hello = new HelloImpl();
            LocateRegistry.createRegistry(1099);

            java.rmi.Naming.rebind("rmi://localhost:1099/hello", hello);
            System.out.println(" Ready ......");
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
