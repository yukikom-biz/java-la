package basic.ensyu;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class MaxMin {
    public static void main(String[] args) {
        List<Double> numList = Arrays.asList(173.0, 168.2, 167.4, 155.3, 177.0, 170.2, 172.0, 167.3, 178.8);
        Double tmp_max = 0.0;
        Double tmp_min = 100000.0;

        for (Double num : numList) {
            if (num >= tmp_max ){
                tmp_max = num;
            }
            if (num <= tmp_min){
                tmp_min = num;
            }
        }
        System.out.println("max" + tmp_max);
        System.out.println("min" + tmp_min);

    }
}
