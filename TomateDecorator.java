public class TomateDecorator extends MexiFoodDecorator{
    public TomateDecorator(MexiFood decoratedFood){
        super(decoratedFood);
    }

    @Override
    String printFood() {
        return super.printFood() + "tomato, ";
    }

    @Override
    Double givePrice() {
        return super.givePrice() + 0.2;
    }
}
