package HashmapExercise.TreeNumber;

import java.util.Scanner;

public class TreeNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter the amount of array: ");
        int amountOfArr = scanner.nextInt();
        int[] arrayNumber = new int[amountOfArr];
        System.out.println("input the array:");
        for (int i = 0; i < arrayNumber.length; i++) {
            System.out.printf("arr[%d]= ", i + 1);
            arrayNumber[i] = scanner.nextInt();
        }
        TreeNumber treeNumber = new TreeNumber();
        for (int element : arrayNumber) {
            treeNumber.addNumber(element);
        }

        System.out.print("input number want to find: ");
        int numberFind = scanner.nextInt();
        treeNumber.findNumber(numberFind);
    }
}
