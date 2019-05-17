package basic.ensyu;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SerachString {
    public static void main(String[] args) {
        while (true){
            System.out.println("Input Strings");
            Scanner sc = new Scanner(System.in);
            String input = sc.next();
            if (isFound(input)){
                System.out.println("Found");
            }else {
                System.out.println("Not Found");
            }
        }
    }

    private static boolean isFound(String input) {
        String[] str= {"apple", "orange", "melon", "peach"};
        ArrayList<String> strings = new ArrayList<>(Arrays.asList(str));
        return strings.stream().anyMatch(s -> s.equals(input));
    }
}
