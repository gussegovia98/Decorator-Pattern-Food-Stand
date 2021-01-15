public class MexiFactory {

    public MexiFood makeFood(mexiFoodType type){
        if(type == mexiFoodType.TacoM)
            return new Taco();
        else if(type == mexiFoodType.BurritoM)
            return new Burrito();
        else if(type == mexiFoodType.BowlM)
            return new Bowl();
        else
            return null;
    }
}
