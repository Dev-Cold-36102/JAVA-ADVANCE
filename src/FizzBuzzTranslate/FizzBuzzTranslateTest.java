package FizzBuzzTranslate;

import java.util.Scanner;

public class FizzBuzzTranslateTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the number:");
        int number = scanner.nextInt();
        FizzBuzzTranslate fizzBuzzTranslate = new FizzBuzzTranslate(number);
        fizzBuzzTranslate.displayFizzBuzz();
        System.out.print("\n");
        fizzBuzzTranslate.Translate();
    }

}
