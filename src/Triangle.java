public class Triangle {

    private int sideA;
    private int sideB;
    private int sideC;
    private int area;
    private int perimeter;

    public Triangle(int sideAa, int sideBa, int sideCa){
        sideA = sideAa;
        sideB = sideBa;
        sideC = sideCa;
    }

    public int getArea() {
        return getArea1();
    }
    private int getArea1(){
        return (sideA * sideB) / 2;
    }
    public int getSideA() {
        return sideA;
    }
    public int getSideB() {
        return sideB;
    }
    public int getSideC() {
        return sideC;
    }
    public int getPerimeter() {
        return getPerimeter1();
    }

    private int getPerimeter1() {
        return sideA + sideB + sideC;
    }

    public static void main(String[] args) {
        Triangle t1 = new Triangle(3,4,5);
        System.out.println(t1.getPerimeter());
        System.out.println(t1.getArea());
    }
}
