import java.util.ArrayList;
import java.util.List;

interface Sayable{
    void say();
}

public class Collections {

   public static void getIntegers(List<Integer> integers) {
       List<Integer> numbers = new ArrayList<>();
       integers.forEach( (n) -> {numbers.add(n);});
       if (numbers.isEmpty()) System.out.println("List je prázdny");
       else System.out.println(numbers);
   }

   public static void addIfNotExist(List<Integer> numbers, int a){

    if(numbers.contains(a)){
        System.out.println("Hodnota už v liste existuje");
    }
   else   {
    numbers.add(a);
    System.out.println("Do listu bolo pridané: " + a);
    System.out.println(numbers);
    }

    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

     getIntegers(numbers);
     addIfNotExist(numbers,6);

      /*  Sayable sayable = Collections::getIntegers;
        sayable.say();
        */
    }




}
