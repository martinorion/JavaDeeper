import java.util.ArrayList;
import java.util.List;

public class Collections {

   public static void getIntegers(List<Integer> integers) {
       List<Integer> numbers = new ArrayList<>();
       integers.forEach( (n) -> {numbers.add(n);});
       if (numbers.isEmpty()) System.out.println("List je prázdny");
       else System.out.println(numbers);
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
    }
}
