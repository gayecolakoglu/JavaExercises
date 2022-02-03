public class Cappucino extends CaffeineBeverage {

    public Cappucino(boolean hasMilk, int size) {
        super(hasMilk, size, "Cappucino");
    }

    @Override
    public int cost() {
        int cost=0;
        if (hasMilk){
            cost+=1;
        }
        if (size==1){
            cost+=6;
        }else if (size==2){
            cost+=7;
        }else if (size==3){
            cost+=8;
        }
        return cost;
    }
}
