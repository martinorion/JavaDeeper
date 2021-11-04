
public abstract class Employee {
    float salary;
    int bonus;
    EmployeeType employeeType;

    public Employee(EmployeeType employeeType, float salary, int bonus){
        this.employeeType = employeeType;
        this.salary = salary;
        this.bonus = bonus;
    }

    public void getInfo(){
        System.out.println(employeeType + "’s salary is " + salary + " and bonus is " + bonus);
    }
}
