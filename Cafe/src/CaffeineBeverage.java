public abstract class CaffeineBeverage extends Beverage {
    boolean hasMilk;
    public CaffeineBeverage(boolean hasMilk, int size, String name) {
        super(size, name);
        this.hasMilk=hasMilk;
    }

    @Override
    public abstract int cost();
}
