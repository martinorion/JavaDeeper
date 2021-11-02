public class Driver extends Atributes{

    public Driver(float salary, int bonus){
    this.salary = salary;
    this.bonus = bonus;
    }

    public void getInfo(){
        System.out.println("Driver’s salary is " + salary + " and bonus is " + bonus);
    }
}
