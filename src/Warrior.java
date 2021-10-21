public class Warrior {
    String name;
    int life;
    int speed;
    int muscle;
    Item items;

    public Warrior(String name, int life, int speed, int muscle, Item items) {
        this.name = name;
        this.life = life;
        this.speed = speed;
        this.muscle = muscle;
        this.items = items;
    }

    public static class Item {
        String name;
        int value;

        @Override
        public String toString() {
            return  name + " " + value;
        }

        public Item(String name, int value){
            this.name = name;
            this.value = value;
        }
    }

    @Override
    public String toString() {
        return name + " " + life + " " + speed + " " + muscle + " " + items;
    }
    public int force(){

        return life + speed + muscle;
    }

    public static int battle(Warrior warrior1, Warrior warrior2){
        if(warrior1.force() > warrior2.force()){
            return warrior2.life-1 + warrior2.speed + warrior2.muscle;
        }
        return warrior1.life-1 + warrior1.speed + warrior1.muscle;
    }

    public static void main(String[] args) {
        Item a = new Item("Broke a neck", 12);
        Item b = new Item("Horse", 13);
        Warrior x = new Warrior("Matko", 10, 4, 7, a);
        Warrior y = new Warrior("Misko",9,5,3, b);
        System.out.println(x);
        System.out.println(y);
        System.out.println(battle(x,y));
        System.out.println(y);
    }
}
