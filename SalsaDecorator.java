public class SalsaDecorator extends MexiFoodDecorator {
    public SalsaDecorator(MexiFood decoratedFood){
        super(decoratedFood);
    }

    @Override
    String printFood() {
        return super.printFood() + "salsa, ";
    }

    @Override
    Double givePrice() {
        return super.givePrice() + 0.1;
    }
}
