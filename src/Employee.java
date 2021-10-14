import java.util.Date;

public class Employee {

    private JobPosition a;
    private String name;
    private String surname;
    Date date;

    public String getName() {
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public Date getDateOfBirth() {
        return date;
    }



    public Employee(String name1, String surname1, Date dateOfBirth1, JobPosition b) {
      name = name1;
      surname = surname1;
      date = dateOfBirth1;
      a = b;
    }



  /*  @Override
    public String toString() {
        return "Employee{" +
                "a=" + a +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", date=" + date +
                '}';
    }
*/
  @Override
  public String toString() {
      return a +
               name +
              ", " + surname + ", " +
              date + " "
              ;
  }

    public static class JobPosition {
        private String name;
        private int salary;

        /*   @Override
           public String toString() {
               return "JobPosition{" +
                       "name='" + name + '\'' +
                       ", salary=" + salary +
                       '}';
           }  alt+ insert + toString
   */
        @Override
        public String toString() {
            return  name + ", " +
                    salary + " " +
                    "eur" + ", ";
        }

        public int getSalary(){
            return salary;
        }
        public String getName(){
            return name;
        }
        public JobPosition(String name1, int salary1){
            name = name1;
            salary = salary1;
        }
    }

    public static void main(String[] args) {


        Employee a = new Employee("Martin","Dela-Robia", new Date("4/9/1990"),  new JobPosition("It Programer", 2001));

        System.out.println(a);
    }
}
