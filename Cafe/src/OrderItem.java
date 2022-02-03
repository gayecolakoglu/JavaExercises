public class OrderItem {
    int amount;
    TeaBeverage tBeverage = null;
    CaffeineBeverage cBeverage = null;

    public OrderItem(TeaBeverage tBeverage, int amount) {
        this.amount = amount;
        this.tBeverage = tBeverage;
    }

    public OrderItem(CaffeineBeverage cBeverage, int amount) {
        this.amount = amount;
        this.cBeverage = cBeverage;
    }

    public int cost() {
        int cost=0;
        if (tBeverage != null) {
            cost=tBeverage.cost()*amount;
        }else{
            cost=cBeverage.cost()*amount;
        }
        return cost;
    }
}

