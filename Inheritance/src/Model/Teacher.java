package Model;

import Model.Employee;

public class Teacher extends Employee {

    public Teacher(float salary, int bonus){
        super(EmployeeType.TEACHER, salary,bonus);
    }
    }

