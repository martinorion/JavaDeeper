public class Programmer extends Atributes{

    public Programmer(float salary, int bonus){
        this.salary = salary;
        this.bonus = bonus;
    }


    public void getInfo() {
        System.out.println("Programmer’s salary is " + salary + " and bonus is " + bonus);
    }
}
