package org.kasihappy.Tutorial.java.prime.components;
import java.util.Scanner;

public class prime_algorithm_2 {
    public static boolean isPrime(int num, int i) {
        if(i > Math.sqrt(num)) {
            return true;
        }

        if(num % i == 0) {
            return false;
        } else {
            return isPrime(num, i+1);
        }
    }

    public void getPrimeNumbers() {
        String primes = "";
        for(int i=2; i<=100; i++) {
            if(isPrime(i, 2)) {
                primes += i + " ";
            }
        }
        System.out.println(primes);
    }

}
