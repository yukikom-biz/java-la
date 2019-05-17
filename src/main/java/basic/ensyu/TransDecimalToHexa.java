package basic.ensyu;

import java.util.Scanner;

public class TransDecimalToHexa {
    public static void main(String[] args) {
        System.out.println("Input Decimal");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        String calcResult = convertToHexa(input);

        System.out.println(String.format("入力された値の 16 進数は %s です",calcResult));
    }

    private static String convertToHexa(String input) {
        int inputNum = Integer.parseInt(input);
//        int tmp_num = 100;
        StringBuilder hexaResult = new StringBuilder();

        while (inputNum != 0){
//            tmp_num = tmp_num % 16;
            switch (inputNum%16) {
                case 0:
                    hexaResult.append("0");
                    break;
                case 1:
                    hexaResult.append("1");
                    break;
                case 2:
                    hexaResult.append("2");
                    break;
                case 3:
                    hexaResult.append("3");
                    break;
                case 4:
                    hexaResult.append("4");
                    break;
                case 5:
                    hexaResult.append("5");
                    break;
                case 6:
                    hexaResult.append("6");
                    break;
                case 7:
                    hexaResult.append("7");
                    break;
                case 8:
                    hexaResult.append("8");
                    break;
                case 9:
                    hexaResult.append("9");
                    break;
                case 10:
                    hexaResult.append("A");
                    break;
                case 11:
                    hexaResult.append("B");
                    break;
                case 12:
                    hexaResult.append("C");
                    break;
                case 13:
                    hexaResult.append("D");
                    break;
                case 14:
                    hexaResult.append("E");
                    break;
                case 15:
                    hexaResult.append("F");
                    break;
            }
//            t
            inputNum = inputNum / 16;
        }
        return hexaResult.reverse().toString();
    }
}
