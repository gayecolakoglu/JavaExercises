public class Americano extends CaffeineBeverage {

    public Americano(boolean hasMilk, int size)
    {
        super(hasMilk, size, "Americano");
    }

    @Override
    public int cost() {
        int cost=0;
        if (hasMilk){
            cost+=1;
        }
        if (size==1){
            cost+=7;
        }else if (size==2){
            cost+=8;
        }else if (size==3){
            cost+=9;
        }
        return cost;
    }
}
