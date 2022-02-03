public class LindenTea extends TeaBeverage {

    public LindenTea(boolean hasLemon, int size) {
        super(hasLemon, size,"Linden Tea");
    }

    @Override
    public int cost(){
        int cost=0;
        if (hasLemon){
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
