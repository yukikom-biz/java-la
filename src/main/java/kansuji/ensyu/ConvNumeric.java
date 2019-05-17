package kansuji.ensyu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ConvNumeric {
    public static void main(String[] args) {
        String[] digit_low = {"十", "百", "千"};
        String[] digit_hight = {"万", "億", "兆", "京", "垓"};
//        String[] counterNum = {"一", "二", "三", "四", "五", "六", "七", "八", "九"};

        ArrayList<String> digitLowAry = new ArrayList<>(Arrays.asList(digit_low));
        ArrayList<String> digitHigthAry = new ArrayList<>(Arrays.asList(digit_hight));
//        ArrayList<String> counterNumAry = new ArrayList<>(Arrays.asList(counterNum));

        System.out.println("Input 漢数字で入力");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        long numericNum = 0;
        int counter = 1;
        boolean isNotDigit = true;

        for (int i = 0; i < input.length(); i++) {
            long tmp_num = 0;

            while (isNotDigit && i < input.length()) {

                char tmpChar = input.charAt(i);

                int tmpCounter = CounterNumchecker(tmpChar);

                if (tmpCounter != 1) {
                    counter = tmpCounter;
                }

                if (digitLowAry.contains(tmpChar + "")) {

                    tmp_num += counter * digitLowChecker(tmpChar);
                    counter = 1;

                } else if (digitHigthAry.contains(tmpChar + "")) {

                    if (tmp_num == 0) {
                        tmp_num += counter;
                    }

                    tmp_num *= digitHightChecker(tmpChar);

                    isNotDigit = false;

                } else if (i == (input.length() - 1) || 1 != digitHightChecker(input.charAt(i+1))) {

                    tmp_num += counter;

                }

                i++;

            }
            numericNum += tmp_num;
            isNotDigit = true;
            i--;

        }
        System.out.println("The Number is:" + numericNum);
    }

    private static long digitHightChecker(char digit) {
        switch (digit) {
            case '万':
                return 10000;
            case '億':
                return 100000000;
            case '兆':
                return 1000000000000L;
            case '京':
                return 10000000000000000L;
//            case '垓':
//                return 100000000000000000000L;
            default:
                return 1;
        }
    }

    private static int digitLowChecker(char digit) {
        switch (digit) {
            case '十':
                return 10;
            case '百':
                return 100;
            case '千':
                return 1000;
            default:
                return 1;
        }
    }

    private static int CounterNumchecker(char counterChar) {
        switch (counterChar) {
            case '二':
                return 2;
            case '三':
                return 3;
            case '四':
                return 4;
            case '五':
                return 5;
            case '六':
                return 6;
            case '七':
                return 7;
            case '八':
                return 8;
            case '九':
                return 9;
            default:
                return 1;
        }
    }
}


