package Binary;

import java.util.Scanner;
import java.util.Stack;

public class BinaryStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the number of decimal: ");
        int decimal = scanner.nextInt();
        decimalToBinary(decimal);
        scanner.nextLine();
        System.out.println("binary=");
        String binary = scanner.nextLine();
        BinaryToDecimal(binary);

    }

    public static void decimalToBinary(int decimal) {
        Stack<Integer> surplus = new Stack();
        while (decimal != 0) {
            surplus.push(decimal % 2);
            decimal = decimal / 2;
        }
        String result = "";
        while (!surplus.isEmpty()) {
            result += surplus.pop();
        }
        System.out.println("result=" + result);
    }

    public static void BinaryToDecimal(String binary) {
        int j = binary.length();
        int decimal = 0;
        for (int i = 0; i < binary.length(); i++) {
            j--;
            if ((int) binary.charAt(i) - 48 == 1) {
                decimal += Math.pow(2, j);
            }
        }
        System.out.println("result=" + decimal);
    }
}
