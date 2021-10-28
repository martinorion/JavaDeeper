import java.util.ArrayList;
import java.util.Collections;

public class Warrior {
    private String name;
    private int life;
    private int speed;
    private int muscle;
    private ArrayList<Item> items;

    public Warrior(String name, int life, int speed, int muscle,  ArrayList<Item> items) {
        this.name = name;
        this.life = life;
        this.speed = speed;
        this.muscle = muscle;
        this.items = items;
    }


    @Override
    public String toString() {
        return name + " " + life + " " + speed + " " + muscle + " " + items;
    }
    public int force(){

        return life + speed + muscle;
    }

    /* public static void battle1(Warrior warrior1, Warrior warrior2){
        if(warrior2.force() > warrior1.force()){
            warrior1.life = warrior1.life-1;
            System.out.println(warrior1.name + " " + warrior1.life + " " + warrior1.speed + warrior1.muscle + warrior1.items);
        }
        else if(warrior1.force() > warrior2.force()){
            warrior2.life = warrior2.life-1;
             System.out.println(warrior2.name + " lose, life - 1 " + warrior2.name + " " + warrior2.life + " " + warrior2.speed + " " + warrior2.muscle + warrior2.items);
        }
    } */

    public static void battle(Warrior warrior1, Warrior warrior2){
        if(warrior2.force() > warrior1.force()){
           if(warrior1.items.size() >= 1) {
               warrior2.items.add(warrior1.items.get(0));
               warrior1.items.remove(0);
               warrior1.life = warrior1.life -1;
           }
        }
        else if(warrior1.force() > warrior2.force()){
            if(warrior2.items.size() >= 1){
                warrior1.items.add(warrior2.items.get(0));
                warrior2.items.remove(0);
                warrior2.life = warrior2.life -1;
            }
        }
    }

    public static void main(String[] args) {
      ArrayList<Item> itemsOfWarrior1 = new ArrayList<Item>(){};
        itemsOfWarrior1.add(new Item("Sword of Khy'at", 83));
        itemsOfWarrior1.add(new Item("Shield", 68));
        ArrayList<Item> itemsOfWarrior2 = new ArrayList<Item>(){};
        itemsOfWarrior2.add(new Item("Music fortisimo", 80));
        itemsOfWarrior2.add(new Item("Neck crusher", 77));
        itemsOfWarrior2.add(new Item("Music dividuendo", 34));



        Warrior x = new Warrior("Maxxor", 10, 4, 7, itemsOfWarrior1 );
        Warrior y = new Warrior("Chaor",9,5,3, itemsOfWarrior2);
        System.out.println(x);
        System.out.println(y);
       /* battle1(x,y);
        System.out.println(y); */
         battle(x, y);
         System.out.println("\nBattle:\n");
        System.out.println(x);
         System.out.println(y);


    }
}
