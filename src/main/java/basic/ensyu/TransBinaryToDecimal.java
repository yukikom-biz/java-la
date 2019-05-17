package basic.ensyu;

import java.util.Scanner;

public class TransBinaryToDecimal {
    public static void main(String[] args) {
        System.out.println("Input Binary");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        int calcResult = convertToDecimal(input);

        System.out.println(String.format("入力された値の 10 進数は %d です",calcResult));
    }

    private static int convertToDecimal(String input) {
        int result = 0;
        for (int i = 0; i < input.length() ; i++) {
            if (input.charAt(i) == '1' ) {
//                Integer.parseInt(input.charAt(i) + "")
                result = result + (int) Math.pow(2,i);
            }
//            System.out.println(result);
        }
        return result;
    }
}
