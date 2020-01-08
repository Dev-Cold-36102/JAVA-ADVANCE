package TDD;

import java.util.Scanner;

public class AbsoluteNumberCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the number: ");
        double number = scanner.nextDouble();
        if (number >= 0) {
            System.out.println(" Abs=" + number);
        } else System.out.println("Abs=" + (-number));
    }

}
