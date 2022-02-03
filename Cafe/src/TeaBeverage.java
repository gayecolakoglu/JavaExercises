public abstract class TeaBeverage extends Beverage {
    boolean hasLemon;
    public TeaBeverage(boolean hasLemon,int size, String name) {
        super(size, name);
        this.hasLemon=hasLemon;
    }

    @Override
    public abstract int cost();
}
