public class BrownRiceDecorator extends MexiFoodDecorator {
    public BrownRiceDecorator(MexiFood decoratedFood){
        super(decoratedFood);
    }

    @Override
    String printFood() {
        return super.printFood() + "brown rice, ";
    }

    @Override
    Double givePrice() {
        return super.givePrice() + 0.2;
    }
}
