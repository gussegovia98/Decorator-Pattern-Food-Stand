public class SteakDecorator extends MexiFoodDecorator {
    public SteakDecorator(MexiFood decoratedFood){
        super(decoratedFood);
    }

    @Override
    String printFood() {
        return super.printFood() + "carne asada, ";
    }

    @Override
    Double givePrice() {
        return super.givePrice() + 0.4;
    }
}
