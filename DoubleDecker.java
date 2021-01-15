import java.util.ArrayList;

public class DoubleDecker extends MexiFood {
    public ArrayList<MexiFood> Levels = new ArrayList<>();//non recursion but I'm lazy
    DoubleDecker(int NumOfLevels){
        Taco tempTaco = new Taco();
        for(int i=0;i<NumOfLevels;i++) {
            Levels.add(tempTaco);
        }
    }

    @Override
    String printFood() {
        String returnString ="A Double Decker Taco\n";
        for(int i=Levels.size()-1;i>=0;i--){
            int j=i+1;
            returnString+= "level "+j;
            returnString += Levels.get(i).printFood();
            returnString+='\n';
        }
        return returnString;
    }

    @Override
    Double givePrice() {
        int totalPrice =0;
        for(int i=0;i<Levels.size();i++){
            price+=Levels.get(i).givePrice();
        }
        return price;
    }
}
