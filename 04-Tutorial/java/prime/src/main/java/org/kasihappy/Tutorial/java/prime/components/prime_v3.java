package org.kasihappy.Tutorial.java.prime.components;

import java.math.BigInteger;
import java.util.*;

public class prime_v3 {

    public prime_v3(){}


    public boolean isPrime(int X){
        if (X == 1)
            return false;
        else
            for (int Y = 2; Y <= (X - 1); Y++)
                if (X%Y == 0)
                    return false;
        return true;
    }
    public boolean isPrime(BigInteger X){
        //可信度:1-1/(2**1000)=0.9995
        return X.isProbablePrime(1000);
    }
    public Vector getPrimes(int begin, int end){
        Vector<Integer> v = new Vector<Integer>();

        int i = begin;
        while (i <= end){
            if (isPrime(i)){
                v.addElement(i);
            }
            i++;
        }
        return v;
    }

    public Vector getPrimes(BigInteger begin, BigInteger end){
        Vector<BigInteger> v = new Vector<BigInteger>();

        BigInteger i = begin;
        while (i.compareTo(end) == -1){
            if (isPrime(i)){
                v.addElement(i);
            }
            i = i.add(new BigInteger("1"));
        }
        return v;
    }
}
