

public class Student {

   private String name;
   private int numberOfStudent;
    private int phoneNumber;
    private String address;
    public Student( String name1, int numberOfStudent1, int phoneNumber1, String address1){
        name = name1;
        numberOfStudent = numberOfStudent1;
        phoneNumber = phoneNumber1;
        address = address1;
    }

    public String getName() {
        return name;
    }
    public int numberOfStudent() {
        return numberOfStudent;
    }
    public int phoneNumber() {
        return phoneNumber;
    }
    public String address() {
        return address;
    }

    public static void main(String[] args) {
        Student student1 = new Student("John",12345, 904151000, "Furdekova 88");
        Student student2 = new Student("Sam",54321, 904946566, "Furdekova 8");

   System.out.println(student1.getName() + ": " + student1.numberOfStudent() + ", " + student1.phoneNumber() + ", " + student1.address());
   System.out.println(student2.getName() + ": " + student2.numberOfStudent() + ", " + student2.phoneNumber() + ", " + student2.address());
    }


        }


