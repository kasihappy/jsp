package org.kasihappy.Tutorial.java.prime.components;
import java.util.*;

public class prime_v2 {
    public prime_v2(){}

    public boolean isPrime(int X){
        if(X == 1)
            return false;
        else
            for (int Y = 2; Y <= (X - 1); Y++)
                if (X%Y == 0)
                    return false;
        return true;
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
}
