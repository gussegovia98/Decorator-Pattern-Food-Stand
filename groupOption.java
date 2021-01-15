import java.util.ArrayList;

public class groupOption extends MexiFood {
    private ArrayList<MexiFood> orders = new ArrayList<>();
    public double totalPrice;

    @Override
    public String printFood() {
        //
        String returnString="";
        totalPrice =0;
        for(MexiFood food:orders){
            returnString += food.printFood();
            totalPrice+=food.givePrice();
            //returnString+= "";
        }
        return returnString;
    }

    @Override
    Double givePrice() {
        return totalPrice;
    }

    public void addFood(MexiFood order){
        orders.add(order);
    }
    public MexiFood getOrder(int i){
        return orders.get(i);
    }
    public void SetObjFood(int i, MexiFood food){
        orders.set(i,food);
    }


}
