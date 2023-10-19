package org.kasihappy.Tutorial.java.prime.components;
import java.math.BigInteger;
import org.kasihappy.Tutorial.java.prime.components.prime_v3;

public class primeThread_v2 extends Thread{

    private BigInteger begin;
    private BigInteger end;

    public primeThread_v2(int begin, int end)
    {
        this.begin.valueOf((long)begin);
        this.end.valueOf((long)end);
    }
    public primeThread_v2(BigInteger begin, BigInteger end)
    {
        this.begin = begin;
        this.end = end;
    }

    public void run()
    {
        prime_v3 myprime = new prime_v3();
        BigInteger i = begin;
        while (i.compareTo(end) == -1){
            if (myprime.isPrime(i)){
                String name=Thread.currentThread().getName();
                System.out.println(name+" ----- "+i);
            }
            i = i.add(new BigInteger("1"));

            try {
                Thread.currentThread().sleep((int)(Math.random()*500));
            } catch (Exception e){
                e.printStackTrace();
            }

        }
    }
}
