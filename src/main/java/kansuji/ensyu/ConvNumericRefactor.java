package kansuji.ensyu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ConvNumericRefactor {
    public static void main(String[] args) {
        String[] digit_low = {"一","十", "百", "千"};
        String[] digit_hight = {"一","十", "百", "千", "万", "億", "兆", "京", "垓"};
        String[] counterNum = {"一", "二", "三", "四", "五", "六", "七", "八", "九"};

        ArrayList<String> digitLowAry = new ArrayList<>(Arrays.asList(digit_low));
        ArrayList<String> digitHigthAry = new ArrayList<>(Arrays.asList(digit_hight));
        ArrayList<String> counterNumAry = new ArrayList<>(Arrays.asList(counterNum));

        System.out.println("漢数字で入力");
        Scanner sc = new Scanner(System.in);
        String inputtext = sc.next();


    }
}
