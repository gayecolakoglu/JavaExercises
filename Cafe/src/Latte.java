public class Latte extends CaffeineBeverage {

    public Latte(boolean hasMilk, int size) {
        super( hasMilk,size,"Latte");
    }

    @Override
    public int cost() {
        int cost=0;
        if (hasMilk){
            cost+=1;
        }
        if (size==1){
            cost+=5;
        }else if (size==2){
            cost+=6;
        }else if (size==3){
            cost+=7;
        }
        return cost;
    }
}
