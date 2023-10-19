package org.kasihappy.Tutorial.java.prime.components;

public class prime_v1 {
    public prime_v1(){}

    public boolean isPrime(int X){
        if(X == 1)
            return false;
        else
            for (int Y = 2; Y <= (X - 1); Y++)
                if (X%Y == 0)
                    return false;
        return true;
    }
}
