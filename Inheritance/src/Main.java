import java.util.ArrayList;

public class Main {

    public static void main(String[] args){


        ArrayList<Employee> employee = new ArrayList<>();
        employee.add(new Teacher(1700,200));
        employee.add(new Programmer(900,300));
        employee.add(new Driver(1000, 65));

        employee.forEach(Employee::getInfo);
    }


}
