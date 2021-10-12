import javax.sql.StatementEvent;
import java.util.stream.IntStream;

public class Person {

    private String name;
    private int age;
    private int budget;

    public Person( String name1, int age1, int budget1){
        name = name1;
        age = age1;
        budget = budget1;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public int getBudget() {
        return budget;
    }



    public static void main(String[] args) {
        Person p1 = new Person("John", 21, 23000);
        Person p2 = new Person("Steve", 32, 40000);
        Person p3 = new Person("Martin", 16, 2700);



            int[] array = new int[3];
            array[0] = p1.budget;
            array[1] = p2.budget;
            array[2] = p3.budget;

            int sum = IntStream.of(array).sum();
            System.out.println(sum);

        }

    }




