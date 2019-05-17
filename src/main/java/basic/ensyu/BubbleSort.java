package basic.ensyu;

import java.util.ArrayList;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] str = {7, 10, 5, 4, 2};
        System.out.println(Arrays.toString(str));

        int left_num = 0;
        int right_num = 0;

        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < (str.length - i - 1); j++) {
                left_num = str[j];
                right_num = str[j + 1];
                if (left_num > right_num) {
                    str[j] = right_num;
                    str[j + 1] = left_num;
                }
            }
        }
        System.out.println(Arrays.toString(str));
    }
}
