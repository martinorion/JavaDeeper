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
       else numbers.stream().forEach(n -> System.out.print(n + ", "));
   }

   public static void getIntegersReference(List<Integer> integers){

       if (integers.isEmpty()) System.out.print("List je prazdny");
       else System.out.println(""); integers.forEach(System.out::print);
   }


   public static void addIfNotExist(List<Integer> numbers, int a){

    if(numbers.contains(a)){
        System.out.println("Hodnota už v liste existuje");
    }
   else   {
    numbers.add(a);
    System.out.println("\nDo listu bolo pridané: " + a);
    System.out.println(numbers);
    }

    }

    public static void deleteEvenNumbers(List<Integer> integers){
        List<Integer> numbers = new ArrayList<>();
       for (int i = 0;i < integers.size(); i++){
           if (integers.get(i)%2 != 0){
               numbers.add(integers.get(i));
           }
       }
       System.out.println("Vymazané všetky párne čísla");
        System.out.println(numbers);
    }
    public static void deleteEvenNumbersVersion2(List<Integer> integers){
        for (int i = 0;i < integers.size(); i++){
            integers.removeIf(n -> (n % 2 == 0));
        }
        System.out.println("Vymazané všetky párne čísla");
        System.out.println(integers);
    }
    public static void getEvenNumbers(List<Integer> integers){
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0;i < integers.size(); i++){
            if (integers.get(i)%2 == 0){
                numbers.add(integers.get(i));
            }
        }
        System.out.println("Vypisujem párne čísla z listu");
        System.out.println(numbers);
    }

    public static void multiply(List<Integer> integers){
       ArrayList<Integer> numbers = new ArrayList<>();
       integers.stream().map(x -> x* integers.size()).forEach(numbers::add);
       System.out.println(numbers);
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

        ArrayList<Integer> numbers2 = new ArrayList<Integer>();numbers2.add(1);numbers2.add(1);numbers2.add(1);numbers2.add(2);numbers2.add(2);numbers2.add(3);numbers2.add(4);numbers2.add(5);
        ArrayList<Integer> numbers3 = new ArrayList<Integer>();numbers3.add(1);numbers3.add(2);numbers3.add(3);
     deleteEvenNumbersVersion2(numbers2);
     multiply(numbers3);
     System.out.println("---------------------------------\n");
     getIntegers(numbers);
     getIntegersReference(numbers);
     addIfNotExist(numbers,6);
     deleteEvenNumbers(numbers);
     getEvenNumbers(numbers);

      /*  Sayable sayable = Collections::getIntegers;
        sayable.say();
        */
    }




}
