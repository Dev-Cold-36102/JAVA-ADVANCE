package TriangleClassifier;

import java.util.Scanner;

public class TriangleClassifierTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("side1=");
        double side1 = scanner.nextDouble();
        System.out.print("side2=");
        double side2 = scanner.nextDouble();
        System.out.print("side3=");
        double side3 = scanner.nextDouble();
        TriangleClassifier checkRetangle = new TriangleClassifier(side1, side2, side3);
        checkRetangle.typeOfRetange();
    }
}
