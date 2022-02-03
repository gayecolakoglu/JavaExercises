public class BlackTea extends TeaBeverage {

    public BlackTea(boolean hasLemon, int size)
    {
        super(hasLemon, size,"Black Tea");
    }

    @Override
    public int cost() {
        int cost=0;
        if (hasLemon){
            cost+=1;
        }
        if (size==1){
            cost+=3;
        }else if (size==2){
            cost+=4;
        }else if (size==3){
            cost+=5;
        }
        return cost;
    }
}
