package ArrStack;

import java.util.Scanner;
import java.util.Stack;

public class ArrStack {
    public static void main(String[] args) {
        Stack stack = new Stack();
        int[] arr = new int[100];
        Scanner scanner = new Scanner(System.in);

        System.out.print("nhap so phan tu cua mang=");
        int number = scanner.nextInt();


        for (int i = 0; i < number; i++) {
            System.out.printf("arr[%d]=", i + 1);
            arr[i] = scanner.nextInt();
            stack.push(arr[i]);
        }
        System.out.println("your arr:");
        for (int i = 0; i < number; i++) {
            System.out.print(arr[i] + ", ");
        }
        for (int i = 0; i < number; i++) {
            arr[i] = (int) stack.pop();
        }
        System.out.println("\n your arr after reversing:");
        for (int i = 0; i < number; i++) {
            System.out.print(arr[i] + ", ");
        }

        System.out.println("\nenter the string:");
        scanner.nextLine();
        String string = scanner.nextLine();
        for (int i = 0; i < string.length(); i++) {
            stack.push(string.charAt(i));
        }
        for (int i = 0; i < string.length(); i++) {
            System.out.print(stack.pop());
        }
    }
}