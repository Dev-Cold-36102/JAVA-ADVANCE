package StudentMange;


public class Student {
    private int index;
    private int age;
    private String id;
    private String name;
    private String address;
    private String position;

    private int LeverOfPosition;


    public Student(int index, String id, String name, int age, String address, String position) {
        this.index = index;
        this.age = age;
        this.id = id;
        this.name = name;
        this.address = address;
        this.position = position;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getIndex() {
        return this.index;
    }

    public void setId(int index) {
        this.index = index;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPosition() {
        return this.position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getLeverOfPosition() {
        return this.LeverOfPosition;
    }

    public void setLeverOfPosition(int leverOfPosition) {
        LeverOfPosition = leverOfPosition;
    }

    public void displayAndSetLeverOfPosition() {
        System.out.printf("%-10s%-10s%-20s%-10s%-20s%-20s\n", this.index, this.id, this.name, this.age, this.address, this.position);
        switch (this.position) {
            case "Fresher":
                this.LeverOfPosition = 0;
                break;
            case "Junior":
                this.LeverOfPosition = 1;
                break;
            case "Senior":
                this.LeverOfPosition = 2;
                break;
            case "Dev":
                this.LeverOfPosition = 3;
                break;
            case "Tester":
                this.LeverOfPosition = 4;
                break;
            case "Manager":
                this.LeverOfPosition = 5;
                break;

        }
    }


}
