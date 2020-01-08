package TriangleClassifier;

public class TriangleClassifier extends Shape {
    TriangleClassifier(double side1, double side2, double side3) {
        super(side1, side2, side3);
    }

    public boolean checkRetange() {
        if ((this.side1 + this.side2) > this.side3 && (this.side1 + this.side3) > this.side2 && (this.side2 + this.side3) > this.side1) {
            return true;
        } else return false;
    }

    public void typeOfRetange() {
        if (checkRetange()) {
            boolean check1 = (Math.pow(this.side1, 2) + Math.pow(this.side2, 2)) == Math.pow(this.side3, 2);
            boolean check2 = (Math.pow(this.side1, 2) + Math.pow(this.side3, 2)) == Math.pow(this.side2, 2);
            boolean check3 = (Math.pow(this.side3, 2) + Math.pow(this.side2, 2)) == Math.pow(this.side1, 2);
            if (this.side3 == this.side1 && this.side3 == this.side2) {
                System.out.println("tam giac deu");
            } else if (this.side1 == this.side2 || this.side1 == this.side3 || this.side3 == this.side2) {
                System.out.println("tam giac can");
            } else if (check1 || check2 || check3) {
                System.out.println("tam giac vuong");
            } else System.out.println("tam giac thuong");
        } else
            System.out.println("khong phai tam giac");
    }
}

