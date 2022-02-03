public class GreenTea extends TeaBeverage {

    public GreenTea(boolean hasLemon, int size) {
        super(hasLemon, size, "Green Tea");
    }

    @Override
    public int cost() {
        int cost=0;
        if (hasLemon){
            cost+=1;
        }
        if (size==1){
            cost+=4;
        }else if (size==2){
            cost+=5;
        }else if (size==3){
            cost+=6;
        }
        return cost;
    }
}
