package StaffManage;

public class Staff {
    private String name;
    private String gender;
    private int age;

    public Staff() {
    }

    public Staff(String name, int age, String gender) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void displayInfo() {
        System.out.printf("%-30s%-10s%-10s\n", this.name, this.age, this.gender);
    }

//    @Override
//    public int compare(Staff staff, Staff staff1) {
//        return (staff.getAge()-staff1.getAge());
//    }
}
