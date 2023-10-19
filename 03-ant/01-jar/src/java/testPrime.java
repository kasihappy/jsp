package org.sujun.Tutorial.java.prime.test;

import java.util.Scanner;
import org.sujun.Tutorial.java.prime.components.prime_algorithem_1;
import org.sujun.Tutorial.java.prime.components.prime_algorithem_2;

public class testPrime {
    public static void main(String[] args) {
        boolean flag;
        int no;
        do {
            flag = true;
            mainMenu();
            Scanner input = new Scanner(System.in);
            try {
                no = input.nextInt();
            } catch (Exception e) {
                no = -1;
            }
            switch (no) {
                case 1:
                    testPrime01();
                    break;
                case 2:
                    testPrime02();
                    break;
                case 3:
                    System.out.println("\n\n\t\t 感谢使用！欢迎再来! \n\n");
                    flag = true;
                    break;
                default:
                    System.out.println("\t输入错误,请输入(1-3)!");
            }
        } while (flag);
    }

    public static void testPrime01() {
        demo1 = new prime_algorithem_1();
        demo1.getPrimeNum();
    }

    public static void testPrime02() {
        demo2 = new prime_algorithem_2();
        demo2.getPrimeNum();
    }
}
