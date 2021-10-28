public class Item {
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
