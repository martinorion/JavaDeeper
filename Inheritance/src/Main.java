enum employment{
    Teacher,
    Programmer,
    Driver

}
public class Main {

    public static void main(String[] args){
        Teacher teacher = new Teacher(1700,200);
        teacher.getInfo();

        Programmer programmer = new Programmer(900,300);
        programmer.getInfo();

          Driver driver = new Driver(1000, 65);
          driver.getInfo();


       /* Zatiaľ neviem či enum takto

        employment a = employment.Teacher;
        switch(a) {
            case Teacher:
               Teacher.getInfo();
                break;
            case Programmer:
                Programmer.getInfo();
                break;
            case Driver:
                Driver.getInfo();
                break;
        }
          */

    }

}
