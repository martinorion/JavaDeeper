package Model;

import Model.Employee;

public class Programmer extends Employee {

    public Programmer(float salary, int bonus){
        super(EmployeeType.Programmer, salary,bonus);
    }
    private final float sumSalary = salary + bonus;

    public void getInfo(){
       System.out.println(employeeType + "’s salary is " + sumSalary);
    }
}
