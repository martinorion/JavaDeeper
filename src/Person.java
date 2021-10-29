import javax.sql.StatementEvent;
import java.util.ArrayList;
import java.util.Arrays;
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

    public static void sumBudget(ArrayList<Person> people){
    ArrayList<Integer> budget2 = new ArrayList<>();
    people.forEach(i-> budget2.add(i.budget));
    Integer sumOfBudgets = budget2.stream().reduce(0, (Integer::sum));
    System.out.println("Suma budgetov je: " + sumOfBudgets);
    }

    public static boolean containA(ArrayList<Person> people){
  ArrayList<Person> letter = new ArrayList<>();
  people.stream().filter(a -> a.name.contains("a")).forEach(letter::add);

  if(letter.isEmpty()){
      return false;
  }
  return true;
    }


    public static void main(String[] args) {
        ArrayList<Person> persones = new ArrayList<>();
        persones.add(new Person("John", 21, 23000));
        persones.add(new Person("Steve", 32, 40000));
        persones.add(new Person("Martin", 16, 2700));

        sumBudget(persones);
        System.out.println(containA(persones));
        }

    }




