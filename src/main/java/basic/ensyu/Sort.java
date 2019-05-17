package basic.ensyu;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] str = {7, 10, 5, 4, 2, 22, 21, 3};

        System.out.println("--Insert Sort--");
        System.out.println(Arrays.toString(str));

        for (int notIndexedNum = 1; notIndexedNum < str.length; notIndexedNum++) {
            int tmpNum = str[notIndexedNum];
            for (int tmpPosition = notIndexedNum; ((tmpPosition - 1) >= 0) && (tmpNum < str[tmpPosition - 1]); tmpPosition--){
                str[tmpPosition] = str[tmpPosition - 1];
                str[tmpPosition - 1] = tmpNum;
            }
        }
        System.out.println(Arrays.toString(str));
    }
}
