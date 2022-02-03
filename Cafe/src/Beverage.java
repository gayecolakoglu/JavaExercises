public abstract class Beverage {
    public static int  SMALL =1;
    public static int MEDIUM =2;
    public static int LARGE=3;
    int size;
    String name;

    public Beverage(int size, String name) {
        this.size = size;
        this.name = name;
    }
    public abstract int cost();
}
