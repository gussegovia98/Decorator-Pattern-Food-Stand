import java.util.ArrayList;

public class Orders extends MexiFood {
    private ArrayList<MexiFood> orders = new ArrayList<>();
    public double totalPrice;

    @Override
    public String printFood() {
        //
        String returnString="";
        totalPrice =0;
        groupOption a = new groupOption();
        for(MexiFood food:orders){
            returnString += food.printFood();
            if(food.Extra!=null) {
                returnString = returnString.replaceFirst(food.Extra, "");
                returnString = returnString.replaceFirst(food.Extra, "extra tomatoes, ");
            }

            if(food.getClass()==a.getClass()){
                totalPrice +=food.givePrice();
            }
            else {
                totalPrice += food.givePrice();
            }
            returnString+="\n";
            //returnString+= "";
        }
        return returnString;
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
