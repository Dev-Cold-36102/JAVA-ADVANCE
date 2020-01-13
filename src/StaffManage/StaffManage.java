package StaffManage;


import java.util.*;

public class StaffManage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Staff staff1 = new Staff("khai", 1990, "Male");
        Staff staff2 = new Staff("nhat", 2000, "Female");
        Staff staff3 = new Staff("hoa", 1998, "Male");
        Staff staff4 = new Staff("anh", 1988, "Female");
        Staff staff5 = new Staff("cong", 1999, "Male");
        Staff staff6 = new Staff("ha", 2003, "Female");
        ArrayList<Staff> listStaff = new ArrayList<>();
        listStaff.add(staff1);
        listStaff.add(staff2);
        listStaff.add(staff3);
        listStaff.add(staff4);
        listStaff.add(staff5);
        listStaff.add(staff6);
        displayList(listStaff);
        System.out.println("------------------------------------------------------------");
        System.out.println("after sorting:\n");
        sortByAge(listStaff);


    }

    public static void displayList(ArrayList listStaff) {
        System.out.printf("%-30s%-10s%-10s\n", "Name", "Age", "Gender");
        Iterator<Staff> ite = listStaff.iterator();
        while (ite.hasNext()) {
            ite.next().displayInfo();
        }
    }

    public static void sortByAge(ArrayList<Staff> listStaff) {
        Collections.sort(listStaff, new Comparator<Staff>() {
            @Override
            public int compare(Staff staff1, Staff staff2) {
                return (staff1.getAge() - staff2.getAge());
            }
        });
        ArrayList<Staff> listFemale=new ArrayList<>();
        ArrayList<Staff> listMale=new ArrayList<>();
        ArrayList<Staff> newlistStaff=new ArrayList<>();
        for (int i = 0; i < listStaff.size(); i++) {
            if (listStaff.get(i).getGender().equals("Female")){
                listFemale.add(listStaff.get(i));
            }else listMale.add(listStaff.get(i));

        }
        for (int i = 0; i < listFemale.size(); i++) {
            newlistStaff.add(listFemale.get(i));
        }
        for (int i = 0; i < listMale.size(); i++) {
            newlistStaff.add(listMale.get(i));
        }
        displayList(newlistStaff);
    }
}
