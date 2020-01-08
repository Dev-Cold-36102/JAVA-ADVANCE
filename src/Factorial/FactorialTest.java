package Factorial;

import java.util.Scanner;

public class FactorialTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the number:");
        int number = scanner.nextInt();
        Factorial factorial = new Factorial(number);
        System.out.println(factorial.getFactorial(number));
    }
}
