package basic.ensyu;

public class Shape {
    public static void main(String[] args) {
//        int maxcount_1 = 11;
//        int maxcount_2 = 6;
        String output = "*";
        int discount = 6;
        for (int i = 0; i < 11; i++) {
            if (i<6) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(output);
                }
            }else{
                discount = discount - 1;
                for (int j = discount; j > 0; j--) {
                    System.out.print(output);
                }
            }
            System.out.println();
        }

        //master K
//        int MAX = 5;
        for (int i = 0; i < 11; i++) {
            int tmp_num = 6 - Math.abs(5 - i);
            for (int j = 0; j < tmp_num; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    //master k-2
        final int MAX = 6;
        for (int i = -1 * MAX; i <= MAX; i++) {
            int num = MAX + 1 - Math.abs(i);
            for (int j = 0; j < num; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
