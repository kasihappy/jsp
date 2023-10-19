package org.kasihappy.Tutorial.java.prime.test;

import java.util.Scanner;
import java.util.Vector;
import java.math.BigInteger;;
import org.kasihappy.Tutorial.java.prime.components.*;

public class testPrime {
    public static void main(String[] args) {
        mainMenu();

        Scanner input = new Scanner(System.in);
        boolean flag = true;
        do{
            int no = input.nextInt();
            switch (no) {
                case 1:
                    testPrime01();
                    break;
                case 2:
                    testPrime02();
                    break;
                case 3:
                    testPrime_v1();
                    break;
                case 4:
                    testPrime_v2();
                    break;
                case 5:
                    testBigInteger();
                    break;
                case 6:
                    testThread_v1();
                    break;
                case 7:
                    testThread_v2();
                    break;
                case 8:
                    flag = false;
                    break;
                default:
                    System.out.println("重新输入\n");
            }
            mainMenu();
        }while (flag);
        System.out.println("\t\t 欢迎使用\n");
    }

    private static void testThread_v2() {
        int i = 1;
        prime_v3 myprime = new prime_v3();
        System.out.println("\n   使用int计算1~10之间的素数有：");
        while (i <= 10){
            if (myprime.isPrime(i)){
                System.out.println(" " + i);
            }
            i++;
        }

        System.out.println("\n   使用BigInteger计算1~10之间的素数有：");
        BigInteger x = new BigInteger("1");
        BigInteger y = new BigInteger("10");
        while (x.compareTo(y) == -1){
            if (myprime.isPrime(x)){
                System.out.println(" " + x.toString(10));
            }
            x = x.add(new BigInteger("1"));
        }
        System.out.println("\n   使用BigInteger计算123456~654321之间的素数有：");
        BigInteger a = new BigInteger("123456");
        BigInteger b = new BigInteger("654321");
        while (a.compareTo(b) == -1){
            if (myprime.isPrime(a)){
                System.out.println(" " + a.toString(10));
            }
            a = a.add(new BigInteger("1"));
        }
    }

    private static void testThread_v1() {
        System.out.println("开始创建线程.....");
        Thread threadA = new Thread(
                new primeThread_v1(2, 50), "第一个线程"
        );
        Thread threadB = new Thread(
                new primeThread_v1(51, 100), "第二个线程"
        );
        threadB.start();
        threadA.start();
    }


    public static void mainMenu() {
    System.out.println("\n\t\t--------------------------------------------------------------\n");
    System.out.println("\t\t       欢迎使用【求素数】测试程序");
    System.out.println("\t\t     1.算法-循环方法-组件测试");
    System.out.println("\t\t     2.算法-递归方法-组件测试");
    System.out.println("\t\t     3.prime_v1（1个数）组件的测试");
    System.out.println("\t\t     4.prime_v2（1个数，区间）组件的测试");
    System.out.println("\t\t     5.BigInteger测试");
    System.out.println("\t\t     6.primeThread_v1 线程版本的测试");
    System.out.println("\t\t     7.primeThread_v2 线程和BigTnteger版本测试");
    System.out.println("\t\t     8.退出");
    System.out.println("\n\t\t--------------------------------------------------------------\n");
    }

    public static void testPrime01(){
        prime_algorithm_1 demo = new prime_algorithm_1();
        demo.getPrimeNumbers();
    }

    public static void testPrime02() {
        prime_algorithm_2 demo = new prime_algorithm_2();
        demo.getPrimeNumbers();
    }

    public static void testPrime_v1() {
        int i = 1;
        prime_v1 myprime = new prime_v1();
        System.out.println("1到100之间的素数有：");
        while (i <= 100){
            if (myprime.isPrime(i))
            {
                System.out.println(" "+ i);
            }
            i++;
        }
    }

    public static  void testPrime_v2() {
        prime_v2 myprime = new prime_v2();
        System.out.println("1到100的素数有:");
        Vector v = myprime.getPrimes(1, 100);
        System.out.println(v.toString());
    }
    private static void testBigInteger() {
        System.out.println("使用int类型计算2**n的结果\n");
        int result,n,i;
        result = 1;
        n = 30;
        System.out.println("2**"+n+" = ");
        for (i = 1; i < n+1; i++) {
            result = result * 2;
        }
        System.out.println(result+"\n");
        result = 1;
        n = 31;
        System.out.println("2**"+n+" = ");
        for (i = 1; i < n+1; i++) {
            result = result * 2;
        }
        System.out.println(result+"\n");
        result = 1;
        n = 32;
        System.out.println("2**"+n+" = ");
        for (i = 1; i < n+1; i++) {
            result = result * 2;
        }
        System.out.println(result+"\n");
        result = 1;
        n = 1000;
        System.out.println("2**"+n+" = ");
        for (i = 1; i < n+1; i++) {
            result = result * 2;
        }
        System.out.println(result+"\n");

        System.out.println("--------------------------\n");
        System.out.println("使用BigInteger类型计算2**n的结果\n");
        BigInteger base = BigInteger.valueOf(2);
        n = 30;
        System.out.println(" 2**"+n+" = ");
        System.out.println(base.pow(n) +"\n");
        n = 31;
        System.out.println(" 2**"+n+" = ");
        System.out.println(base.pow(n) +"\n");
        n = 32;
        System.out.println(" 2**"+n+" = ");
        System.out.println(base.pow(n) +"\n");
        n = 1000;
        System.out.println(" 2**"+n+" = ");
        System.out.println(base.pow(n) +"\n");
    }
}