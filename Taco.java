public class Taco extends MexiFood {
    Taco(){
        price=7.30;
    }
    @Override
    public String printFood() {
        return "\nA taco with ";
    }

    @Override
    Double givePrice() {
        return price;
    }
}