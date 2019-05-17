package basic.ensyu;

import java.util.*;

public class Numeron {
    public static void main(String[] args) {
        System.out.println("■■■ Numeron ルール■■■\n" +
                "プログラムが 0~9 までの数字 3 つを使つて作成した 3 ケタの番号を当ててください。\n" +
                "ただし、「550」「377」といった同じ数字を 2 つ以上使用した番号はありません。\n" +
                "入力した数字の、「位置」と「数字」が当ってたら「eat」とカウント、「数字」\n" +
                "だけあってたら「bite」とカウントします。\n" +
                "eat : 3 になったら、ゲーム終了です");

        int gameCount = 0;
        int countEat = 0;

        HashSet<String> stringsNum = generateRandNum();
        System.out.println("------ ゲーム開始 ------");
        System.out.println(stringsNum);

        while (countEat != 3){

            gameCount = gameCount + 1;

            System.out.println("3 文字の数値を入力して下さい");
            Scanner sc = new Scanner(System.in);
            String inputNum = sc.next();
            countEat = checkEat(inputNum, stringsNum);
            long countBite = checkBite(inputNum, stringsNum);
            System.out.println(String.format("eat : %d bite : %d",countEat, countBite -countEat));
            System.out.println(String.format("------ %d 回目 ------", gameCount));
        }
        System.out.println(String.format("------ ゲーム終了 ------\n" +
                "実施回数は %d 回でした", gameCount));

    }

    private static long checkBite(String inputNum, HashSet<String> stringsNum) {
        return stringsNum.stream().filter(inputNum::contains).count();
    }

    private static int checkEat(String inputNum, HashSet<String> stringsNum) {
        int i = 0,count = 0;
        for (String s : stringsNum) {
            if(s.equals(inputNum.charAt(i) + "")){
                count++;
            }
            i++;
        }
        return count;
    }

    private static HashSet<String> generateRandNum() {

        Set<String> setNumbersHash = new HashSet<String>();

        while (setNumbersHash.size() != 3){
            Random rand = new Random();

            Integer randInt = rand.nextInt(1000) + 1000;

            String randIntStr = randInt.toString();

            setNumbersHash.add(randIntStr.charAt(1) + "");
            setNumbersHash.add(randIntStr.charAt(2) + "");
            setNumbersHash.add(randIntStr.charAt(3) + "");
        }
        return (HashSet<String>) setNumbersHash;
    }
}

//        ArrayList<String> stringsNum = generateNum();
//
//    int countEat = 0;
//        int countBite = 0;
//
//        Scanner sc = new Scanner(System.in);
//        Integer inputNumFirst = sc.nextInt();
//        Integer inputNumSecond = sc.nextInt();
//        Integer inputNumTherd = sc.nextInt();
//
//        ArrayList<String> inputNumList = new ArrayList<>();
//
//
//
//        while (countEat != 3) {
//
//            countEat = countEat + checkEat(inputNumfirst, stringsNum.get(countEat),countEat);
//            countBite = countBite + checkBite(inputNumfirst,stringsNum);
//        }
//        System.out.println("End");
//    }
//
//    private static int checkBite(Integer inputNum, ArrayList<String> stringsNum) {
//        if (stringsNum.stream().anyMatch(s -> s.equals(inputNum))){
//            System.out.println("bite");
//            return 1;
//        }else {
//            return 0;
//        }
//    }
//
//    private static int checkEat(Integer inputNum, String s, int count) {
////        int count = 0;
//        if (inputNum.toString() == s){
//            System.out.println("eat");
//            return 1;
//        }else{
////            System.out.println("bite");
////            Scanner sc = new Scanner(System.in);
////            inputNum = sc.nextInt();
////            checkEat(inputNum, s,count);
//            return 0;
//        }
//    }
//
//    public static final ArrayList<String> generateNum(){
////        double random = Math.random();
//        Random rand = new Random();
//        Integer randInt = rand.nextInt(1000) + 1000;
//
//        String randIntStr = randInt.toString();
//
//        ArrayList<String> numList = new ArrayList<>();
//        numList.add(randIntStr.charAt(1) + "");
//        numList.add(randIntStr.charAt(2) + "");
//        numList.add(randIntStr.charAt(3) + "");
//
//        return numList;
////        String[] str= {"1", "2", "3", "4","5","6","7","8","9"};
////        ArrayList<String> strings = new ArrayList<>(Arrays.asList(str));
//
//
//    }
//}
