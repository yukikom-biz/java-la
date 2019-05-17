package dat.ensyu;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Recording {

    public static final String title = "", section = "", story = "";
    public static final Calendar postCarender = null;
    public static final Date postDate = null;

    public Recording() {
        System.out.println("--please input Detail--");
        System.out.println("title:");
        Scanner scanner = new Scanner(System.in);
        String title = scanner.next();
        System.out.println("section:");
        String section = scanner.next();
        System.out.println("story:");
        String story = scanner.next();
        Date postDate = new Date();
        Calendar postCarender = Calendar.getInstance();
        int year = postCarender.get(Calendar.YEAR);
        int month = postCarender.get(Calendar.MONTH) + 1;
        int date = postCarender.get(Calendar.DATE);

        System.out.println("--------------作 品 紹 介-------------");
        System.out.println(String.format("Title: %s", title));
        System.out.println(String.format("Section: %s", section));
        System.out.println(String.format("Story: %s", story));
        System.out.println(String.format("Date: %s",String.valueOf(postDate)));
        System.out.println(String.format("Year: %s",String.valueOf(year)));
        System.out.println(String.format("Month: %s",String.valueOf(month)));
        System.out.println(String.format("Date: %s",String.valueOf(date)));
        System.out.println("-----------------------------------------------");
    }
}
