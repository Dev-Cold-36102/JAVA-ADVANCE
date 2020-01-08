package TDD;

import java.util.Scanner;

public class NextDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("day:");
        int day = scanner.nextInt();
        System.out.print("month:");
        int month = scanner.nextInt();
        System.out.print("year:");
        int year = scanner.nextInt();
        DayOfMonth dayOfMonth = new DayOfMonth(month, day);
        int dayCalendar = dayOfMonth.getDayOfMonth();
        if (day == dayCalendar) {
            day = 1;
            if (month == 12) {
                month = 1;
                year++;
            } else month++;

        } else {
            day++;
        }
        System.out.printf("the next year/mont/day:%d/%d/%d", year, month, day);
    }
}
