package basic.ensyu;


import java.util.Scanner;

import static java.lang.Integer.*;

public class TransDecimalToBinary {
    public static void main(String[] args) {
        System.out.println("Input Decimal");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        String calcResult = convertToBinary(input);

        System.out.println(String.format("入力された値の 2 進数は %s です",calcResult));
    }

    private static String convertToBinary(String input) {
        int devided_num = parseInt(input);
//        ArrayList<Integer> binaryResult = new ArrayList<>();
        StringBuilder binaryResult = new StringBuilder();

        while (devided_num != 0){
            int tmpDev = devided_num % 2;
                 devided_num = devided_num / 2;
            if(tmpDev == 1){
                binaryResult.append("1");
            }else {
                binaryResult.append("0");
            }
        }
        return binaryResult.reverse().toString();
    }
}
