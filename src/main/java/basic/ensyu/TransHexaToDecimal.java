package basic.ensyu;

import java.util.Scanner;

public class TransHexaToDecimal {
    public static void main(String[] args) {

        System.out.println("Input Hexa");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        int calcResult = convertToDecimal(input);
        System.out.println(String.format("入力された値の 10 進数は %d です",calcResult));

    }
    private static int convertToDecimal(String input) {
        int result = 0;

        for (int i = 0; i < input.length(); i++) {
            char inputChar = input.charAt(i);
            try{
                int inputCharInt =Integer.parseInt(String.valueOf(inputChar));
                result = inputCharInt;
                System.out.println(inputCharInt);
            }catch (NumberFormatException e){
                int aCharInt = inputChar;
                result = (int) (result + Math.pow(16,i) * (aCharInt - 'A' + 10) );
            }
        }
        return result;
    }
}


