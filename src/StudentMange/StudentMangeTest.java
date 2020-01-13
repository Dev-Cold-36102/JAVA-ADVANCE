package StudentMange;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;


public class StudentMangeTest {
    public static void main(String[] args) {

        LinkedList listStudent = new LinkedList();
        Student student1 = new Student(1, "HV01", "nhat", 20, "co lam", "Dev");
        listStudent.add(student1);
        Student student2 = new Student(2, "HV02", "khai", 19, "trung chinh", "Dev");
        listStudent.add(student2);
        Student student3 = new Student(3, "HV03", "giang", 22, "hai duong", "Dev");
        listStudent.add(student3);
        Student student4 = new Student(3, "HV03", "giang", 22, "hai duong", "Dev");
        listStudent.add(student4);
        Student student5 = new Student(3, "HV03", "giang", 22, "hai duong", "Fresher");
        listStudent.add(student5);
        displayList(listStudent);
    }

    public static void displayList(LinkedList listStudent) {
        System.out.printf("%-10s%-10s%-20s%-10s%-20s%-20s\n", "STT", "MA HV(ID)", "Ho Va Ten", "Tuoi", "Que Quan", "Chuc Vu");
        Iterator<Student> ite = listStudent.iterator();
        while (ite.hasNext()) {
            ite.next().displayAndSetLeverOfPosition();
        }
        displayMenu(listStudent);

    }

    public static void displayMenu(LinkedList listStudent) {
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("1. Add Student");
        System.out.println("2. Remove Student");
        System.out.println("3. Change InfoStudent");
        System.out.println("4. Remove All");
        System.out.println("5. Find Student");
        System.out.println("6. Sort Student");
        System.out.println("-----------------------------------------------------------------------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the index (1-6):");
        int indexChoose = scanner.nextInt();
        StudentManage manage = new StudentManage(listStudent);
        switch (indexChoose) {
            case 1:
                manage.addStudent();
                break;
            case 2:
                manage.removeStudent();
                break;
            case 3:
                manage.changInfoStudent();
                break;
            case 4:
                manage.removeAll();
                break;
            case 5:
                manage.findStudent();
                break;
            case 6:
                manage.sortStudent();
                break;
        }

    }

}
