package PalindromeQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the string:");
        String string = scanner.nextLine();
        checkPalindrome(string);
    }

    public static void checkPalindrome(String string) {
        Stack stack = new Stack();
        Queue queue = new LinkedList();
        for (int i = 0; i < string.length(); i++) {
            stack.push(string.charAt(i));
            queue.add(string.charAt(i));
        }
        for (int i = 0; i < string.length() / 2; i++) {
            if (stack.pop() != queue.poll()) {
                System.out.println("False");
                return;
            }
        }
        System.out.println("True");
    }
}
