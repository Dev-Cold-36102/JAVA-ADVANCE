package Palindrome;

import java.util.Scanner;

public class PalindromeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = "";
        do {
            System.out.println("please enter the string:");
            string = scanner.nextLine();
        } while (string.equals(String.valueOf("")));
        int i = 0, j = string.length() - 1;
        Palindrome palindrome = new Palindrome(string);
        System.out.println(palindrome.checkPalindrome(i, j));
    }
}
