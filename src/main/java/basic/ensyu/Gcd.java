package basic.ensyu;

import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        System.out.println("input two numbers(split by space)");
        Scanner sc = new Scanner(System.in);
        int inputFirstNum = sc.nextInt();
        int inputSecondNum = sc.nextInt();
        int rest = 1;
        int devide_num = inputSecondNum;
        while (rest != 0){
            if (inputFirstNum < inputSecondNum){
                devide_num = inputFirstNum;
                inputFirstNum = inputSecondNum;
            }
            rest = inputFirstNum % devide_num;
            if (rest != 0) {
                devide_num = rest;
            }
        }
        System.out.println("Result: " + devide_num);
    }
}


/**
 *TODO:
 * 再帰関数を使うと１行になる。
 */