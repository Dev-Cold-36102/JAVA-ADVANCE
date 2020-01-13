package StudentMange;

import java.util.*;

import static StudentMange.StudentMangeTest.displayList;

public class StudentManage {
    Scanner scanner = new Scanner(System.in);
    LinkedList listStudent = new LinkedList();

    public StudentManage(LinkedList listStudent) {
        this.listStudent = listStudent;
    }

    public void addStudent() {
        int index = this.listStudent.size() + 1;
        System.out.print("please enter the ID: ");
        String id = scanner.nextLine();
        System.out.print("please enter the name: ");
        String name = scanner.nextLine();
        System.out.print("please enter the age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("please enter the address: ");
        String address = scanner.nextLine();
        System.out.print("please enter the position(Fresher/Junior/Senior/Dev/Tester/Manager: ");
        String position = scanner.nextLine();
        Student newStudent = new Student(index, id, name, age, address, position);
        this.listStudent.add(newStudent);
        displayList(this.listStudent);


    }

    public void removeStudent() {
        System.out.print("what index you want to remove? ");
        int indexRemove = scanner.nextInt();
        int indexTest = 0;
        this.listStudent.remove(indexRemove - 1);
        Iterator<Student> ite = listStudent.iterator();
        while (ite.hasNext()) {
            if (indexTest >= indexRemove - 1) {
                ite.next().setId(indexTest + 1);
            } else {
                ite.next();
            }
            indexTest++;
        }
        //cach 2 de hien thi dung thu tu

//        for (int i = idRemove-1; i <this.listStudent.size() ; i++) {
//            ((Student)(this.listStudent.get(i))).setId(i+1);
//        }
        displayList(this.listStudent);
    }

    public void changInfoStudent() {
        System.out.print("please enter the index : ");
        int indexChange = scanner.nextInt();
        System.out.print("\n");

        scanner.nextLine();

        System.out.print("ID= ");
        String newID = scanner.nextLine();
        System.out.print("\n");

        System.out.print("Name= ");
        String newName = scanner.nextLine();
        System.out.print("\n");

        System.out.print("AGE= ");
        int newAge = scanner.nextInt();
        System.out.print("\n");

        System.out.print("Address= ");
        String newAddress = scanner.nextLine();
        System.out.print("\n");

        System.out.print("Position= ");
        String newPosition = scanner.nextLine();
        System.out.print("\n");
        Student newStudent = new Student(indexChange, newID, newName, newAge, newAddress, newPosition);
        this.listStudent.set(indexChange - 1, newStudent);
        displayList(this.listStudent);
    }

    public void removeAll() {
        System.out.print("Are you sure? y/n : ");
        String submit = scanner.nextLine();
        if (submit.equals("y")) {
            this.listStudent.removeAll(this.listStudent);
        }
        displayList(this.listStudent);
    }

    public void findStudent() {
        System.out.println("what value you want to find?");
        System.out.println("1. index");
        System.out.println("2. ID");
        System.out.println("3. name");
        System.out.println("4. age");
        System.out.println("5. address");
        System.out.println("6. position");
        System.out.print("choose: ");
        int valueToFind = scanner.nextInt();
        scanner.nextLine();
        switch (valueToFind) {
            case 1:
                findIndex();
                break;
            case 2:
                findID();
                break;
            case 3:
                findName();
                break;
            case 4:
                findAge();
                break;
            case 5:
                findAddress();
                break;
            case 6:
                findPosition();
                break;
        }

    }

    public void sortStudent() {
        System.out.println("sort by:\n1.ID\n2.Name\n3.Age\n4.Address\n5.Lever Of Position");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                sortByID();
                break;
            case 2:
                sortByName(this.listStudent);
                break;
            case 3:
                sortByAge();
                break;
            case 4:
                sortByAddress();
                break;
            case 5:
                sortByLeverofPositon();
                break;
        }
        for (int i = 0; i < this.listStudent.size(); i++) {
            ((Student) (this.listStudent.get(i))).setId(i + 1);
        }
        displayList(listStudent);
    }

    public void findID() {
        System.out.print("Enter the ID: ");
        String findID = scanner.nextLine();
        for (int i = 0; i < this.listStudent.size(); i++) {
            if (((Student) (this.listStudent.get(i))).getId().equals(findID)) {
                System.out.printf("%-10s%-10s%-20s%-10s%-20s%-20s\n", "STT", "MA HV(ID)", "Ho Va Ten", "Tuoi", "Que Quan", "Chuc Vu");
                ((Student) (this.listStudent.get(i))).displayAndSetLeverOfPosition();
                return;
            }
        }
        System.out.println("NO FIND");
        backToHome();
    }

    public void findIndex() {
        System.out.print("Enter the index: ");
        int findIndex = scanner.nextInt();
        for (int i = 0; i < this.listStudent.size(); i++) {
            if (((Student) (this.listStudent.get(i))).getIndex() == findIndex) {
                System.out.printf("%-10s%-10s%-20s%-10s%-20s%-20s\n", "STT", "MA HV(ID)", "Ho Va Ten", "Tuoi", "Que Quan", "Chuc Vu");
                ((Student) (this.listStudent.get(i))).displayAndSetLeverOfPosition();
                return;
            }
        }
        System.out.println("NO FIND");
        backToHome();
    }

    public void findName() {
        System.out.print("Enter the name: ");
        String findName = scanner.nextLine();
        int count = 0;

        for (int i = 0; i < this.listStudent.size(); i++) {
            if (((Student) (this.listStudent.get(i))).getName().equals(findName)) {
                if (count < 1) {
                    System.out.printf("%-10s%-10s%-20s%-10s%-20s%-20s\n", "STT", "MA HV(ID)", "Ho Va Ten", "Tuoi", "Que Quan", "Chuc Vu");
                }

                ((Student) (this.listStudent.get(i))).displayAndSetLeverOfPosition();
                count++;
            }
        }
        if (count == 0) {
            System.out.println("NO FIND");
        }
        backToHome();
    }

    public void findAge() {
        System.out.print("Enter the age: ");
        int findAge = scanner.nextInt();
        for (int i = 0; i < this.listStudent.size(); i++) {
            if (((Student) (this.listStudent.get(i))).getAge() == findAge) {
                System.out.printf("%-10s%-10s%-20s%-10s%-20s%-20s\n", "STT", "MA HV(ID)", "Ho Va Ten", "Tuoi", "Que Quan", "Chuc Vu");
                ((Student) (this.listStudent.get(i))).displayAndSetLeverOfPosition();
                return;
            }
        }
        System.out.println("NO FIND");
        backToHome();
    }

    public void findAddress() {
        System.out.print("Enter the address: ");
        String findAddress = scanner.nextLine();
        int count = 0;

        for (int i = 0; i < this.listStudent.size(); i++) {
            if (((Student) (this.listStudent.get(i))).getAddress().equals(findAddress)) {
                if (count < 1) {
                    System.out.printf("%-10s%-10s%-20s%-10s%-20s%-20s\n", "STT", "MA HV(ID)", "Ho Va Ten", "Tuoi", "Que Quan", "Chuc Vu");
                }

                ((Student) (this.listStudent.get(i))).displayAndSetLeverOfPosition();
                count++;
            }
        }
        if (count == 0) {
            System.out.println("NO FIND");
        }
        backToHome();
    }

    public void findPosition() {
        System.out.print("Enter the position: ");
        String findPosition = scanner.nextLine();
        int count = 0;

        for (int i = 0; i < this.listStudent.size(); i++) {
            if (((Student) (this.listStudent.get(i))).getPosition().equals(findPosition)) {
                if (count < 1) {
                    System.out.printf("%-10s%-10s%-20s%-10s%-20s%-20s\n", "STT", "MA HV(ID)", "Ho Va Ten", "Tuoi", "Que Quan", "Chuc Vu");
                }

                ((Student) (this.listStudent.get(i))).displayAndSetLeverOfPosition();
                count++;
            }
        }
        if (count == 0) {
            System.out.println("NO FIND");
        }
        backToHome();
    }

    public void backToHome() {
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.print("enter 'y' to back to home: ");
        String submit = scanner.nextLine();
        if (submit.equals("y")) {
            displayList(this.listStudent);
        }
    }

    public void sortByAge() {
        Collections.sort(this.listStudent, new Comparator<Student>() {
            @Override
            public int compare(Student student1, Student student2) {
                return (student1.getAge() - student2.getAge());
            }
        });
        System.out.println("bang so lieu sau khi sap xep:");

    }

    public void sortByName(LinkedList listStudent) {
        Collections.sort(listStudent, new Comparator<Student>() {
            @Override
            public int compare(Student student1, Student student2) {
                return (student1.getName().compareTo(student2.getName()));
            }
        });
        System.out.println("bang so lieu sau khi sap xep:");

    }

    public void sortByID() {
        Collections.sort(this.listStudent, new Comparator<Student>() {
            @Override
            public int compare(Student student1, Student student2) {
                return (student1.getId().compareTo(student2.getId()));
            }
        });
        System.out.println("bang so lieu sau khi sap xep:");

    }

    public void sortByAddress() {
        Collections.sort(this.listStudent, new Comparator<Student>() {
            @Override
            public int compare(Student student1, Student student2) {
                return (student1.getAddress().compareTo(student2.getAddress()));
            }
        });
        System.out.println("bang so lieu sau khi sap xep:");

    }

    public void sortByLeverofPositon() {
        Collections.sort(this.listStudent, new Comparator<Student>() {
            @Override
            public int compare(Student student1, Student student2) {
                return (student1.getLeverOfPosition()-student2.getLeverOfPosition());
            }
        });
        System.out.println("bang so lieu sau khi sap xep:");

    }
}
