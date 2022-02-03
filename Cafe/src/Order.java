import java.util.ArrayList;

public class Order {
    ArrayList<OrderItem> items = new ArrayList<>();

    public void add(OrderItem orderItem){
        items.add(orderItem);
    }
    public int totalCost(){
        int tcost=0;
        for (int i =0; i<items.size(); i++){
            OrderItem orderItem=items.get(i);
            tcost+=orderItem.cost();
        }
        return tcost;
    }

    @Override
    public String toString() {
        String answer="";
        for (int i =0; i<items.size(); i++){
            OrderItem orderItem=items.get(i);
            int amount=orderItem.amount;
            String size="";
            String name="";
            String with="";
            int price=orderItem.cost();

            CaffeineBeverage cb = orderItem.cBeverage;
            if (cb!=null){
                if (cb.size==1){
                    size="Small";
                }else if (cb.size==2){
                    size="Medium";
                }else {
                    size="Large";
                }
                name=cb.name;
                with=cb.hasMilk ? "with Milk" : "without Milk";
            }else {
                TeaBeverage tb = orderItem.tBeverage;
                if (tb.size==1){
                    size="Small";
                }else if (tb.size==2){
                    size="Medium";
                }else {
                    size="Large";
                }
                name=tb.name;
                with=tb.hasLemon? "with Lemon" :"without Lemon";
            }
            answer+=amount+" "+size+" "+name+" "+with+" "+price+" TL \n";
        }
        answer+="TOTAL : "+totalCost()+" TL";
        return answer;
    }

}
