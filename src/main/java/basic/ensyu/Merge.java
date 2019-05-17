package basic.ensyu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Merge {
    public static void main(String[] args) {
        Integer[] ary1 = {2, 9, 12, 15, 15, 19, 20, 21};
        Integer[] ary2 = {22, 30, 32, 40, 44, 50, 53, 64, 90, 93};

        List<Integer> intAry1 = new ArrayList<>(Arrays.asList(ary1));
        List<Integer> intAry2 = new ArrayList<>(Arrays.asList(ary2));

        System.out.println(intAry1);
        System.out.println(intAry2);
        System.out.println(intAry1.addAll(intAry2));
        System.out.println(intAry1);
    }
}
