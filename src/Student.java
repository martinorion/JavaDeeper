

public class Student {

   String name1;
   int numberOfStudent1;
    int phoneNumber1;
    String address1;
    public Student( String name, int numberOfStudent, int phoneNumber, String address){
        name1 = name;
        numberOfStudent1 = numberOfStudent;
        phoneNumber1 = phoneNumber;
        address1 = address;
    }

    public static void main(String[] args) {
        Student student1 = new Student("John",12345, 904151000, "Furdekova 88");
        Student student2 = new Student("Sam",54321, 904946566, "Furdekova 8");

   System.out.println(student1.name1 + ": " + student1.numberOfStudent1 + ", " + student1.phoneNumber1 + ", " + student1.address1);
   System.out.println(student2.name1 + ": " + student2.numberOfStudent1 + ", " + student2.phoneNumber1 + ", " + student2.address1);
    }


        }


