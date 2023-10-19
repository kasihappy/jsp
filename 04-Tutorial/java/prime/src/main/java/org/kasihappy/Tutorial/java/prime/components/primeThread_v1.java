package org.kasihappy.Tutorial.java.prime.components;
import org.kasihappy.Tutorial.java.prime.components.prime_v2;

public class primeThread_v1 extends Thread{

    private int begin;
    private int end;

    public primeThread_v1(int begin, int end)
    {
        this.begin=begin;
        this.end=end;
    }

    public void run()
    {
        prime_v2 myprime = new prime_v2();
        int i = begin;
        while (i <= end){
            if (myprime.isPrime(i)){
                String name=Thread.currentThread().getName();
                System.out.println(name+" ----- "+i);
            }
            i++;

            try {
                Thread.currentThread().sleep((int)(Math.random()*500));
            } catch (Exception e){
                e.printStackTrace();
            }

        }
    }
}
